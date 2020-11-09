import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {
    private String originalString;
    public ReverseString(String originalString){
        this.originalString=originalString;
    }
    public String reverseString(){
        String[] arrayList = originalString.split("");
        for(int i =0;i<arrayList.length;i++){
            int l = i;
            int r = Math.min(i+4-1,arrayList.length-1);
            String t;
            while (l<r){
                t = arrayList[l];
                arrayList[l]=arrayList[r];
                arrayList[r]=t;
                l+=1;
                r-=1;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayList.length; i++)
        stringBuffer.append(arrayList[i]);
        return stringBuffer.toString();
    }
}
