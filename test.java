// Q.1 ===>

// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         int n = sc.nextInt();
//         String arr[] = { "mon", "tue", "thu", "fri", "sat", "sun" };
//         int i = 0;
//         for (i = 0; i < arr.length; i++) {
//             if (arr[i].equals(str))
//                 break;
//             int res = 1;
//             int rem = 6 - i;
//             n = n - rem;
//             if (n > 0)
//                 res += n / 7;
//             System.out.println(res);
//         }
//     }
// }

//  ==================
// Q.2--->

// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         int l = sc.nextInt();
//         int max = 0, count = 0;

//         for (int i = 0; i < str.length(); i++) {
//             if (i % l == 0) {
//                 max = Math.max(count, max);
//                 count = 0;

//                 if (str.charAt(i) == 'a') {
//                     count++;
//                 }
//                 max = Math.max(count, max);
//                 System.out.println(max);
//             }
//         }
//     }
// }
// ----------------->
// Q.3

// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         int count = 0;
//         int count2 = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '*') {
//                 count++;
//             }
//             if (s.charAt(i) == '#') {
//                 count2++;
//             }
//         }

//         if (count == count2) {
//             System.out.println("number of * and # are equal");
//         }
//         if (count > count2) {
//             System.out.println("positive integer: "+count);
//         }
//         if (count < count2) {
//             System.out.println("nagative integer");
//         }
//     }

// }

// Q.4==================>

// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         String n = "";
//         for (int i = 1; i <= s.length(); i++) {
//             if (i == 1) {
//                 if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
//                         || s.charAt(i) == 'u') {
//                     n += "%";
//                 } else {
//                     n += s.charAt(i);
//                 }
//             }
//             if (i == 2) {
//                 if (s.charAt(i) != 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
//                         || s.charAt(i) == 'u') {
//                     n += "#";
//                 } else {
//                     n += s.charAt(i);
//                 }
//             }
//             if(i==3){
//                 n=n.toUpperCase();
//             }

//           System.out.println(n);
//         }

//     }
// }

// // Q.1-----------========>

// import java.util.*;

// public class test {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         int leftProduct = 1;
//         for (int i = 0; i < n; i++) {
//             result[i] = leftProduct;
//             leftProduct *= nums[i];
//         }
//         int rightProduct = 1;
//         for (int i = n - 1; i >= 0; i--) {
//             result[i] *= rightProduct;
//             rightProduct *= nums[i];
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         // call
//         Main solution = new Main();
//         int[] nums = { 1, 2, 3, 4 };
//         int[] result = solution.productExceptSelf(nums);
//         System.out.println(Arrays.toString(result));
//     }
// }

// 
// practice ==

// public class test {
//     public static void main(String[] args) {
//         int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 if (a[i][j] % 2 == 0 || a[i][j] == 5) {
//                     a[i][j] = 0;
//                     System.out.print(a[i][j] + " ");
//                 } else {
//                     System.out.print(a[i][j] + " ");
//                 }

//             }
//             System.out.println();
//         }
//     }
// }
// ==============================================

// import java.util.*;

// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter b number: ");
//         int b = sc.nextInt();
//         int num = 0;
//         int rem = 0;

//         int temp;
//         for (int i = a; i <= b; i++) {
//             num = i;
//             temp = num;
//             int sum = 0;
//             while (num > 0) {
//                 rem = num % 10;
//                 sum = sum * 10
//                         + rem;
//                 num = num / 10;

//             }

//             if (temp == sum) {
//                 System.out.println("p: " + sum);
//             }
//         }
//     }
// }

// ==========================================>

// import java.util.*;

// public class test {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter number: ");
// int n = sc.nextInt();
// int arr[] = new int[n];
// int max = 0;
// int min = 0;
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > max) {
// max = arr[i];
// }
// if (arr[i] < min) {
// min = arr[i];
// }
// }
// int diff = max - min;
// System.out.println(diff);
// }
// }

// =====================================
// 1)
// Rotate Array
// Rotate an array to the right by k steps, where k is non-negative.
// Input: [1, 2, 3, 4, 5, 6, 7], k = 3
// Output: [5, 6, 7, 1, 2, 3, 4]

// public class test {
//     public static void main(String[] args) {
//         int k = 3;
//         int a[] = { 1, 2, 3, 4, 5, 6, 7 };

//         while (k > 0) {

//             for (int i = a.length - 1; i > 0; i--) {
//                 int temp = a[i];
//                 a[i] = a[i - 1];
//                 a[i - 1] = temp;
//             }
//             k--;
//             for (int i = 0; i < a.length; i++) {
//                 System.out.print(a[i] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// ======================================================================
// Java Program to Convert Integer Values into Binary

// // Importing Classes/Files
// import java.io.*;

// class test {
// 	// Function converting decimal to binary
// 	static void decimalToBinary(int num)
// 	{
// 		// Function to print integer to binary using
// 		// inbuilt toBinaryString method
// 		System.out.println(Integer.toBinaryString(num));
// 	}

// 	// Main driver function
// 	public static void main(String[] args)
// 	{
// 		// Number to be converted into binary
// 		int num = 5;

// 		// Calling function
// 		decimalToBinary(num);
// 	}
// }
// =========================================================================
// Java Program to Convert Integer Values into Binary

// Importing CLasses/Files
import java.io.*;

public class test {
	// Function to print binary number
	static void printBinary(int[] binary, int id)
	{
		// Iteration over array
		for (int i = id - 1; i >= 0; i--)
			System.out.print(binary[i] + "");
	}

	// Function converting decimal to binary
	public static void decimalToBinary(int num)
	{
		// Creating and assigning binary array size
		int[] binary = new int[35];
		int id = 0;

		// Number should be positive
		while (num > 0) {
			binary[id++] = num % 2;
			num = num / 2;
		}

		// Print Binary
		printBinary(binary, id);
	}

	// Main Driver Code
	public static void main(String[] args)
	{
		// Entered number to be convert into binary
		int num = 5;

		// Calling Our Above Function
		decimalToBinary(num);
	}
}
