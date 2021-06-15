import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test(expected = IllegalArgumentException.class)
    public void testIfHelloWorldWorks(){
        String expected = "Hello, World!";
        String expectedJordan = "Hello, Jordan!";


        assertEquals(expectedJordan, HelloWorld.hello("Jordan"));
        assertNotEquals(null, HelloWorld.hello());
        assertNotEquals(null, HelloWorld.hello(null));

        assertEquals(expected, HelloWorld.hello());
    }

}
