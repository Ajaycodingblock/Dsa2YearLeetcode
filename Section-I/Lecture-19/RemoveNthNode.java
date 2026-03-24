// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveNthNode {

    // Function to remove nth node from end
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move slow and fast together
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now slow is before the node to delete
        slow.next = slow.next.next;

        return dummy.next;
    }

    // Utility function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main test function
    public static void main(String[] args) {

        // Linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Remove 2nd node from end → remove 4
        head = removeNthFromEnd(head, 2);

        System.out.println("After Removing 2nd Node from End:");
        printList(head);
    }
}