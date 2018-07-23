import javax.sound.midi.Soundbank;

public class Solution {
    public static void sort(int []input){
        int[] tmp = new int[input.length];
        sort(input,0,input.length-1,tmp);
    }
    public static void sort(int[] input,int left,int right,int[] tmp){
        if(left<right){
            int mid = (left+right)/2;
            sort(input,left,mid,tmp);
            sort(input,mid+1,right,tmp);
            merge(input,left,mid,right,tmp);
        }
    }
    public static void merge(int[] input,int left,int mid,int right,int[] tmp){
        int i = left;
        int j = mid + 1;
        int t = 0;
        while(i<=mid&&j<=right){
            if(input[i]<=input[j]){
                tmp[t++] = input[i++];
            }
            else{
                tmp[t++] = input[j++];
            }
        }
        while(i<=mid){
            tmp[t++] = input[i++];
        }
        while(j<=right){
            tmp[t++] = input[j++];
        }
        t = 0;
        while(left<=right){
            input[left++] = tmp[t++];
        }
    }

    public static void main(String[] args) {
        int[] input = {9,8,6,7,5,3,4,2,1};
        sort(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
    }
}
