import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if(array == null)
            return null;
        ArrayList<Integer> list = new ArrayList();
        int i = 0;
        int j = array.length-1;
        while(i<j){
            if(array[i]+array[j]<sum){
                i++;
            }
            else if(array[i]+array[j]>sum){
                j--;
            }
            else if(array[i]+array[j]==sum){
                list.add(array[i]);
                list.add(array[j]);
                break;
            }
        }
        return list;
    }
}