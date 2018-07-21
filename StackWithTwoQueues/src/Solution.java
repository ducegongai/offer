import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    int tmp = 0;

    public void add(int node) {
        queue1.add(node);
    }

    public int remove() {
        int count = queue1.size();
        if(queue1.size()==0)
            System.out.println("queue1.count == 0");
        for (int i = 0; i < count - 1; i++) {
            queue2.add(queue1.peek());
            queue1.remove();
        }
        tmp = queue1.peek();
        queue1.remove();
        for (int i = 0; i < count-1; i++) {
            queue1.add(queue2.peek());
            queue2.remove();
        }
        return tmp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 0; i < 4; i++) {
            solution.queue1.add(i);
        }
        int tmp = solution.remove();
        System.out.println(tmp);
    }
}