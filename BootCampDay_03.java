// 2)
// Consider the below series :
// 0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
// This series is a mixture of 2 series all the odd terms in this series form even numbers in
// ascending order and every even terms is derived from the previous term using the formula
// (x/2)
// Write a program to find the nth term in this series.
// The value n in a positive integer that should be read from STDIN the nth term that is
// calculated by the program should be written to STDOUT. Other than the value of the nth
// term no other characters /strings or message should be written to STDOUT.
// For example if n=10,the 10 th term in the series is to be derived from the 9th term in the
// series. The 9th term is 8 so the 10th term is (8/2)=4. Only the value 4 should be printed to
// STDOUT.
// You can assume that the n will not exceed 20,000



// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number");
//         int n = sc.nextInt();
//         int count = 0;
//         if (n > 0) {
//             for (int i = 1; i <= n - 1; i++) {
//                 if (i % 2 == 0) {
//                     count++;
//                     System.out.println(i + " ");
//                 }
//             }
//             System.out.println("count: " + count);
//         }
//         else{
//             System.out.println("invalid input");
//         }

//     }
// }
// ============================================================================================
// 4)
// Addition of two numbers a Twist
// Using a method, pass two variables and find the sum of two numbers.
// Test case:
// Number 1 – 20
// Number 2 – 20.38
// Sum = 40.38

// There were a total of 4 test cases. Once you compile 3 of them will be shown to you
// and 1 will be a hidden one. You have to display error message if numbers are not
// numeric.


// import java.util.*;

// public class Main {
//     public static void main(String[] args) {

//         try {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("enter a number");
//             int a = sc.nextInt();
//             System.out.println("enter b number");
//             float b = sc.nextFloat();
//             float total = 0;
//             if (a <= 1 || b <= 1) {
//                 System.out.println("number are not numeric");
//             } else {
//                 total = total + (float) (a + b);
//                 System.out.println("total " + total);
//             }
//         } catch (Exception ex) {
//             System.out.println("Error");
//         }

//     }
// }
// ======================================================================================
// 5)
// Rat Count House
// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of
// size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the
// amount of food each rat consumes and each ith element of array ‘arr’ represents the amount
// of food present in ‘i+1’ house number, where 0 <= i
// Note:
// a)Return -1 if the array is null
// b)Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// c)Computed values lie within the integer range.
// Example:
// Input:

// ->r: 7
// ->unit: 2
// ->n: 8
// ->arr: 2 8 3 5 7 4 1 2
// output :
// 4
// Explanation:
// Total amount of food required for all rats = r * unit
// = 7 * 2 = 14.
// The amount of food in 1st houses = 2+8+3+5 = 18. Since, amount of food in 1st 4 houses is
// sufficient for all the rats. Thus, output is 4.


// import java.util.*;

// public class Main {
//     static int solve(int r, int unit, int arr[], int n) {
//         if (arr == null) {
//             return -1;
//         } else {
//             int res = r * unit;
//             int sum = 0;
//             int count = 0;
//             for (int i = 0; i < n; i++) {
//                 sum = sum + arr[i];
//                 count++;
//                 if (sum >= res) {
//                     break;
//                 }
//             }
//             if (sum < res) {
//                 return 0;
//             }
//             return count;
//         }
//     }
// }

// ======================================================================================

// 6)
// You are given a function,
// int findCount(int arr[], int length, int num, int diff);
// The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and
// ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an
// absolute difference of less than or equal to ‘diff’ with ‘num’.
// Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or
// equal to ‘diff’, return -1.
// Example:
// Input:
// ->arr: 12 3 14 56 77 13
// ->num: 13
// ->diff: 2
// Output:
// 3
// Explanation:
// Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e.
// 13 are 12, 13 and 14.



// import java.util.*;

// public class Main {
//     public static int findCount(int arr[], int length, int num, int diff) {
//         int count = 0;
//         for (int i = 0; i < length; i++) {
//             if (Math.abs(num - arr[i]) <= diff)
//                 count++;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size: ");
//         int a = sc.nextInt();
//         int arr[] = new int[a];
//         for (int i = 0; i < a; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter a Number: ");
//         int num = sc.nextInt();
//         System.out.println("Enter diffrence: ");
//         int diff = sc.nextInt();
//         System.out.println(findCount(arr, a, num, diff));
//     }
// }
// =============================================================================================

// 7)
// Implement the following Function
// def differenceofSum(n. m)

// The function accepts two integers n, m as arguments Find the sum of all numbers in range
// from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of
// integers not divisible by n with sum of numbers divisible by n.
// Assumption:
// a)n>0 and m>0
// b)Sum lies between integral range
// Example
// Input
// n:4
// m:20
// Output
// 90
// Explanation
// a)Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60
// b)Sum of numbers not divisible by 4 are 1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 +
// 17 + 18 + 19 = 150
// c)Difference 150 – 60 = 90
// Sample Input
// n:3
// m:10
// Sample Output
// 19



// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value of N: ");
//         int n = sc.nextInt();
//         System.out.println("Enter value of M: ");
//         int m = sc.nextInt();
//         int sum = 0;
//         int sum2 = 0;
//         if (n > 0 || m > 0) {
//             for (int i = n; i <= m; i++) {
//                 if (i % n == 0) {
//                     sum = sum + i;
//                 }
//             }
//             for (int i = 0; i < m; i++) {
//                 if (i % n != 0)
//                     sum2 += i;
//             }
//             System.out.println(sum);
//             System.out.println(sum2);
//             int diffrence = sum2 - sum;
//             System.out.println("diffrence: " + diffrence);
//         } else {
//             System.out.println("invalid input");
//         }
//     }
// }