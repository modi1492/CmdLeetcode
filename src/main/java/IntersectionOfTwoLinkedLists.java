import basic.ListNode;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {}

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (p != null) {
            lengthA++;
            p = p.next;
        }
        while (q != null) {
            lengthB++;
            q = q.next;
        }
        int length = lengthA + lengthB;
        p = headA;
        q = headB;
        for (int i = 0; i < length; i++) {
            if (p.next == null) {
                p = headA;
            } else {
                p = p.next;
            }
            if (q.next == null) {
                q = headB;
            } else {
                q = q.next;
            }
        }
        if (p.equals(q)) {
            return p;
        } else {
            return null;
        }
    }
}
