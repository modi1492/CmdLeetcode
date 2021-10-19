package basic;


public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4};
        ListNode list = createList(arr);
        outputListNode(list);
    }

    public static void outputListNode(ListNode listNode) {
        ListNode node = listNode;
        while (node != null) {
            System.out.print(node.val);
            System.out.print("->");
            node = node.next;
        }
        System.out.println();
    }

    /**
     * 尾插法创建链表
     *
     * @param arr
     * @return
     */
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode l = dummy;
        for (int i = 0; i < arr.length; i++) {
            l.next = new ListNode(arr[i]);
            l = l.next;
        }
        return dummy.next;
    }

}
 
