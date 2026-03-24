// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class SwapKthNodesSolution {

    // Function to swap Kth node from start & end
    public static ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;
        ListNode second = head;
        ListNode curr = head;

        int count = 1;

        // Move first pointer to the Kth node
        while (count < k) {
            first = first.next;
            count++;
        }

        // Now use curr pointer to move to end
        curr = first;
        while (curr.next != null) {
            curr = curr.next;
            second = second.next;
        }

        // Swap values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
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

        // List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Swap K = 2 → swap 2nd from start (2) with 2nd from end (4)
        head = swapNodes(head, 2);

        System.out.println("After Swapping Nodes:");
        printList(head);
    }
}