import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    int tmp = 0;
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(!stack2.empty()){
            tmp = stack2.peek();
            stack2.pop();
            return tmp;

        }
        else{
            if(stack1.empty())
                System.out.println("error");
            while(!stack1.empty()){
                stack2.push(stack1.peek());
                stack1.pop();
            }
            tmp = stack2.peek();
            stack2.pop();
            return tmp;
        }
    }
}