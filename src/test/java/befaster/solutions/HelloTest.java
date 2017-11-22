package befaster.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloTest {

    @Test
    public void testHelloWorld() {
        assertEquals("Hello World", Hello.hello("Hello World"));
    }

    @Test
    public void testHelloWorldNull() {
        assertEquals(null, Hello.hello(null));
    }

    @Test
    public void testHelloWorldEmpty() {
        assertEquals("", Hello.hello(""));
    }

}