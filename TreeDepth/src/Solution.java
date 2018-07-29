
import java.util.LinkedList;
import java.util.Queue;

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
public class Solution {
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }
 }

    public int TreeDepth1(TreeNode root) {
        if(root == null)
            return 0;
        int left = TreeDepth1(root.left);
        int right = TreeDepth1(root.right);
        return Math.max(left,right)+1;
    }
    public int TreeDepth2(TreeNode root){
        if(root == null)
            return 0;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(root);
        int count = 0,nextCount = 1,depth = 0;
        while(!queue.isEmpty()){
            TreeNode top = queue.poll();
            count++;
            if(top.left!=null)
                queue.offer(top.left);
            if(top.right!=null)
                queue.offer(top.right);
            if(count == nextCount){
                nextCount = queue.size();
                count = 0;
                depth++;
            }

        }
        return depth;
    }
}