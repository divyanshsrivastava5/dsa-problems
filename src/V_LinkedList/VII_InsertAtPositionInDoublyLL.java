package V_LinkedList;

// https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1

public class VII_InsertAtPositionInDoublyLL {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node dummy = new Node(-1);
        dummy.next = head;
        Node curr = dummy;
        Node node = new Node(x);

        for(int i = 0 ; i <= p ; i++) {
            curr = curr.next;
        }

        Node nextNode = curr.next;
        curr.next = node;
        node.prev = curr;
        node.next = nextNode;
        if(nextNode != null) {
            nextNode.prev = node;
        }
        return dummy.next;
    }
}
