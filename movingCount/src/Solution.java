public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {

        boolean[] visited = new boolean[rows*cols];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        return movingCountHelper(rows,cols,0,0,threshold,visited);
    }
    public int movingCountHelper(int rows,int cols,int row,int col,int threshold,boolean[] visited){
        if(row<0||row>=rows||col<0||col>=cols||numSum(row)+numSum(col)>threshold||visited[row*cols+col]){
            return 0;
        }
        else{
            visited[row*cols+col] = true;
            return movingCountHelper(rows,cols,row+1,col,threshold,visited)+
                    movingCountHelper(rows,cols,row-1,col,threshold,visited)+
                    movingCountHelper(rows,cols,row,col+1,threshold,visited)+
                    movingCountHelper(rows,cols,row,col-1,threshold,visited)+1;
        }
    }
    private int numSum(int i){
        int sum = 0;
        do{
            sum = sum + i%10;
        }while((i = i/10)>0);
        return sum;
    }
}