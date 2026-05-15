package V_LinkedList;

// https://leetcode.com/problems/delete-node-in-a-linked-list/description/

public class III_DeleteNodeInBetween {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
