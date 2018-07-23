import java.util.ArrayList;

public class Solution {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> arrayListOdd = new ArrayList();
        ArrayList<Integer> arrayListEven = new ArrayList();
        for(int i =0;i<array.length;i++){
            if(array[i]%2==0)
                arrayListEven.add(array[i]);
            else
                arrayListOdd.add(array[i]);
        }

        for(int i = 0;i<arrayListOdd.size();i++){
            array[i] = arrayListOdd.get(i);
        }
        for (int j = 0; j < arrayListEven.size(); j++) {
            array[j+arrayListOdd.size()] = arrayListEven.get(j);
        }
    }
}