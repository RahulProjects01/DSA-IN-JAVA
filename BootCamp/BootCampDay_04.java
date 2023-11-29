// 1)
// Problem Statement
// You are given a function,
// Int MaxExponents (int a , int b);
// You have to find and return the number between ‘a’ and ‘b’ ( range inclusive on both ends)
// which has the maximum exponent of 2.
// The algorithm to find the number with maximum exponent of 2 between the given range is
// 1.Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.
// 2.Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent
// of 2 so faqrd in a variable , let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more exponent of 2
// than ‘max’.
// 3.Return ‘max’.
// Assumption: a <b
// Note: If two or more numbers in the range have the same exponents of 2 , return the small
// number.
// Example
// Input:
// 7
// 12
// Output:
// 8
// Explanation:
// Exponents of 2 in:
// 7-0
// 8-3
// 9-0
// 10-1
// 11-0
// 12-2
// Hence maximum exponent if two is of 8.




// // import java.util.*;
// // public class Main {
// //     static int maxExponentes(int a, int b) {
// //         int max = a;
// //         for (int i = a; i <= b; i++) {
// //             int exponent = getExponentOf(2);
// //             if (exponent > getExponentOf(max)) {
// //                 max = i;
// //             }
// //         }
// //         return max;
// //     }

// //     static int getExponentOf(int num) {
// //         int exponent = 0;
// //         while (num % 2 == 0) {
// //             num /= 2;
// //             ++exponent;
// //         }
// //         return exponent;
// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a: ");
// //         int a = sc.nextInt();
// //         System.out.println("Enter b: ");
// //         int b = sc.nextInt();

// //         int result = maxExponentes(a, b);
// //         System.out.println(result);

// //     }
// // }
// ======================================================================
// 2)
// Problem Statement
// You are required to implement the following function:
// Int Calculate(int m, int n);
// The function accepts 2 positive integer ‘m’ and ‘n’ as its arguments.You are required to
// calculate the sum of numbers divisible both by 3 and 5, between ‘m’ and ‘n’ both inclusive
// and return the same.
// Note
// 0 < m <= n
// Example
// Input:
// m : 12
// n : 50
// Output
// 90
// Explanation:
// The numbers divisible by both 3 and 5, between 12 and 50 both inclusive are {15, 30, 45}
// and their sum is 90.
// Sample Input
// m : 100
// n : 160
// Sample Output
// 510




// // import java.util.*;

// // public class Main {
// //     static int show(int m, int n) {
// //         int sum = 0;
// //         for (int i = n; i < m; i++) {
// //             if (i % 3 == 0 && i % 5 == 0) {
// //                 sum += i;
// //             }
// //         }
// //         return sum;
// //     }

// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter N: ");
// //         int n = sc.nextInt();
// //         System.out.println("Enter M: ");
// //         int m = sc.nextInt();

// //         int result = show(m, n);
// //         System.out.println(result);
// //     }
// // }
// ==========================================================================
// 3)
// Problem Statement
// You are required to input the size of the matrix then the elements of matrix, then you have to
// divide the main matrix in two sub matrices (even and odd) in such a way that element at 0
// index will be considered as even and element at 1st index will be considered as odd and so
// on. then you have sort the even and odd matrices in ascending order then print the sum of
// second largest number from both the matrices.
// Example
// enter the size of array : 5
// enter element at 0 index : 3

// enter element at 1 index : 4
// enter element at 2 index : 1
// enter element at 3 index : 7
// enter element at 4 index : 9
// Sorted even array : 1 3 9
// Sorted odd array : 4 7
// 7




// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         ArrayList al = new ArrayList<>();
//         ArrayList even = new ArrayList<>();
//         ArrayList odd = new ArrayList<>();
//         al.add(3);
//         al.add(4);
//         al.add(1);
//         al.add(7);
//         al.add(9);

//         for (int i = 0; i < al.size(); i++) {
//             if (i % 2 == 0) {
//                 even.add(al.get(i));
//             } else {
//                 odd.add(al.get(i));
//             }
//         }

//         Collections.sort(even);
//         Collections.sort(odd);
//         System.out.println("Sorted even array: " + even);
//         System.out.println("Sorted add array: " + odd);
//         Collections.sort(al);
//         System.out.println(al.get(al.size() - 2));
//     }

// }
// =============================================================================
// 4)
// Instructions: You are required to write the code. You can click on compile and run anytime to
// check compilation/execution status. The code should be logically/syntactically correct.
// Problem: Write a program in C to display the table of a number and print the sum of all the
// multiples in it.
// Test Cases:
// Test Case 1:
// Input:
// 5
// Expected Result Value:
// 5, 10, 15, 20, 25, 30, 35, 40, 45, 50
// 275



// // import java.util.*;
// // public class Main{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a number: ");
// //         int n = sc.nextInt();
// //         int sum = 0;
// //         for(int i=1;i<=10;i++){
// //             for(int j=1;j<10;j++){

// //             }
// //              System.out.println(i*n+" ");
// //              sum+=i*n;
// //         }
// //         System.out.println("sum: "+sum);
// //     }
// // }
// =====================================================================================
// 5)
// Find the maximum value and its index in the array
// Problem Statement :

