import basic.ListNode;

public class RemoveDuplicatesFromSortedList{
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode first = head;
        ListNode second = head.next;
        while (second!=null){
            if(first.val == second.val){
                second = second.next;
            }else {
                first.next = second;
                first = second;
                second = first.next;
            }
        }
        first.next = second;
        return head;
    }
}