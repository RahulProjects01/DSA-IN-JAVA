// public class Main {
//     public static boolean prime(int n) {
//         if (n == 0 || n == 1) {
//             return false;
//         }
//         if (n == 2) {
//             return true;
//         }
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 return false;
//             } 
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int n = 1;
//         System.out.println(prime(n));

//     }
// }


public class Main{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || i == 5 || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}