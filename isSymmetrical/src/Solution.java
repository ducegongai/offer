/*
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
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null)
            return true;
        return isSymmetricalHelper(pRoot.left,pRoot.right);
    }
    boolean isSymmetricalHelper(TreeNode p1,TreeNode p2){
        if(p1==null&&p2==null)
            return true;
        if(p1!=null&&p2!=null){
            return p1.val == p2.val && isSymmetricalHelper(p1.left,p2.right) &&isSymmetricalHelper(p1.right,p2.left);
        }
        return false;
    }
}