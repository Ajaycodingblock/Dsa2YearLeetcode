import java.util.*;

class DailyTemperatures {

    static int[] solve(int[] temp) {
        int n = temp.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse from right
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller temperatures
            while (!st.isEmpty() && temp[st.peek()] <= temp[i]) {
                st.pop();
            }

            // Calculate days
            res[i] = st.isEmpty() ? 0 : st.peek() - i;

            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int t[] = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(solve(t)));
    }
}