// You are given a function, void MaxInArray(int arr[], int length); The function accepts
// an integer array ‘arr’ of size ‘length’ as its argument. Implement the function to find
// the maximum element of the array and print the maximum element and its index to
// the standard output

// (STDOUT). The maximum element and its index should be printed in separate lines.

// Note:

// a)Array index starts with 0
// b)Maximum element and its index should be separated by a line in the output
// c)Assume there is only 1 maximum element in the array
// d)Print exactly what is asked, do not print any additional greeting messages

// Example:

// Input:

// 23 45 82 27 66 12 78 13 71 86

// Output:

// 86

// 9

// Explanation:

// 86 is the maximum element of the array at index 9





// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter arry size: ");
//         int n = sc.nextInt();
//         int index = 0;
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int max = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//                 index = i;
//             }
//         }
//         System.out.println("max: "+max);
//         System.out.println("index: "+index);
//     }
// }

// ===========================================================================
// 6)
// Problem Statement

// Alex works at a clothing store. There is a large pile of socks that must be paired by
// color for sale. Given an array of integers representing the color of each sock,
// determine how many pairs of socks with matching colors there are.

// For example, there are n=7 socks with colors ar = {1,2,1,2,1,3,2}. There is one pair
// of color 1 and one of color 2. There are three odd socks left, one of each color. The
// number of pairs is 2.
// Function Description
// Complete the sockMerchant function in the editor below. It must return an integer
// representing the number of matching pairs of socks that are available.
// sockMerchant has the following parameter(s):
// n: the number of socks in the pile
// ar: the colors of each sock

// Input Format
// The first line contains an integer n, the number of socks represented in ar.
// The second line contains n space-separated integers describing the colors
// ar[i] of the socks in the pile.

// Constraints
// 1 <= n <= 100
// 1 <= ar[i] <= 100 & 0 <= i < n

// Output Format
// Return the total number of matching pairs of socks that Alex can sell.

// Sample Input
// 9
// 10 20 20 10 10 30 50 10 20
// Sample Output
// 3

// Explanation
// Alex can match 3 pairs of socks i.e 10-10, 10-10, 20-20
// while the left out socks are 50, 60, 20



// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         int a[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
//         int count = 0;
//         Arrays.sort(a);
//         for (int i = 0; i < a.length-1; i++) {
//            if(a[i] == a[i+1]){
//             count++;
//             i++;
//            }  
//         }
//         System.out.println(count);

//     }
// }
// -------------------------------------------------
//  logic secound ---->

// public class test {
//     public static void main(String[] args) {
//         int a[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20, 10, 20, 30, 6, 6,7,7 };
//         int count = 0;
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[i] / a[j] == 1) {
//                     count++;
//                     i++;
//                     break;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }
// ------------------------------------------------------------
// logic 3rd ------------->
// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         int a[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20, 10, 20, 30, 6, 6, 7, 7 };
//         Arrays.sort(a);
//         int count = 0;
//         for (int i = 0; i < a.length-1; i++) {
//             if (a[i] / a[i + 1] == 1) {
//                 count++;
//                 i++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// ===============================================================================================================
// 7)
// Problem Statement – To speed up his composition of generating unpredictable rhythms,
// Blue Bandit wants the list of prime numbers available in a range of numbers.Can you help
// him out?
// Write a java program to print all prime numbers in the interval [a,b] (a and b, both inclusive).
// Note
// Input 1 should be lesser than Input 2. Both the inputs should be positive.
// Range must always be greater than zero.
// If any of the condition mentioned above fails, then display “Provide valid input”
// Use a minimum of one for loop and one while loop
// Sample Input 1:
// 2
// 15
// Sample Output 1:
// 2 3 5 7 11 13
// Sample Input 2:

// 8
// 5
// Sample Output 2:
// Provide valid input
// 8
// 5
// Sample Output 2:
// Provide valid input




// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value a: ");
//         int a = sc.nextInt();
//         System.out.println("Enter value b: ");
//         int b = sc.nextInt();

//         if (a < 0 || b < 0 || a > b) {
//             System.out.println("“Provide valid input”");
//         }
//         for (int i = a; i <= b; i++) {
//             int flag = 0;
//             for (int j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     flag = 1;
//                     break;
//                 }
//             }
//             if (flag == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// ================================================================================================

// 9)Problem Statement – Bela teaches her daughter to find the factors of a given number.
// When she provides a number to her daughter, she should tell the factors of that number.
// Help her to do this, by writing a program. Write a class FindFactor.java and write the main
// method in it.
// Note :
// If the input provided is negative, ignore the sign and provide the output. If the input is zero
// If the input is zero the output should be “No Factors”.
// Sample Input 1 :
// 54
// Sample Output 1 :
// 1, 2, 3, 6, 9, 18, 27, 54
// Sample Input 2 :
// -1869

// Sample Output 2 :
// 1, 3, 7, 21, 89, 267, 623, 1869



// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();

//         for (int i = 1; i <= num; i++) {
//             if (num < 0) {
//                 num *= -1;
//             }
//             if (num % i == 0) {
//                 System.out.print(i + " ");
//             }
//         }

//     }
// }

// ==================================================================================================




