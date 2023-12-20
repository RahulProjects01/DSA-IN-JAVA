import java.util.Stack;

public class UnderFlow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("orignal: " + st);
        st.pop();
         System.out.println("first time: " + st);
         st.pop();
         System.out.println("second time: " + st);
         st.pop();
         System.out.println("third time: " + st);
         st.pop();
         System.out.println("forth time: " + st);
         st.pop();
         System.out.println("fifth time: " + st);
        
        //  Output: UnderFlow.main(UnderFlow.java:19)
    }
}
