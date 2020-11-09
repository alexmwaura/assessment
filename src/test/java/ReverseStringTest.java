import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void reverseString_returnReversedString_String(){
         ReverseString reverseString=new ReverseString("Hello");
         String reversedString = "lolHe";
         assertEquals(reversedString,reverseString.reverseString());
    }
}