// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveDuplicatesSolution {

    // Function to remove duplicates from sorted list
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        // Traverse and skip duplicates
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next; // Skip duplicate
            } else {
                curr = curr.next;           // Move forward
            }
        }

        return head;
    }

    // Print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Sorted list with duplicates: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Before:");
        printList(head);

        head = deleteDuplicates(head);

        System.out.println("After Removing Duplicates:");
        printList(head);
    }
}