import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList();
        if(k>input.length||input==null||k<=0)
            return list;
        Arrays.sort(input);
        for(int i = 0;i<k;i++){
            list.add(input[i]);
        }
        return list;
    }
}