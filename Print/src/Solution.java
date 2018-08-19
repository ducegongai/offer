import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int layer = 1;
        Stack<TreeNode> s1 = new Stack();
        Stack<TreeNode> s2 = new Stack();
        s1.push(pRoot);
        while(!s1.empty()||!s2.empty()){
            if(layer%2!=0){
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!s1.empty()){
                    TreeNode node = s1.pop();
                    if(node!=null){
                        tmp.add(node.val);
                        s2.add(node.left);
                        s2.add(node.right);
                    }
                }
                if(!tmp.isEmpty()){
                    list.add(tmp);
                    layer++;
                }
            }
            else{
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!s2.empty()){
                    TreeNode node = s2.pop();
                    if(node!=null){
                        tmp.add(node.val);
                        s1.add(node.right);
                        s1.add(node.left);
                    }
                }
                if(!tmp.isEmpty()){
                    list.add(tmp);
                    layer++;
                }
            }
        }
        return list;
    }

}







