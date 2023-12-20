import java.util.Stack;

public class DisplayRecurssion {
    public static void dispaly(Stack<Integer> s){
        s.push(20);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(23);
        st.push(34);
        st.push(40);
        System.out.println(st);
        dispaly(st);
        System.out.println("add");
        System.out.println(st);
    }
}
