public class Solution {
    public double Power(double base, int exponent) {
        double res = 1;
        if(exponent==0)
            return 1;
        else if(exponent>0){
            for (int i = 0; i < exponent ; i++) {
                res = base * res;
            }
            return res;
        }
        else {
            exponent = -exponent;
            for (int i = 0; i < exponent ; i++) {
                res = base * res;
            }
            res = 1/res;
            return res;
        }

    }
}