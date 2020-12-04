import basic.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCyclelII {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        do {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null || fast.next == null) {
                return null;
            }
        } while (slow != fast);
        // 链表有环 指针1从head出发 指针2从相遇点出发 交点就是环中第一个节点
        ListNode p1 = head;
        ListNode p2 = slow;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}



