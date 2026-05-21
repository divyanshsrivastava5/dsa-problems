package V_LinkedList;

// https://leetcode.com/problems/intersection-of-two-linked-lists/

public class IntersectionOfTwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        int l1 = 0;
        int l2 = 0;
        ListNode c1 = headA;
        ListNode c2 = headB;

        while (c1 != null) {
            ++l1;
            c1 = c1.next;
        }

        while (c2 != null) {
            ++l2;
            c2 = c2.next;
        }

        c1 = headA;
        c2 = headB;

        int diff = Math.abs(l1 - l2);
        if (l1 >= l2) {
            for (int i = 0 ; i < diff ; i++) {
                c1 = c1. next;
            }
        } else {
            for (int i = 0 ; i < diff ; i++) {
                c2 = c2.next;
            }
        }

        while ((c1 != null && c2 != null) && c1 != c2) {
            c1 = c1.next;
            c2 = c2.next;
        }

        return (c1 != null && c2 != null) ? c1 : null;

    }
}
