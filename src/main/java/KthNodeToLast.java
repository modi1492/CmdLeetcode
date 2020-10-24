import basic.ListNode;

public class KthNodeToLast {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        for(int i = 0; i < k; i++){
            second = second.next;
        }
        while (second !=null){
            first = first.next;
            second = second.next;
        }
        return first;
    }
}
