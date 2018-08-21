import java.util.Queue;


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
    int count = -1;
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    String Serialize(TreeNode root) {
        if(root ==null)
            return "$,";
        StringBuilder sb = new StringBuilder(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }



    TreeNode Deserialize(String str) {
        String[] strr = str.split(",");
        Queue<String> queue = new LinkedList();
        for (int i = 0; i < strr.length; i++) {
            queue.offer(strr[i]);
        }
        return PreOrder(queue);
    }
    TreeNode PreOrder(Queue<String> queue){
        String val = queue.poll();
        if(val.equals("$"))
            return null;
        TreeNode node = new TreeNode(Integer.valueOf(val));
        node.left = PreOrder(queue);
        node.right = PreOrder(queue);
        return node;
    }
}