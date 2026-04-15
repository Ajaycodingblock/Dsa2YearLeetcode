import java.util.*;

class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    // Push element
    void push(int val) {
        st.push(val);

        // Maintain minimum stack
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }

    // Pop element
    void pop() {
        // Remove from min stack if needed
        if (st.peek().equals(minSt.peek())) {
            minSt.pop();
        }
        st.pop();
    }

    // Get minimum element
    int getMin() {
        return minSt.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(1);
        System.out.println("Min: " + ms.getMin());
    }
}