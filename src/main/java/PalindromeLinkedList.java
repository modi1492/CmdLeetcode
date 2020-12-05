import basic.ListNode;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        PalindromeLinkedList p = new PalindromeLinkedList();
        ListNode l1 = ListNode.createList(new int[]{1, 2, 3, 4});
//        System.out.println(p.isPalindrome(l1));
        l1 = ListNode.createList(new int[]{1, 2});
//        System.out.println(p.isPalindrome(l1));
        l1 = ListNode.createList(new int[]{1, 2, 2, 1});
//        System.out.println(p.isPalindrome(l1));
        l1 = ListNode.createList(new int[]{1, 2, 3, 2, 1});
//        System.out.println(p.isPalindrome(l1));
        l1 = ListNode.createList(new int[]{});
        System.out.println(p.isPalindrome(l1));
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        if (head.next == null) {
            return true;
        }
        // 先计算链表的长度
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        // 快慢指针找到中间节点
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode first = slow;
        ListNode second = slow.next;
        while (second != null) {
            ListNode tmp = second.next;
            second.next = first;
            first = second;
            second = tmp;
        }
        ListNode l1 = head;
        ListNode l2 = first;
        // 循环 length / 2次
        for (int i = 0; i < length / 2; i++) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}