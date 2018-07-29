public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        boolean res = IsLastOrder(sequence,0,sequence.length-1);
        return res;
    }
    public boolean IsLastOrder(int [] sequence,int left,int right) {
        if(left == right)
            return true;
        int length = right -left+1;
        int mid = left;
        if(sequence == null)
            return false;
        int root = sequence[length-1];
        for(;mid<length-1;mid++){
            if(sequence[mid]>root)
                break;
        }
        int tmp = mid;
        while(tmp<right){
            if(sequence[tmp]<root)
                return false;
            tmp++;
        }
        if(mid==left||mid == right)
            return IsLastOrder(sequence,left,right-1);
        else{
            return (IsLastOrder(sequence,left,mid-1)&&IsLastOrder(sequence,mid,right-1));
        }
    }
}