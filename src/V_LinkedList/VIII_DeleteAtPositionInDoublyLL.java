package V_LinkedList;

// https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1

public class VIII_DeleteAtPositionInDoublyLL {
    public Node delPos(Node head, int x) {
        // code here
        if (head == null) return null;

        Node dummy = new Node(-1);
        dummy.next = head;
        head.prev = dummy;
        Node curr = head;

        for (int i = 1 ; i < x ; i++) {
            curr = curr.next;
        }


        curr.prev.next = curr.next;
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }

        Node newHead = dummy.next;
        newHead.prev = null;

        return newHead;
    }
}
