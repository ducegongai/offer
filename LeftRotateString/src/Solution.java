import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0||str.length()==1)
            return str;
        char[] tmp = str.toCharArray();
        reverse(tmp,0,n-1);
        reverse(tmp,n,tmp.length-1);
        reverse(tmp,0,tmp.length-1);
        String res = new String(tmp);
        return res;
    }
    public static void reverse(char[] input,int left,int right){
        if(input== null)
            return;
        char tmp = ' ';
        while(left<right){
            tmp = input[left];
            input[left] = input[right];
            input[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String tmp = "abcdefg";
        char[] test = tmp.toCharArray();
        Solution solution = new Solution();
        String res = solution.LeftRotateString(tmp,2);
        System.out.println(res);


    }
}