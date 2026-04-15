import java.util.*;

class NextGreaterElement {

    // Find next greater element
    static int[] solve(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse from right
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // Assign result
            res[i] = st.isEmpty() ? -1 : st.peek();

            // Push current element
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10};
        System.out.println(Arrays.toString(solve(arr)));
    }
}