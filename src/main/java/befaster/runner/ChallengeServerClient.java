package befaster.runner;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class ChallengeServerClient {
    private final Logger LOG = LoggerFactory.getLogger(ChallengeServerClient.class);
    private String url;
    private String base64JourneyId;
    private int port = 8222;
    private String acceptHeader;

    public static final String DONE_ENDPOINT = "done";
    public static final String CONTINUE_ENDPOINT = "continue";
    public static final String PAUSE_ENDPOINT = "pause";
    public static final String START_ENDPOINT = "start";
    private static final String UTF_8 = "UTF-8";
    static final String JOURNEY_PROGRESS_ENDPOINT = "journeyProgress";
    static final String AVAILABLE_ACTIONS = "availableActions";


    ChallengeServerClient(String url, String base64JourneyId, boolean disableColours) {
        this.url = url;
        this.base64JourneyId = base64JourneyId;
        this.acceptHeader = disableColours ? "text/not-coloured" : "text/coloured";
    }

    public String sendAction(String name) throws IOException, UnirestException, ClientErrorException, ServerErrorException, OtherServerException {
        String encodedPath = URLEncoder.encode(this.base64JourneyId, "UTF8");
        String url = String.format("http://%s:%d/action/%s", this.url, port, encodedPath);
        HttpResponse<String> actionResponse =  Unirest.post(url)
                .header("accept", this.acceptHeader)
                .header("charset", "UTF8")
                .asString();
        LOG.debug("post request for action \"" + name + "\" was sent, response status is: "
                +actionResponse.getStatus()+" - " + actionResponse.getStatusText());

        int responseInt = actionResponse.getStatus();
        if (isClientError(responseInt)) {
            throw new ClientErrorException();
        } else if (isServerError(responseInt)) {
            throw new ServerErrorException();
        } else if (isOtherErrorResponse(responseInt)) {
            throw new OtherServerException();
        }
        return actionResponse.getBody().trim();
    }

    private boolean isOtherErrorResponse(int responseInt) {
        return responseInt < 200 || responseInt > 300;
    }

    private boolean isServerError(int responseInt) {
        return responseInt >= 500 && responseInt < 600;
    }

    private boolean isClientError(int responseInt) {
        return responseInt >= 400 && responseInt < 500;
    }

    String getJourneyProgress() throws UnsupportedEncodingException, UnirestException {
        return get(JOURNEY_PROGRESS_ENDPOINT);
    }

    String getAvailableActions() throws UnsupportedEncodingException, UnirestException {
        return get(AVAILABLE_ACTIONS);
    }

    String get(String name) throws UnsupportedEncodingException, UnirestException {
        String encodedPath = URLEncoder.encode(this.base64JourneyId, UTF_8);
        String url = String.format("http://%s:%d/%s/%s", this.url, port, name, encodedPath);
        return getStringResponse(url);
    }

    private String getStringResponse(String url) throws UnirestException {
        LOG.debug("Sending GET request to url " + url);
        HttpResponse<String> response = Unirest.get(url)
                .header("accept", this.acceptHeader)
                .header("charset", UTF_8)
                .asString();
        String responseString = response.getBody();
        LOG.debug("Response Status = " + response.getStatus());
        LOG.debug("Receives response: " + responseString);
        return responseString.trim();
    }

    class ServerErrorException extends Exception {
    }

    class OtherServerException extends Exception {
    }

    class ClientErrorException extends Exception {
    }
}
