import java.util.ArrayList;

public class Solution {

     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }
    ArrayList<ArrayList<Integer>> listAll = new ArrayList();
    ArrayList<Integer> list = new ArrayList();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root!=null)
            return listAll;
        else{
            target-=root.val;
            list.add(root.val);
        }
        if(root.left==null&&root.right==null&&target ==0){
            listAll.add(new ArrayList(list));
        }
        if(root.left!=null)
            FindPath(root.left,target);
        if(root.right!=null)
            FindPath(root.right,target);
        list.remove(list.size()-1);
        return listAll;
    }
}