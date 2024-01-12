public class Test_03 {
    public static void main(String[] args) {
        int a[] = { 1, 4, 2, 3, 5, 9, 6, 7 };
        for (int i = 0; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j - 1] = a[j];
                a[j - 1] = temp;
                j--;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}