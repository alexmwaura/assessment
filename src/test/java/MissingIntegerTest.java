import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MissingIntegerTest {
    @Test
    public void getMissingInteger_returnMissingInteger_6(){
        int[] arrayIntegers = {1,2,3,4,5,7};
        MissingInteger missingInteger = new MissingInteger(arrayIntegers);
        assertEquals(6,missingInteger.getMissingNumber());
    }
}