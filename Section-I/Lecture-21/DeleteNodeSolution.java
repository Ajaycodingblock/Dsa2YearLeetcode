// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class DeleteNodeSolution {

    // Delete a given node (you don't get head)
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;     // Copy next node's value
        node.next = node.next.next;   // Skip next node
    }

    // Print function
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // List: 4 -> 5 -> 1 -> 9
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Before Delete:");
        printList(head);

        // Let’s delete node with value 5 (given node directly)
        deleteNode(head.next);

        System.out.println("After Deleting 5:");
        printList(head);
    }
}