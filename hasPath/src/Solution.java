public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix==null||rows<1||cols<1||str==null)
            return false;
        boolean[] visited = new boolean[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            visited[i]= false;
        }

        int pathLength = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(hasPathCore(matrix,rows,cols,row,col,str,pathLength,visited))
                    return true;
            }
        }
        return false;
    }
    public boolean hasPathCore(char[] matrix,int rows,int cols,int row,int col,char[] str,int pathLength,boolean[] visited){
        boolean hasPath = false;
        if(pathLength==str.length)
            return true;
        if(row>=0&&row<rows&&col>=0&&col<cols&&matrix[row*cols+col]==str[pathLength]&&visited[row*cols+col]==false){
            pathLength++;
            visited[row*cols+col]=true;
            hasPath = (hasPathCore(matrix,rows,cols,row,col-1,str,pathLength,visited)||
                    hasPathCore(matrix,rows,cols,row,col+1,str,pathLength,visited)||
                    hasPathCore(matrix,rows,cols,row-1,col,str,pathLength,visited)||
                    hasPathCore(matrix,rows,cols,row+1,col,str,pathLength,visited));
            if(hasPath!=true){
                pathLength--;
                visited[row*cols+col]=false;
            }
        }
        return hasPath;

    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        char[] str = {'a','b','c','c','e','d'};
        char[] matrix = {'a','b','c','e','s','f','c','s','a','d','e','e'};
        Solution solution = new Solution();
        boolean res = solution.hasPath(matrix,rows,cols,str);
        System.out.println(res);

    }


}