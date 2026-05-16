package V_LinkedList;

// https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1

public class ReverseDoublyLL {
    public Node reverse(Node head) {
        // code here
        Node curr = head;
        Node prev = null;

        while(curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            curr.prev = nextNode;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
