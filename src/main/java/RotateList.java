import basic.ListNode;

public class RotateList {
    public static void main(String[] args) {
        RotateList r = new RotateList();
        int[] arr = new int[] {1, 2, 3};

        ListNode.outputListNode(r.rotateRight(ListNode.createList(arr), 1));
        ListNode.outputListNode(r.rotateRight(ListNode.createList(arr), 2));
        ListNode.outputListNode(r.rotateRight(ListNode.createList(arr), 3));
        ListNode.outputListNode(r.rotateRight(ListNode.createList(arr), 4));
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int n = 0;
        ListNode p = head;
        ListNode tail = null;
        while (p.next != null) {
            n++;
            p = p.next;
        }
        n++;
        tail = p;
        k %= n;
        if (k == 0) {
            return head;
        }
        // 否则找到第 n - k + 1 个节点 q 和它之前的节点
        p = head;
        ListNode q = head.next;
        for (int i = 0; i < n - k - 1; i++) {
            p = p.next;
            q = q.next;
        }
        p.next = null;
        tail.next = head;
        return q;
    }
}

// https://leetcode.cn/problems/Rotate-List