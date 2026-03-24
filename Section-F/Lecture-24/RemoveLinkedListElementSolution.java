// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveLinkedListElementSolution {

    // Function to remove all occurrences of a given value
    public static ListNode removeElements(ListNode head, int val) {

        // Dummy node to handle deletion of head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next; // Skip the node
            } else {
                curr = curr.next; // Move forward
            }
        }

        return dummy.next;
    }

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // List: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Before Removing Elements:");
        printList(head);

        head = removeElements(head, 6); // Remove all 6's

        System.out.println("After Removing 6:");
        printList(head);
    }
}