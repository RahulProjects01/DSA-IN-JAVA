// // 1)
// // Rotate Array
// // Rotate an array to the right by k steps, where k is non-negative.
// // Input: [1, 2, 3, 4, 5, 6, 7], k = 3
// // Output: [5, 6, 7, 1, 2, 3, 4]

// public class test{
//     public static void main(String[] args) {
//         int a[] = {1,2,3,4,5,6,7};
//         int k = 3;

//         while (k>0) {
//             for(int i=a.length-1;i>0;i--){
//                 int temp = a[i];
//                 a[i] = a[i-1];
//                 a[i-1] = temp;
//             }
//             k--;
//         }

//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }
// ===============================================================================
// 3)
// Problem: Find Peak Element
// Problem Description:
// A peak element in an array is an element that is greater than or equal to its neighbors. Given
// an input array nums, find a peak element and return its index. If there are multiple peaks,
// return any peak index.
// Example:
// Input: [1,2,3,1]
// Output: 2
// Explanation: In this example, 3 is a peak element, and its index is 2.


// public class test {
//     public static void main(String[] args) {
//         int a[] = { 1, 2, 3, 4, 5, 6, 5, 7, 4 };
//         int pickElement = 0;
//         for (int i = 0; i < a.length - 1; i++) {
//             if (a[i] > a[i + 1]) {
//                 pickElement = i;
//             }
//         }
//         System.out.println("pickElement: " + pickElement);
//     }
// }

// ====================================================================================
