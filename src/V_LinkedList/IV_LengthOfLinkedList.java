package V_LinkedList;

// https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1

public class IV_LengthOfLinkedList {
    public int getCount(Node head) {
        // code here
        int len = 0;
        Node curr = head;

        while(curr != null) {
            curr = curr.next;
            ++len;
        }

        return len;
    }
}
