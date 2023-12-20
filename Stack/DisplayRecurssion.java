import java.util.Stack;

public class DisplayRecurssion {
    public static void pushAt(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAt(st, x);
        st.push(top);
    }

    public static void revarce(Stack<Integer> st) {
        if (st.size() == 1) {
            return;
        }
        int top = st.pop();
        revarce(st);
        pushAt(st, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("St: " + st);
        System.out.println("-------------------");
        revarce(st);
        System.out.println(st);
    }
}