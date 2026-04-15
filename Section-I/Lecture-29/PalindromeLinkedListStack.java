import java.util.*;

class PalindromeLinkedListStack {

    static class Node {
        int val;
        Node next;
        Node(int v) { val = v; }
    }

    // Check palindrome using stack
    static boolean isPalindrome(Node head) {

        Stack<Integer> st = new Stack<>();
        Node temp = head;

        // Step 1: Push all elements into stack
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }

        // Step 2: Compare with original list
        temp = head;
        while (temp != null) {

            int top = st.pop(); // get last element

            if (temp.val != top) {
                return false; // mismatch
            }

            temp = temp.next;
        }

        return true; // all matched
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);

        System.out.println("Palindrome: " + isPalindrome(head));
    }
}