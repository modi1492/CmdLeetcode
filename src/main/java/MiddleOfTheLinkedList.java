import basic.ListNode;

public class MiddleOfTheLinkedList{
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        n1.next = n2;n2.next = n3;n3.next=n4;n4.next = n5;n5.next = n6;
        MiddleOfTheLinkedList m = new MiddleOfTheLinkedList();
        System.out.println(m.middleNode(n1).val);
        n6.next = n7;
        System.out.println(m.middleNode(n1).val);
    }
    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        while (second !=null && second.next != null){
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}