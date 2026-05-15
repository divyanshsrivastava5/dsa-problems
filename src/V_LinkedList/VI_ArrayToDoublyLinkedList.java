package V_LinkedList;

// https://www.geeksforgeeks.org/problems/create-a-doubly-linked-list-from-a-given-array/1

public class VI_ArrayToDoublyLinkedList {
    public Node createDLL(int arr[]) {
        // code here
        Node dummy = new Node(-1);
        Node curr = dummy;

        for(int num: arr) {
            Node node = new Node(num);
            curr.next = node;
            node.prev = curr;
            curr = curr.next;
        }

        dummy.next.prev = null;
        return dummy.next;
    }
}
