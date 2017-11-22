package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if (number < 1 || number > 9999) {
            throw new IllegalArgumentException("number invalid");
        }
        boolean multiple3 = number%3 == 0;
        boolean multiple5 = number%5 == 0;
        if (multiple3 && multiple5) {
            return "fizz buzz";
        } else if (multiple3) {
            return "fizz";
        } else if (multiple5) {
            return "buzz";
        } else {
            return number.toString();
        }
    }

}
