import java.util.*; // Stack

public class StackClassLec {

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        for(int i  =1 ;i<=6;i++)
        {
            st.push(i); //  1 2 3 4 5 

        } // 1 2 3 4 5 6 
        System.out.println(st.pop());//6
        st.pop(); 
        System.out.println((st.pop()));
        st.pop();
        st.pop();
        st.push(78);
        System.out.println(st.peek());

        
        
    }
}
