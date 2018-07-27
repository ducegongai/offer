public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int  max = array[0];
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max,max+array[i]);
            res = Math.max(res,max);
        }
        return max;
    }
}