// public class Fibonacci {
// public static void printFibonacci(int n){
//     int a = 0;
//     int b = 1;
//     int c= 1;

//     for(int i=1;i<=n;i++){
//         System.out.print(a+", ");
//         a= b;
//         b=c;
//         c = a+b;
//     }
// }

//     public static void main(String[] args) {
//      printFibonacci(10);
//     }
// }

// ======================

// Write a Java program to print a Fibonacci sequence using recursion.

// public class Fibonacci {
//     public static int print(int count) {
//         if (count <= 1) 
//             return count;
//             return print(count - 1) + print(count - 2);

//     }

//     public static void main(String[] args) {
//         int len = 10;

//         for (int i = 0; i < len; i++) {
//             System.out.print(print(i) + ", ");
//         }
//     }
// }

// // ===============
// public class Fibonacci {
//    public static  boolean checkPalindromeString(String input) {
//         boolean result = true;
//         int length = input.length();

//         for (int i = 0; i < length / 2; i++) {
//             if (input.charAt(i) != input.charAt(length - i - 1)) {
//                 result = false;
//                 break;
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         String input = "rahkr";
//         System.out.println(checkPalindromeString(input));
//     }
// }

// public class Fibonacci {
//     public static void main(String[] args) {
//         int num = 5;
//         int fact = 1;

//         for (int i = 1; i <= num; i++) {
//             fact = fact * i;
//         }
//         System.out.println(fact);
//     }
// }

import java.text.SimpleDateFormat;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date); // 06-23-2020
    }
}