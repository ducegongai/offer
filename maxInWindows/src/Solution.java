import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList();
        if(num==null)
            return res;
        LinkedList<Integer> indexQueue= new LinkedList<>();
        if(size > num.length||size < 1)
            return res;
        for (int i = 0; i < size-1; i++) {
            while(indexQueue.size()!=0&&num[i]>num[indexQueue.getLast()])
                indexQueue.removeLast();
            indexQueue.addLast(i);
        }
        for (int i = size-1; i < num.length; i++) {
            while(indexQueue.size()!=0&&num[i]>num[indexQueue.getLast()])
                indexQueue.removeLast();
            indexQueue.addLast(i);
            if(i-indexQueue.getFirst()+1>size)
                indexQueue.removeFirst();
            res.add(num[indexQueue.getFirst()]);
        }
        return res;
    }
}