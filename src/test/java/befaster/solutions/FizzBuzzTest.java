package befaster.solutions;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFizz() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("fizz", FizzBuzz.fizzBuzz(9));
        assertEquals("fizz", FizzBuzz.fizzBuzz(32));
        assertEquals("fizz", FizzBuzz.fizzBuzz(3467));
        assertEquals("fizz", FizzBuzz.fizzBuzz(9993));
        assertEquals("fizz", FizzBuzz.fizzBuzz(9999));
    }

    @Test
    public void testBuzz() {
        assertEquals("buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("buzz", FizzBuzz.fizzBuzz(20));
    }

    @Test
    public void testMultiple3And5() {
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(15));
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(30));
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(45));
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(3355));
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(7357));
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(5331));
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(9957));
    }

    @Test
    public void testNotMultiple3And5() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNumberZero() {
        FizzBuzz.fizzBuzz(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidNumber10000() {
        FizzBuzz.fizzBuzz(10000);
    }

    @Test
    public void testGenericTest() {
        for (int i = 1; i < 9999; i++) {
            assertEquals(getFizzBuzz(i), FizzBuzz.fizzBuzz(i));
        }
    }

    private String getFizzBuzz (Integer number) {
        boolean isFizz = number % 3 == 0 || number.toString().contains("3");
        boolean isBuzz = number % 5 == 0 || number.toString().contains("5");
//        boolean isDeluxe = number > 10 && ;

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

    public testElementsIdentical() {
        assertTrue()
        FizzBuzz.isIdentical(8888);
    }
}