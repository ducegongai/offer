public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if(array.length==0)
            return 0;
        int first = GetFirstK(array,k,0,array.length-1);
        int last = GetLastK(array,k,0,array.length-1);
        System.out.println(first+" "+last);

        if(first!=-1&&last!=-1)
            return last-first+1;
        else
            return 0;
    }
    public int GetFirstK(int[] array,int k,int left,int right){
        if(left<=right){
            int mid = (left+right)/2;
            //System.out.println("left:"+left+" mid :"+mid+"  right:"+right);
            if(k>array[mid]){
                return GetFirstK(array,k,mid+1,right);
            }
            else if(k<array[mid]){
                return GetFirstK(array,k,left,mid-1);
            }
            else if(mid-1>=0&&array[mid-1]==k) {
                return GetFirstK(array,k,left,mid-1);
            }
            else
                return mid;
        }
        else
            return -1;
    }

    public int GetLastK(int[] array,int k,int left,int right){
        if(left<=right){
            int mid = (left+right)/2;
            System.out.println("left:"+left+" mid :"+mid+"  right:"+right);
            if(k>array[mid]){
                return GetLastK(array,k,mid+1,right);
            }
            else if(k<array[mid]){
                return GetLastK(array,k,left,mid-1);
            }
            else{
                if(mid+1<=right && array[mid+1]==k){
                    return GetLastK(array,k,mid+1,right);
                }
                else
                    return mid;
            }
        }
        else
            return -1;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //int[] array = {1,2,3,4,6,6,6,8};
        //int[]  array = {1,2,3,3,3,4,5};
        int[] array = {4,5};
        int k = 5;
        int res = solution.GetNumberOfK(array,k);
        System.out.println(res);
    }
}