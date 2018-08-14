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
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null||pHead.next==null)
            return pHead;
        else{
            ListNode prior ;
            ListNode cur;
            ListNode newHead = new ListNode(-1);
            newHead.next = pHead;
            prior = newHead;
            cur = pHead;
            int isDup = 0;
            while(cur!=null){
                if(cur.next==null){
                    if(isDup==0)
                        prior.next = cur;
                    else
                        prior.next = null;
                    break;
                }
                if(cur.val == cur.next.val){
                    isDup = 1;
                }
                else if (isDup == 1){
                    isDup = 0;
                }
                else{
                    prior.next = cur;
                    prior = cur;
                    isDup = 0;
                }
                cur = cur.next;
            }
            return newHead.next;
        }

    }
}