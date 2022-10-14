import basic.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
        ListNode l1 = ListNode.createList(new int[]{9,9,9,9,9,9,9});
        ListNode l2 = ListNode.createList(new int[]{9,9,9,9});
        System.out.println(ListNode.toString(a.addTwoNumbers1(l1,l2)));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            // 为空新建节点
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            carry = sum / 10;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        int sum, carry = 0;
        ListNode p = l1;
        ListNode q = l2;
        ListNode res = new ListNode(-1);
        ListNode r = res;
        while (p != null && q != null) {
            sum = (p.val + q.val + carry) % 10;
            carry = (p.val + q.val + carry) / 10;
            r.next = new ListNode(sum);
            r = r.next;
            p = p.next;
            q = q.next;
        }
        while (p != null) {
            sum = (p.val + carry) % 10;
            carry = (p.val + carry) / 10;
            r.next = new ListNode(sum);
            r = r.next;
            p = p.next;
        }
        while (q != null) {
            sum = (q.val + carry) % 10;
            carry = (q.val + carry) / 10;
            r.next = new ListNode(sum);
            r = r.next;
            q = q.next;
        }
        if(carry != 0){
            r.next = new ListNode(carry);
        }
        return res.next;
    }
}

// https://leetcode.cn/problems/Add-Two-Numbers