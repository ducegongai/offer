/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode pre = head ;
        ListNode last;
        for(int i =0;i<k-1;i++){
            pre = pre.next;
            if(pre==null)
                return null;
        }
        last = head;
        while(pre.next!=null){
            pre = pre.next;
            last = last.next;
        }
        return last;
    }
}