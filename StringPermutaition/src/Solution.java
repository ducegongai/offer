import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList();
        if(str==null||str.length()==0)
            return res;
        PermutationHelper(str.toCharArray(),0,res);
        Collections.sort(res);
        return res;
    }

    public void PermutationHelper(char[] cs,int i,ArrayList<String> list){
        if(i == cs.length-1){
            String tmp = String.valueOf(cs);
            if(!list.contains(tmp))
                list.add(tmp);
        }
        else{
            for(int j = i;j<cs.length;j++){
                swap(cs,i,j);
                PermutationHelper(cs,i+1,list);
                swap(cs,i,j);
            }
        }
    }
    public void swap(char[] cs,int i,int j){
        char tmp ;
        tmp = cs[j];
        cs[j] = cs[i];
        cs[i] = tmp;

    }
}