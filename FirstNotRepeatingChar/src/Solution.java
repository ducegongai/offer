import java.util.HashMap;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str==null)
            return -1;
        HashMap<Character,Integer> map = new HashMap();
        for(int i =0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);

            }

            else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }
        System.out.println(map);
        for (int i = 0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println(map.get(str.charAt(i)));
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String input = "google";
        Solution solution = new Solution();
        int res = solution.FirstNotRepeatingChar(input);
        System.out.println(res);

    }
}