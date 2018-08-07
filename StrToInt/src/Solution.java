public class Solution {
    public int StrToInt(String str) {
        int sign ;
        int sum = 0;
        if(str == null||str.length()==0)
            return 0;
        char[] array = str.toCharArray();
        if(array[0]=='-')
            sign = 1;
        else
            sign = 0;
        for (int i = sign; i < str.length(); i++) {
            if(array[i]=='+')
                continue;
            if(array[i]<49||array[i]>57)
                return 0;
            sum = sum * 10 + array[i]-48;
        }
        return sign==0?sum:sum*-1;
    }
}