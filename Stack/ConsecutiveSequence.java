// Consecutive Sequence --> 1 2 3 4 5 6 7 8 9
// solcve the code ,because in this have error
import java.util.Stack;

public class ConsecutiveSequence {
    public static int[] remove(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.size() == 0 || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (arr[i] == st.peek()) {
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
        
        int res[] = new int[st.size()];
        int m = res.length;
        for (int i = m - 1; i >= 0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 63, 10, 33, 99, 9 };
        int re[] = remove(arr);
        for (int i = 0; i < re.length; i++) {
            System.out.print(re[i]+" ");
        }
    }
}
