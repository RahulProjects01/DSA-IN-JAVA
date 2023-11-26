
// //  Q.3 ----->
// import java.util.*;

// public class test {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a: ");
//         int a = sc.nextInt();
//         int index =0;
//        int arr[] = new int[a];
//        for(int i=0;i<a;i++){
//         arr[i] = sc.nextInt();
//        }

//         int max = 0;
//         if (a < 0) {
//             return;
//         }

//         else {
//             for (int i = 0; i < arr.length; i++) {
//                 if(arr[i] > max){
//                     max = arr[i];
//                    index = i;

//                 }
//             }
//             System.out.println(max);
//             System.out.println(index);
//         }
//     }

// }
// ========================================================

// //  Q.5 --->
// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         int a[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
//         int count = 0;
//         Arrays.sort(a);
//         for (int i = 0; i < a.length - 1; i++) {
//             if (a[i] == a[i + 1]) {
//                 a[i] = -1;
//                 count++;
//                 i++;
//             }
//         }
//         System.out.println(count);
//     }
// }
// ==========================================================
// // Q.6------------------->
// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no of students placed in CSE: ");
//         int c = sc.nextInt();
//         System.out.println("Enter the no of students placed in ECE: ");
//         int e = sc.nextInt();
//         System.out.println("Enter the no of students placed in MECH: ");
//         int m = sc.nextInt();

//         if (c < 0 || e < 0 || m < 0) {
//             System.out.println("Error");
//         } else {
//             if (c > e || c > m) {
//                 System.out.println("Highest placement: CSE");
//             } else if (e > c || e > m) {
//                 System.out.println("Highest placement: ECE");
//             } else {
//                 System.out.println("Highest placement: MECH");
//             }
//         }
//     }
// }

// =========================================================================

//     // Q.7------------------->
//     import java.util.*;

//     public class test {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the no of liters to fill the tank: ");
//             int tank = sc.nextInt();
//             System.out.println("Enter the distance covered: ");
//             int distance = sc.nextInt();

//             if (distance < 0) {
//                 System.out.println("invalid input");
//             }

//             float km = (distance / tank )* 100;
//             float miles = distance * 0.6214f;
//             float gallon = tank * 0.2662f;
//             float gall = miles / gallon;

//             System.out.println("Liters/100KM " + km);
//             System.out.println("Miles/gallons: " + gall);

//         }
//     }
// ==========================================================================
// // Q.8--->

// import java.util.*;

// public class test {
//     static void print(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     static void swap(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[i] != 0) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//             }

//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         swap(arr);
//         print(arr);
//     }
// }
// ===================================================================================

// // Q.9---->\
// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Value of V: ");
//         int v = sc.nextInt();
//         System.out.println("Value of W: ");
//         int w = sc.nextInt();

//         int total = w / 2;
//         int total2 = total - v;
//         int total3 = v - total2;

//         System.out.println("TW: " + total3);
//         System.out.println("FM: " + total2);
//     }
// }
// ================================================================================
// Q.4 ------------> 



// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of tictet: ");
//         int ticket = sc.nextInt();
//         System.out.println("Do you want refreshment: ");
//         String refe = sc.next();
//         System.out.println("Do you have coupon code: ");
//         String coupon = sc.next();
//         System.out.println("Enter the circle: ");
//         String circle = sc.next();
//         double total = 0.0;

//         if (ticket > 5 || ticket <= 40) {
//             if (ticket >= 20 || circle.equals("k")) {
//                 ticket = ticket * 75;
//                 total = ticket - (0.1*ticket);
//                 System.out.println("total cost: " + total);
//             }
//             else if (circle.equals("q") || ticket >= 20){
//                 ticket = ticket * 150;
//                 total = ticket - (0.1*ticket);
//                 System.out.println("total cost: " + total);
//             }
//             else if(coupon.equals("y") ){
//                 total = ticket - (0.01*ticket);
//                 System.out.println("total cost: " + total);
//             }
           
//         }

//     }
// }
