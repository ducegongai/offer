public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index==0)
            return 0;
        int[] res =new int[index];
        res[0] =1;
        int count2=0,count3=0,count5=0;
        int tmp;
        for (int i = 1; i < res.length; i++) {
            tmp = Math.min(res[count3]*3,res[count5]*5);
            res[i] = Math.min(res[count2]*2,tmp);
            System.out.println(res[i]);
            System.out.println(count2+" "+count3+ " "+count5);
            System.out.println(res[count2]+" "+res[count3]+" "+res[count5]);

            if(res[i]==res[count2]*2)
                count2++;
            if(res[i] ==res[count3]*3)
                count3++;
            if(res[i] == res[count5]*5)
                count5++;
        }
        return res[index-1];
    }

    public static void main(String[] args) {
        int n = 20;
        Solution solution = new Solution();
        solution.GetUglyNumber_Solution(n);
    }
}