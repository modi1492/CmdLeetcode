import basic.ListNode;

//剑指 Offer 06. 从尾到头打印链表
public class Head2TailLinkedList {
    public static void main(String[] args) {

    }

    /**
     * 先求数组长度然后从后向前输入到数组中
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        int[] arr = new int[count];
        int i = count - 1;
        node = head;
        while (node != null) {
            arr[i] = node.val;
            node = node.next;
            i--;
        }
        return arr;
    }
}
