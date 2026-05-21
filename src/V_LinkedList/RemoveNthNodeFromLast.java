package V_LinkedList;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public class RemoveNthNodeFromLast {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = head;

        while (n > 0) {
            if (fast == null) return head;
            fast = fast.next;
            --n;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
