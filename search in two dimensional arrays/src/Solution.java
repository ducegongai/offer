public class Solution {
    public boolean Find(int target, int [][] array) {
        for(int i = 0;i<array[0].length;i++){
            for(int j = 0;j<array.length;j++){
                if(array[i][j]==target)
                    return true;
            }
        }
        return false;
        
    }
}