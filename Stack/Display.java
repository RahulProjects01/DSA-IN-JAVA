// import java.util.Stack;

// public class Display {
//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.push(50);

//         System.out.println(st);
//         Stack<Integer> rt = new Stack<>();

//         while (st.size() > 0) {
//             rt.push(st.pop());
//         }
//         while (rt.size()>0) {
//             int x = rt.pop();
//             System.out.print(x + " ");
//             st.push(x);
//         }
//     }
// }

// ===================================================

//  Dispaly throw Array------>

// import java.util.Stack;

// public class Display {
//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();
//         st.push(10);
//         st.push(20);
//         st.push(30);
//         st.push(40);
//         st.push(50);

//         System.out.println(st);
//         int n = st.size();
//         int[] arr = new int[n];
//         for (int i = n - 1; i >= 0; i--) {
//             arr[i] = st.pop();
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//             st.push(arr[i]);
//         }
//     }
// }


// =======================================================

import java.util.Stack;

public class Display {
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
        int x = 100;
        st.push(x);
        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);
        
        
    }
}