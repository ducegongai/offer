import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length;
        int mid = -1;
        int min;
        if(array.length==0)
            return 0;
        while(left<right){
            if(right-left==1){
                mid = right;
                break;
            }
            mid = left + (right-left)/2;
            if(array[mid]>array[left]){
                left = mid;
            }
            else if(array[mid]<array[left]){
                right = mid;
            }
            else if(array[left] == array[mid]||array[left] == array[mid]){
                min = array[0];
                for(int i =0;i<array.length;i++){
                    if(array[i]<min)
                        min = array[i];
                }
                return min;
            }
        }
        return array[mid];
    }

    public static void main(String[] args) {
        int []array = {3,4,5,0,1,2};
        Solution solution = new Solution();
        int res = solution.minNumberInRotateArray(array);
        System.out.println(res);
    }
}