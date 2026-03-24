// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class IntersectionLinkedListSolution {

    // Function to find intersection node
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Step 1: find lengths
        int lenA = length(headA);
        int lenB = length(headB);

        // Step 2: move longer list ahead
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        // Step 3: move both together until intersection
        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }

        return null; // No intersection
    }

    // Helper: get length of list
    public static int length(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {

        // List A: 4 -> 1 \
        //                8 -> 4 -> 5
        // List B:     5 -> 6 -> 1 /

        // Shared part
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        // Find intersection
        ListNode intersection = getIntersectionNode(headA, headB);

        System.out.println("Intersection Node Value:");
        System.out.println(intersection != null ? intersection.val : "No Intersection");
    }
}