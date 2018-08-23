import java.util.Stack;

public class Solution {
    public class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public  TreeNode(int val){
            this.val = val;
        }
    }
    void preOrder1(TreeNode root){
        if(root != null){
            System.out.println(root.val);
            preOrder1(root.left);
            preOrder1(root.right);
        }
    }
    void preOrder2(TreeNode root){
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack();
        while(node!=null){
            System.out.println(node);
            stack.add(node);
            node = node.left;
        }
        if(!stack.isEmpty()){
            node = stack.pop();
            node = node.right;
        }
    }
}
