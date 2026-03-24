// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class OddEvenListSolution {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        // Rearranging nodes
        while (even != null && even.next != null) {
            odd.next = even.next; 
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        // Attach even list after odd list
        odd.next = evenHead;

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

    // Main test case
    public static void main(String[] args) {

        // List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original:");
        printList(head);

        head = oddEvenList(head);

        System.out.println("Odd-Even Reordered:");
        printList(head);
    }
}