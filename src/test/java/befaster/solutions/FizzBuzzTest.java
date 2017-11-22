package befaster.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testMultiple3() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("fizz", FizzBuzz.fizzBuzz(9));
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

}