// Node class for singly linked list
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

// Solution class
class Solution {

    // ================= FIND LENGTH =================
    // counts number of nodes in a list
    int length(ListNode head) {

        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    // ================= INTERSECTION LOGIC =================
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = length(headA);
        int lenB = length(headB);

        // align starting points
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // move together to find intersection
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA; // intersection node or null
    }
}

// Main class to test
public class Intersectioncode {

    public static void main(String[] args) {

        /*
              List A: 10 → 20 → 30 → 40 → 50
                                 ↑
              List B:      15 ───┘
        */

        // shared part
        ListNode common = new ListNode(30);
        common.next = new ListNode(40);
        common.next.next = new ListNode(50);

        // list A
        ListNode headA = new ListNode(10);
        headA.next = new ListNode(20);
        headA.next.next = common;

        // list B
        ListNode headB = new ListNode(15);
        headB.next = common;

        // solution object
        Solution obj = new Solution();

        // find intersection
        ListNode result = obj.getIntersectionNode(headA, headB);

        if (result != null)
            System.out.println("Intersection at node value = " + result.val);
        else
            System.out.println("No intersection");
    }
}
