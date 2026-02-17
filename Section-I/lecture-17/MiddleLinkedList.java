// Node definition for singly linked list
class ListNode {

    int val;          // value stored in node
    ListNode next;    // reference to next node

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Solution class containing middle node logic
class Solution {

    // function to find middle node
    public ListNode middleNode(ListNode head) {

        // slow pointer moves 1 step
        ListNode slow = head;

        // fast pointer moves 2 steps
        for (ListNode fast = head;
             fast != null && fast.next != null;
             fast = fast.next.next) {

            slow = slow.next;
        }

        // when fast reaches end → slow is middle
        return slow;
    }
}

// Main class to test the program
public class MiddleLinkedList {

    public static void main(String[] args) {

        // creating linked list manually
        // 10 → 20 → 30 → 40 → 50

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        // create solution object
        Solution obj = new Solution();

        // find middle node
        ListNode mid = obj.middleNode(head);

        // print result
        System.out.println("Middle node value = " + mid.val);
    }
}
