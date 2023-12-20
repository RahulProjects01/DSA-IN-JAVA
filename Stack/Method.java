public class Method {
    public static class Stack {
        int arr[] = new int[5];
        private int index = 0;

        void push(int x) {
            arr[index] = x;
            index++;
        }

        int peek() {
            if (index == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
        }

        int pop() {
            if (index == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[index - 1];
            arr[index - 1] = 0;
            index--;
            return top;
        }

        void dispaly() {
            for (int i = 0; i <= index; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return index;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(1);
        st.dispaly();
        st.push(3);
        st.dispaly();
        st.push(4);
        st.dispaly();
        st.pop();
        st.dispaly();
    }
}
