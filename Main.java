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
        int n = 5;
        int fact = 1;
        

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print(fact);
    }
}