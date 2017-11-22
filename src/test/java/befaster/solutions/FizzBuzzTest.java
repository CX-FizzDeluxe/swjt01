package befaster.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testMultiple3() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("fizz", FizzBuzz.fizzBuzz(9));
        assertEquals("fizz", FizzBuzz.fizzBuzz(9999));
    }

    @Test
    public void testMultiple5() {
        assertEquals("buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("buzz", FizzBuzz.fizzBuzz(20));
    }

    @Test
    public void testMultiple3And5() {
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(15));
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(30));
        assertEquals("fizz buzz", FizzBuzz.fizzBuzz(45));
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

}
