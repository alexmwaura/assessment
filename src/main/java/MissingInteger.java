import java.util.ArrayList;

public class MissingInteger {
    private int[]arrayIntegers;
    public MissingInteger(int[]arrayIntegers){
        this.arrayIntegers=arrayIntegers;
    }
    public  int getMissingNumber(){
        int total = 1,length = arrayIntegers.length;
        for (int i = 2; i <= (length + 1); i++)
        {
            total += i;
            total -= arrayIntegers[i - 2];
        }
        return total;
    }
}
