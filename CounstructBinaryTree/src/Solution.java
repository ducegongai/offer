import sun.reflect.generics.tree.Tree;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


    public TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i < endIn; i++) {
            if(in[i]==pre[startPre]){
                root.left = reConstructBinaryTree(pre,startPre+1,startPre+i,in,startIn,i-1);
                root.right = reConstructBinaryTree(pre,startPre+i+1,endPre,in,i+1,endIn);
                break;
            }
        }
        return root;
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        Solution solution = new Solution();
        solution.reConstructBinaryTree(pre,in);
    }
}