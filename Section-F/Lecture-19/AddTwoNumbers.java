// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTwoNumbers {

    // Function to add two numbers represented by linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;  // Update carry
            temp.next = new ListNode(sum % 10); // Create new node
            temp = temp.next;
        }

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

    // Main function with test case
    public static void main(String[] args) {

        // Number 1: 342 (2 -> 4 -> 3)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Number 2: 465 (5 -> 6 -> 4)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Adding both numbers
        ListNode result = addTwoNumbers(l1, l2);

        // Expected Output: 7 -> 0 -> 8 (807)
        printList(result);
    }
}