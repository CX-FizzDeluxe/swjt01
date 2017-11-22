package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

import java.util.Arrays;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if (number < 1 || number > 9999) {
            throw new IllegalArgumentException("number invalid");
        }
        boolean multiple3 = number%3 == 0;
        boolean multiple5 = number%5 == 0;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");
        boolean isFizz = multiple3 || contains3;
        boolean isBuzz = multiple5 || contains5;
        if (isFizz && isBuzz) {
            return "fizz buzz";
        } else if (isFizz) {
            return "fizz";
        } else if (isBuzz) {
            return "buzz";
        } else {
            return number.toString();
        }
    }

    public static boolean isIdentical(Integer number) {
        return Arrays.asList(number.toString().toCharArray()).stream().distinct().count() == 1;
    }
}
