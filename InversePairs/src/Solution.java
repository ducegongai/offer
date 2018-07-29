public class Solution {
    static int count = 0;
    public int InversePairs(int [] array) {
        int[] tmp = new int[array.length];
        if(array==null)
            return 0;
        sort(array,0,array.length-1,tmp);
        return count;
    }
    public static void sort(int [] array,int left,int right,int[] tmp){
        if(left<right){
            int mid = (left+right)/2;
            sort(array,left,mid,tmp);
            sort(array,mid+1,right,tmp);
            merge(array,left,mid,right,tmp);
        }
    }

    public static void merge(int[] array,int left,int mid,int right,int[] tmp){
        int i = mid;
        int j =right;
        int t = right;

        while(i>=left&&j>mid) {
            if (array[i] >array[j]) {
                tmp[t--] = array[i--];
                count  = count + (j-mid);
                if(count>1000000007)
                    count = count%1000000007;
            } else {
                tmp[t--] = array[j--];
            }
        }
        while(i>=left){
            tmp[t--] = array[i--];
        }
        while(j>=mid+1){
            tmp[t--] = array[j--];
        }
        if(count>1000000007)
            count = count%1000000007;
        t = right;
        while(left<=right){
            array[right--] = tmp[t--];
        }

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,0};
        Solution solution = new Solution();
        int res = solution.InversePairs(array);
        System.out.println(res);
    }
}