package V_LinkedList;

// https://leetcode.com/problems/palindrome-linked-list/

public class PalindromeLL {
    private ListNode reverseLL(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode p = reverseLL(head.next);
        head.next.next = head;
        head.next = null;

        return p;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head.next;

        // find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // recursive reverse the second LL
        ListNode secHead = slow.next;
        slow.next = null;
        secHead = reverseLL(secHead);

        ListNode c1 = head;
        ListNode c2 = secHead;

        while (c2 != null) {
            if (c1.val != c2.val) return false;
            c1 = c1.next;
            c2 = c2.next;
        }

        return true;
    }
}
