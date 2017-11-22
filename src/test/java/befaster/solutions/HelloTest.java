package befaster.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testHelloWorld() {
        assertEquals("Hello, John!", Hello.hello("John"));
    }

    @Test
    public void testHelloWorldNull() {
        assertEquals(null, Hello.hello(null));
    }

    @Test
    public void testHelloWorldEmpty() {
        assertEquals(null, Hello.hello(""));
    }

}