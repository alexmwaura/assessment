import java.util.ArrayList;

public class MissingInteger {
    private int[]arrayIntegers;
    public MissingInteger(int[]arrayIntegers){
        this.arrayIntegers=arrayIntegers;
    }
    public int getLengthArrayIntegers(){
        return arrayIntegers.length;
    }
    public int[] getArrayIntegers(){
        return arrayIntegers;
    }
    public  int getMissingNumber(){
        int total = 1,length = getLengthArrayIntegers();
        for (int i = 2; i <= (length + 1); i++)
        {
            total += i;
            total -= getArrayIntegers()[i - 2];
        }
        return total;
    }
}
