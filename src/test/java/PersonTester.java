import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTester {

    @Test
    public void testPerson() {
        Person dave = new Person("Dave");
        Person dave2 = new Person("Dave");

        assertEquals("Dave", dave.getName());
//        assertSame(dave, dave2);

    }

    @Test
    public void arrayTest(){
        int[] arrayOfInts = {1,2,3,4};
        int[] yetMoreInts = {1,2,3,4};

//        assertEquals(arrayOfInts, yetMoreInts);
        assertArrayEquals(arrayOfInts, yetMoreInts);
    }

}
