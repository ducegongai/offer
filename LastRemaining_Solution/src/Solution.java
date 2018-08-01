import java.util.ArrayList;

public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0||m == 0)
            return -1;
        ArrayList<Integer> list  = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(i);
        }
        int i = 0;
        while(list.size()>1){
            int count = 0;
            while(count < m-1) {
                count++;
                ++i;
                i = i%list.size();
            }
            i = i%list.size();
            list.remove(i);
            System.out.println(list);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int n = 5;
        int m =3;
        Solution solution = new Solution();
        int res = solution.LastRemaining_Solution(n,m);
        System.out.println(res);
    }
}