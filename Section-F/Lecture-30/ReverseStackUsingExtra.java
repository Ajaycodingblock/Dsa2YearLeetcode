import java.util.*;

class ReverseStackUsingExtra {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        Stack<Integer> temp = new Stack<>();

        // Transfer elements
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }

        System.out.println(temp); // [3, 2, 1]
    }
}