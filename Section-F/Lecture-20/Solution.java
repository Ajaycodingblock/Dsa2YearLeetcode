// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {

    // Function to swap every two adjacent nodes
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode p1 = dummy;

        while (p1.next != null && p1.next.next != null) {

            ListNode s1 = p1.next;       // First node
            ListNode s2 = p1.next.next;  // Second node

            // Swapping
            s1.next = s2.next;
            s2.next = s1;
            p1.next = s2;

            p1 = s1; // Move to next pair
        }

        return dummy.next;
    }

    // Utility function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method with test case
    public static void main(String[] args) {

        // Create Linked List: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original List:");
        printList(head);

        Solution obj = new Solution();
        ListNode newHead = obj.swapPairs(head);

        System.out.println("After Swapping Pairs:");
        printList(newHead);
    }
}