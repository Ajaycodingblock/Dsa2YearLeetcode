import java.util.*;

class ReverseFirstKQueue {

    static Queue<Integer> solve(Queue<Integer> q, int k) {

        Stack<Integer> st = new Stack<>();

        // Step 1: Push first k elements
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }

        // Step 2: Add back reversed
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Rotate remaining elements
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.add(q.poll());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4);

        System.out.println(solve(q, 2));
    }
}