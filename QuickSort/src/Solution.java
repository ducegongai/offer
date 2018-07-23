public class Solution {
    public int partion(int[] input,int start,int end){
        int left = start;
        int right = end;
        int partition = input[start];
        int tmp = 0;
        while(left<right){
            while(left<right&&input[right]>=partition){
                right--;
            }
            while(left<right&&input[left]<=partition){
                left++;
            }
            tmp = input[right];
            input[right] = input[left];
            input[left] = tmp;
        }
        tmp = input[start];
        input[start] = input[left];
        input[left] = tmp;
        return left;
    }
    public void quickSort(int[] input,int start,int end){
        int index = partion(input,start,end);
        if(index >start)
            quickSort(input,start,index-1);
        if(index<end)
            quickSort(input,index+1,end);
    }

    public static void main(String[] args) {
        int[] input = {1,3,2,6,8,7,6,9,};
        Solution solution = new Solution();
        solution.quickSort(input,0,input.length-1);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
    }
}
