package V_LinkedList;

// https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/1

public class II_InsertAtTheTail {
    public Node insertAtEnd(Node head, int x) {
        // code here
        if(head == null) return new Node(x);
        Node curr = head;

        while(curr.next != null) {
            curr = curr.next;
        }

        curr.next = new Node(x);
        return head;
    }
}
