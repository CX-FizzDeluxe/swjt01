package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class Sum {

    public static int sum(int x, int y) {
        if (x < 0 || x > 100)
            throw new IllegalArgumentException("number invalid" +x);
        if (y < 0 || y > 100)
            throw new IllegalArgumentException("number invalid" +y);

        return x + y;
    }

}
