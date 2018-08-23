import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
     int count = 0;
     PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2-o1;
        }
    });


    public void Insert(Integer num) {
        if(count%2==0){
            maxHeap.offer(num);
            int tmp = maxHeap.poll();
            minHeap.offer(tmp);
        }
        else{
            minHeap.offer(num);
            int tmp = minHeap.poll();
            maxHeap.offer(tmp);
        }
        count ++;

    }

    public Double GetMedian() {
        if(count%2==0){
            return new Double(minHeap.peek()+maxHeap.peek())/2;
        }
        else{
            return new Double(minHeap.peek());
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        System.out.println(minHeap.poll());
    }

}
