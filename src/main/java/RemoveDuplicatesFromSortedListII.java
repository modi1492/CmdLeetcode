import basic.ListNode;

public class RemoveDuplicatesFromSortedListII{
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        return dummy;
    }
}