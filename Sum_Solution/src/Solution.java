public class Solution {
    public int Sum_Solution(int n) {
        int res = n;
        boolean flg = (res>0)&&((res+=Sum_Solution(--n))>0);
        return res;
    }
}