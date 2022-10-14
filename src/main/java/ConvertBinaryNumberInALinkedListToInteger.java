import basic.ListNode;

import java.util.Stack;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        ListNode head = n1;
        ConvertBinaryNumberInALinkedListToInteger c = new ConvertBinaryNumberInALinkedListToInteger();
        System.out.println(c.getDecimalValue(head));
    }

    public int getDecimalValue(ListNode head) {
        int length = 0;
        ListNode p = head;
        while (p != null) {
            length++;
            p = p.next;
        }
        p = head;
        int ans = 0;
        while (p != null) {
            ans += Math.pow(2, length - 1) * p.val;
            p = p.next;
            length--;
        }
        return ans;
    }
}
// https://leetcode.cn/problems/Convert-Binary-Number-In-ALinked-List-To-Integer