import basic.ListNode;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        first.next = second;
        second.next = third;
        third.next = fourth;
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        ListNode.outputListNode(first);
        ListNode res = swapNodesInPairs.swapPairs(first);
        ListNode.outputListNode(res);

    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        ListNode ans = second;
        ListNode third = head.next.next;


    }

}