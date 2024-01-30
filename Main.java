// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         int rem = 0;
//         int temp=num;

//         while (num > 0) {
//             rem = num % 10;
//             sum = sum * 10 + rem;
//             num = num / 10;
//         }
//         if (temp == sum) {
//             System.out.println("Pailndrome");
//         }
//         else {
//             System.out.println("Not");
//         }
//     }
// }
// =============================================================

public class Main {
    public static void main(String[] args) {
        int a[] = { 10, 2, 3, 4, 123, 43, 2, 333, 3, 3, 2 };

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
        }


        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}