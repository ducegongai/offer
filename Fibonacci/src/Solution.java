



import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<Character>();
        Scanner in = new Scanner(System.in);
        int N;
        N = in.nextInt();
        int[] m = in.nextInt()
        char res = ' ';
        queue.add('A');
        queue.add('B');
        queue.add('C');
        queue.add('D');
        for (int i = 0; i < N; i++) {
            queue.add(queue.peek());
            queue.add(queue.peek());
            if(i==N-1)
                res = queue.peek();
            queue.remove();

        }
        if(res == 'A'){
            System.out.println("Alice");
        }
        else if (res == 'B')
            System.out.println("Bob");
        else if(res == 'C')
            System.out.println("Cathy");
        else if (res == 'D')
            System.out.println("Dave");



    }
}