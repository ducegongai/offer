import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList();
        int row  = matrix.length,col = matrix[0].length;
        int num  = ((row<col?row:col)-1)/2+1;
        for (int i = 0; i < num; i++) {
            for (int j = i; j < col-i; j++) {
                res.add(matrix[i][j]);
            }
            for (int m = i+1;m<row-i;m++){
                res.add(matrix[m][col-1-i]);
            }
            for(int l = col-2-i;l>=i&&row-1-i!=i;l--){
                res.add(matrix[row-1-i][l]);
            }
            for (int n = row-2-i; n >i&&col-1-i!=i ; n--) {
                res.add(matrix[n][i]);
            }
        }
        return res;
    }
}