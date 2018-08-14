import java.util.HashMap;
import java.util.HashSet;

/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null)
            return null;
        HashSet<ListNode> set = new HashSet<>();
        ListNode cur= pHead;
        while(cur!=null){
            if(!set.add(cur))
                return cur;
            cur = cur.next;
        }
        return null;
    }
}