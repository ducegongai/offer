public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int index = 0;
        if(numbers==null||length<2)
            return false;
        for (int i = 0; i < length; i++) {
            if(numbers[i]>length-1)
                return false;
            if(numbers[i]<0)
                index = -numbers[i];
            else
                index = numbers[i];
            if(numbers[index]<0){
                duplication[0] = index;
                return true;
            }
            numbers[index] = -numbers[index];

        }
        return false;
    }
}