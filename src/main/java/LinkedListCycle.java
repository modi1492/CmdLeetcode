import basic.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        do {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null || fast.next == null) {
                return false;
            }
        } while (slow != fast);
        return true;
    }

    public boolean hasCycle1(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        ListNode p = head;
        while(p != null){
            if(hashSet.contains(p)){
                return true;
            }
            hashSet.add(p);
            p = p.next;

        }
        return false;
    }
}




// https://leetcode.cn/problems/Linked-List-Cycle