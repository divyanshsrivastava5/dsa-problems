package V_LinkedList;

// https://www.geeksforgeeks.org/problems/find-length-of-loop/1

public class LengthOfLoop {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) {
            return 0;
        }

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        int len = 0;

        do {
            slow = slow.next;
            ++len;
        } while (slow != fast);

        return len;
    }
}
