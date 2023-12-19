
import java.util.*;

public class StackPrint {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(122);
        st.push(99);
        st.push(125);

        System.out.print(st);

        for (int i : st) {
            System.out.print(i);
        }
    }
}
