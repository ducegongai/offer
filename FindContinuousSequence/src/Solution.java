import java.util.ArrayList;
public class Solution {
    ArrayList<ArrayList<Integer>>res = new ArrayList<>();
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        for (int n = (int)Math.sqrt(2*sum);n>=2;n--){
            if(((n&1)==1&&sum%n==0)||((sum%n)*2==n)){
                ArrayList<Integer> list = new ArrayList();
                for(int i = 0,k = sum/n-(n-1)/2;i<n;i++,k++){
                    list.add(k);
                }
                res.add(list);
            }
        }
        return res;
    }
}