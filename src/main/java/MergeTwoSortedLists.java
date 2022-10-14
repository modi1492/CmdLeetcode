import basic.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        while ((first != null) && (second != null)) {
            if (first.val < second.val) {
                cur.next = new ListNode(first.val);
                first = first.next;
            } else {
                cur.next = new ListNode(second.val);
                second = second.next;
            }
            cur = cur.next;
        }
        if (first != null) {
            cur.next = first;
        }
        if (second != null) {
            cur.next = second;
        }
        return ans.next;
    }
}
// https://leetcode.cn/problems/Merge-Two-Sorted-Lists