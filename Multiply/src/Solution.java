import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        if(A.length!=0) {
            for (int i = 1; i < A.length; i++) {
                B[i] = B[i - 1] * A[i - 1];
            }
            int tmp = 1;
            for (int j = A.length - 2; j >= 0; j--) {
                tmp = tmp*A[j+1];
                B[j] = B[j]*tmp;
            }
        }
        return B;
    }
}