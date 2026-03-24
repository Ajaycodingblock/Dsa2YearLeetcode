// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class PalindromeListSolution {

    // Function to check if list is palindrome
    public static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return true;

        // STEP 1: Find middle (slow-fast pointer)
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // STEP 2: Reverse second half
        ListNode secondHalf = reverse(slow);

        // STEP 3: Compare first and second half
        ListNode p1 = head;
        ListNode p2 = secondHalf;

        while (p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    // Reverse function
    private static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {

        // List: 1 -> 2 -> 3 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean result = isPalindrome(head);

        System.out.println("Is Palindrome? " + result);
    }
}