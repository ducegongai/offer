import java.util.Stack;

public class Solution {
    public class TreeNode{
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        void TreeNode(int val){
            this.val = val;
        }
    }
    void postOrderTravel1(TreeNode root){
        if(root!=null){
            postOrderTravel1(root.left);
            postOrderTravel1(root.right);
            System.out.println(root.val);
        }
    }


    void postOrderTravel2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur;
        TreeNode pre = null;
        stack.add(root);
        while(!stack.isEmpty()){
            cur = stack.peek();
            if((cur.left==null)&&(cur.right==null)||((cur.right==pre||cur.left==pre)&&pre!=null)){
                System.out.println(cur.val);
                stack.pop();
                pre = cur;
            }
            else{
                if(cur.right!=null)
                    stack.add(cur.right);
                if(cur.left!=null)
                    stack.add(cur.left);
            }
        }
    }
}
