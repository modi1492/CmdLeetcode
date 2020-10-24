import basic.ListNode;

public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        DeleteNodeInALinkedList d = new DeleteNodeInALinkedList();

    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}