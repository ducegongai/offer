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
    void inOrderTravel1(TreeNode root){
        if(root!=null){
            inOrderTravel1(root.left);
            System.out.println(root.val);
            inOrderTravel1(root.right);
        }
    }

    void inOrderTravel2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty()||node!=null){
            while(node!=null){
                stack.add(node);
                node = node.left;
            }
            while(!stack.isEmpty()){
                node = stack.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }
    }
}
