import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers==null||numbers.length<5)
            return false;
        Arrays.sort(numbers);
        int numberOfGap = 0;
        int numberOfZero = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==0)
                numberOfZero++;
        }
        int small = numberOfZero;
        int big = small+1;

        while(big<numbers.length){
            if(numbers[big]==numbers[small])
                return false;
            numberOfGap = numberOfGap+ numbers[big]-numbers[small]-1;
            small = big;
            big ++;
        }
        return numberOfGap>numberOfZero?false:true;
    }
}