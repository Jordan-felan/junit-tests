import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MyFirstTest {
    public static String codeup(){
        return "Codeup";
    }



    @Test

    public void testIfHelloWorldWorks() {
        String expected = "Codeup";

        assertEquals(expected, MyFirstTest.codeup());
        assertNotEquals(null, MyFirstTest.codeup());
    }

    @Test
        public void arrayTest(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void trueTest(){
        String language = "PHP";
        assertTrue(String.valueOf(language.contains("H")), true);
        assertFalse(String.valueOf(language.contains("J")), false);

//        language.contains("H");
//        language.contains("J");
    }





}

