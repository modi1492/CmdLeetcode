import basic.ListNode;

public class DeleteMiddleNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

// https://leetcode.cn/problems/Delete-Middle-Node