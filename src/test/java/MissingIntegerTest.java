import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MissingIntegerTest {
    @Test
    public void getSize_returnLengthOfArray_4(){
        int[] arrayIntegers = {1,2,3,4,5};
        MissingInteger missingInteger = new MissingInteger(arrayIntegers);
        assertEquals(5,missingInteger.getLengthArrayIntegers());
    }
    @Test
    public void getMissingInteger_returnMissingInteger_2(){
        int[] arrayIntegers = {1,3,4,5};
        MissingInteger missingInteger = new MissingInteger(arrayIntegers);
        assertEquals(2,missingInteger.getMissingNumber());
    }
}