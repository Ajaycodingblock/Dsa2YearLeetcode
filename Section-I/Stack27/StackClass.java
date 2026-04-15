
import java.util.*;
public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i  =1 ;i<=5;i++)
        {
            st.push(i); // 1 2 3  4 5

        }
        System.out.println(st.pop()); // 5 
        st.pop();
        System.out.println(st.pop());
        st.pop();
        System.out.println(st.pop());
         
    }
}
