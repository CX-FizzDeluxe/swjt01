package befaster.solutions;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFizz() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("fizz", FizzBuzz.fizzBuzz(9));
        assertEquals("fizz", FizzBuzz.fizzBuzz(32));
        assertEquals("fizz", FizzBuzz.fizzBuzz(3467));
        assertEquals("fizz", FizzBuzz.fizzBuzz(9993));
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
    public void testElementsIdentical() {
        assertTrue(FizzBuzz.isIdentical(8888));
        assertFalse(FizzBuzz.isIdentical(20));
        assertTrue(FizzBuzz.isIdentical(77));
        assertTrue(FizzBuzz.isIdentical(33));
        assertTrue(FizzBuzz.isIdentical(9999));
    }

    @Test
    public void testFizzOddDeluxe() {
        assertTrue(FizzBuzz.fizzBuzz(33).contains("fake"));
        assertTrue(FizzBuzz.fizzBuzz(3).contains("fake"));
        assertTrue(FizzBuzz.fizzBuzz(39).contains("fake"));
    }

    @Test
    public void testBuzzOddDeluxe() {
        assertTrue(FizzBuzz.fizzBuzz(45).contains("fake"));
        assertTrue(FizzBuzz.fizzBuzz(55).contains("fake"));
        assertTrue(FizzBuzz.fizzBuzz(105).contains("fake"));
    }

    @Test
    public void testFizzBuzzDeluxe() {
        assertFalse(FizzBuzz.fizzBuzz(36).contains("fake"));
        assertFalse(FizzBuzz.fizzBuzz(30).contains("fake"));
    }

}