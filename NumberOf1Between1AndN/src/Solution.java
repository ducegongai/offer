
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n<0)
            return 0;
        String tmp = "";
        int count = 0;
        for(int i = 0;i<=n;i++){
            tmp = i+"";
            System.out.println(tmp);
            for (int j = 0; j < tmp.length(); j++) {
                 if(tmp.charAt(j)=='1')
                     count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1;
        Solution solution  = new Solution();
        int res = solution.NumberOf1Between1AndN_Solution(n);
        System.out.println(res);
    }
}