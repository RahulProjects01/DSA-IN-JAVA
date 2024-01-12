// public class BubbleSort {
//     public static void main(String[] args) {
//         int a[] = { 1, 5, 3, 4, 7, 2, 9 };

//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a.length - i - 1; j++) {
//                 if (a[j] > a[j + 1]) {
//                     int temp = a[j];
//                     a[j] = a[j + 1];
//                     a[j + 1] = temp;
//                 }
//             }
//         }

//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+" ");
//         }
//     }
// }
// ===================================================================================

// public class BubbleSort{
//     public static void main(String[] args) {
//         int a[] = { 1, 3, 5, 7, 2, 3, 4 };
//         for (int i = 0; i < a.length; i++) {
//             int j = i;
//             while (j > 0 && a[j] < a[j - 1]) {
//                 int temp = a[j];
//                 a[j] = a[j - 1];
//                 a[j - 1] = temp;
//                 j--;
//             }
//         }

//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+" ");
//         }
//     }
// }

//=====================================================================================

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = { 1, 2, 1, 3, 52, 6, 2, 7, 2 };
        for (int i = 0; i < a.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
