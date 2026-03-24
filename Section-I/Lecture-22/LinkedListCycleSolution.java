// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkedListCycleSolution {

    // Detect cycle using slow-fast pointer
    public static boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        // Move: slow by 1, fast by 2
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;  // Cycle found
        }

        return false; // No cycle
    }

    public static void main(String[] args) {

        // Create list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Create a cycle: 4 -> points to 2
        head.next.next.next.next = head.next;

        boolean result = hasCycle(head);

        System.out.println("Cycle Present? " + result); // true
    }
}