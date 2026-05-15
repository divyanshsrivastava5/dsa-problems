package V_LinkedList;

// https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1

public class I_ArrayToLinkedList {
    public Node arrayToList(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node curr = head;

        for(int i = 1 ; i < arr.length ; i++) {
            Node node = new Node(arr[i]);
            curr.next = node;
            curr = node;
        }

        return head;

    }
}
