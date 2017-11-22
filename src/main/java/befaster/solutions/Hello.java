package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

import java.text.MessageFormat;

public class Hello {
    public static String hello(String friendName) {
        if (friendName != null && "".equals(friendName)) {
            return MessageFormat.format("Hello, {0}!", friendName);
        }
        return null;
    }
}
