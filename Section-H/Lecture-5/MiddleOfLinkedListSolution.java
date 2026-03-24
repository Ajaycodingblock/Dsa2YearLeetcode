// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MiddleOfLinkedListSolution {

    // Function to find middle node
    public static ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Fast moves 2 steps, Slow moves 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;       
            fast = fast.next.next;  
        }

        // Slow is now at the middle
        return slow;
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

        // List: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List:");
        printList(head);

        ListNode mid = middleNode(head);

        System.out.println("Middle Node Value:");
        System.out.println(mid.val);
    }
}