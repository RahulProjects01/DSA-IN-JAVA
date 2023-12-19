import java.util.Stack;

public class Push {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("orignal");
        System.out.println(st);
 

        Stack<Integer> temp = new Stack<>();
        while (st.size() > 0) {
            temp.push(st.pop());
        }
        System.out.println(temp);

        int x = 100;
        st.push(x);
        while (temp.size() > 0) {
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
