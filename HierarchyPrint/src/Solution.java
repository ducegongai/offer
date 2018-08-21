import java.util.Queue;

import java.util.ArrayList;
import java.util.LinkedList;


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
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        ArrayList<Integer> temp = new ArrayList();
        if (pRoot == null)
            return res;
        queue.offer(pRoot);
        int start = 0, end = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            temp.add(node.val);
            start++;
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);
            if (start == end) {
                res.add(temp);
                start = 0;
                end = queue.size();
                temp = new ArrayList();
            }
        }
        return res;
    }

}