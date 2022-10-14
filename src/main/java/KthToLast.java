import basic.ListNode;

import java.util.List;

public class KthToLast {
    public int kthToLast(ListNode head, int k) {
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < k; i++) {
            second = second.next;
        }
        while (second != null) {
            first = first.next;
            second = second.next;
        }
        return first.val;
    }
}

// https://leetcode.cn/problems/Kth-To-Last