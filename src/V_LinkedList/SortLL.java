package V_LinkedList;

// https://leetcode.com/problems/sort-list/description/

public class SortLL {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode secHead = slow;

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(secHead);

        return merge(left, right);
    }

    private ListNode merge(ListNode h1, ListNode h2) {
        ListNode c1 = h1;
        ListNode c2 = h2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (c1 != null && c2 != null) {
            if (c1.val < c2.val) {
                curr.next = c1;
                c1 = c1.next;
            } else {
                curr.next = c2;
                c2 = c2.next;
            }
            curr = curr.next;
        }

        if (c1 != null) {
            curr.next = c1;
        }

        if (c2 != null) {
            curr.next = c2;
        }

        return dummy.next;
    }
}
