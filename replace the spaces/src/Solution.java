public class Solution {
    public String replaceSpace(StringBuffer str) {
        String res = "";
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i)!=' ')
                res = res + str.charAt(i);
            else
                res = res + "%20";
        }
        return res;
    }
}