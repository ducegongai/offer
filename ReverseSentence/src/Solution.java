import java.util.Arrays;

public class Solution {
    public String ReverseSentence(String str) {

        if(str.trim().equals(""))
            return str;
        String [] tmp = str.split(" ");
        StringBuilder bd = new StringBuilder();
        for (int i = tmp.length-1;i>=0;i--) {
            bd.append(tmp[i]);
            if(i>0)
                bd.append(' ');
        }
            return bd.toString();
    }
}