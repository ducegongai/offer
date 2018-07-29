
public class Solution {

public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}



    public RandomListNode Clone(RandomListNode pHead){
        if(pHead == null)
            return null;
        RandomListNode curNode = pHead;
        while(curNode!= null){
            RandomListNode node = new RandomListNode(curNode.label);
            node.next = curNode.next;
            curNode.next = node;
            curNode = node.next;
        }
        curNode = pHead;
        while(curNode!=null){
            RandomListNode node = curNode.next;
            if(curNode.random!=null){
                node.random = curNode.random.next;
            }
            curNode = node.next;
        }
        curNode = pHead;
        RandomListNode ClonePHead = pHead.next;
        while(curNode.next!=null){
            RandomListNode node = curNode.next;
            curNode.next = node.next;
            curNode = node;
        }
        return ClonePHead;

    }
}


