package befaster.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testHelloWorld() {
        assertEquals("Hello, World!", Hello.hello("Hello World"));
    }

    @Test
    public void testHelloWorldNull() {
        assertEquals("Hello, World!", Hello.hello(null));
    }

    @Test
    public void testHelloWorldEmpty() {
        assertEquals("Hello, World!", Hello.hello(""));
    }

    @Test
    public void testRealScenario() {
        assertEquals("Hello, World!", Hello.hello("Craftsman"));
        assertEquals("Hello, World!", Hello.hello("Mr. X"));

    }
}