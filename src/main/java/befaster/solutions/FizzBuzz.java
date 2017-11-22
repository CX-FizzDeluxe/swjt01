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
        boolean isDeluxe = number > 10 && isIdentical(number);
        if (isDeluxe && isFizz && isBuzz) {
            return "fizz buzz deluxe";
        }
        if (isDeluxe) {
            return "deluxe";
        }
        if (isFizz && isBuzz) {
            return "fizz buzz";
        }
        if (isFizz) {
            return "fizz";
        }

        if (isBuzz) {
            return "buzz";
        }

        return number.toString();
    }

    public static boolean isIdentical(Integer number) {

        return Arrays.asList(number.toString().toCharArray()).stream().distinct().limit(2).count() <= 1;
    }
}
