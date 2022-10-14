import basic.ListNode;

public class ReverseLinkedList{
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode first = head;
        ListNode second = head.next;
        head.next = null;
        while (second.next != null){
            ListNode tmp = second.next;
            second.next = first;
            first = second;
            second = tmp;
        }
        second.next = first;
        return second;
    }
}
// https://leetcode.cn/problems/Reverse-Linked-List