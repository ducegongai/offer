public class Solution {
    public boolean isNumeric(char[] str) {
        boolean sign = false,hasE = false,decimal = false;
        for (int i = 0; i < str.length; i++) {
            if(str[i]=='+'||str[i]=='-'){
                if(i == str.length-1)
                    return false;
                if(sign && i> 0 && str[i-1] != 'e'&&str[i-1] != 'E')
                    return false;
                if(!sign && i > 0 && str[i-1] != 'e'&&str[i-1] != 'E' )
                    return false;
                sign  = true;
        }
            else if(str[i]=='e'||str[i]=='E'){
                if(hasE)
                    return false;
                if(i == str.length-1)
                    return false;
                hasE = true;
            }
            else if(str[i] == '.'){
                if(decimal)
                    return false;
                if(hasE)
                    return false;
                if(i == str.length-1)
                    return false;
                decimal = true;
            }
            else if (str[i]<'0'||str[i]>'9')
                return false;
        }
        return true;
    }
}