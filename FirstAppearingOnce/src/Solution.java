import java.util.HashMap;

public class Solution {
    //Insert one char from stringstream
    String str = "";
    public void Insert(char ch)
    {
        str = str + ch ;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] charArray = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap();
        for (int i = 0; i < charArray.length; i++) {
            if(map.containsKey(charArray[i]))
                map.put(charArray[i],map.get(charArray[i])+1);
            else
                map.put(charArray[i],1);
        }
        for (int i = 0; i < charArray.length; i++) {
            if(map.get(charArray[i])==1)
                return charArray[i];
        }
        return '#';
    }
}