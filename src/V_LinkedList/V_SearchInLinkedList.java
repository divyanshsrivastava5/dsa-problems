package V_LinkedList;

// https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1

public class V_SearchInLinkedList {
    public boolean searchKey(Node head, int key) {
        // Code here
        Node curr = head;

        while(curr != null) {
            if(curr.data == key) return true;
            curr = curr.next;
        }

        return false;
    }
}
