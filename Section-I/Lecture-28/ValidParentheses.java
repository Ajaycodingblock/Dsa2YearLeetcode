import java.util.*;

class ValidParentheses {

    // Function to check valid parentheses
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                // If stack empty → invalid
                if (st.isEmpty()) return false;

                char top = st.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack empty → valid
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}