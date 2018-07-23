
public class Solution {

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode cur1 = list1,cur2 = list2;
        if(cur1 == null)
            return cur2;
        else if(cur2 == null)
            return cur1;
        ListNode mergeHead = null;
        if(cur1.val<=cur2.val){
            mergeHead = cur1;
            mergeHead.next = Merge(cur1.next,cur2);
        }
        else{
            mergeHead = cur2;
            mergeHead.next = Merge(cur1,cur2.next);
        }
        return mergeHead;
    }
}