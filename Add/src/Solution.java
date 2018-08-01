public class Solution {
    public int Add(int num1,int num2) {
        while(num2!=0){
            int sum = (num1^num2);
            num2 = (num1&num2)<<1;
            num1 =  sum;
        }
        return num1;
    }

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Solution solution = new Solution();
        int res = solution.Add(num1,num2);
        System.out.println(res);
    }
}