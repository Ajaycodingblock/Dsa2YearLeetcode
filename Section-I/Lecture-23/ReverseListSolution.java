// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ReverseListSolution {

    // Reverse linked list using 3 pointers
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next; // Save next
            curr.next = prev;              // Reverse
            prev = curr;                   // Move prev
            curr = nextNode;               // Move curr
        }

        return prev; // New head
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

        // List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Before Reverse:");
        printList(head);

        head = reverseList(head);

        System.out.println("After Reverse:");
        printList(head);
    }
}