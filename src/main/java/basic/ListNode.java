package basic;


public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public static void outputListNode(ListNode listNode){
        ListNode node = listNode;
        while (node != null){
            System.out.print(node.val);
            node = node.next;
        }
        System.out.println();
    }

}
 
