
// import java.util.Stack;

// public class Revarce {
//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();
//         st.push(1);
//         st.push(61);
//         st.push(91);
//         st.push(134);

//         // Stack<Integer> rt = new Stack<>();
//         // while (st.size() > 0) {
//         // int x = st.peek();
//         // rt.push(x);
//         // st.pop();
//         // }
//         // System.out.println(rt);
        
//         // second Way ------>
//         System.out.println("origanal");
//         System.out.println(st);

//         Stack<Integer> rt = new Stack<>();
//         while (st.size() > 0) {
//             int x = st.peek();
//             rt.push(st.pop());

//         }
//         System.out.println("Revarce");
//         System.out.println(rt);
//     }
// }


// =========================

// import java.til.*;
import java.util.Stack;

public class Revarce {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);
        
        System.out.println("orignal");
        System.out.println(st);

        Stack<Integer> gt = new Stack<>();

        while (st.size() > 0) {
            int x = st.peek();
            gt.push(x);
            st.pop();
        }

        System.out.println(gt);

         Stack<Integer> rt = new Stack<>();

         while (gt.size() > 0) {
             rt.push(gt.pop());
         }
        System.out.println(rt);
    }
}