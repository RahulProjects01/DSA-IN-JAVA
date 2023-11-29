
// 1)
// Rotate Array
// Rotate an array to the right by k steps, where k is non-negative.
// Input: [1, 2, 3, 4, 5, 6, 7], k = 3
// Output: [5, 6, 7, 1, 2, 3, 4]

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter rotation");
//         int k=sc.nextInt();
//        int a[]={1, 2, 3, 4, 5, 6, 7};

//        while (k>0)
//        {
//            for (int i = a.length - 1; i > 0; i--)
//            {
//                int temp = a[i];
//                a[i] = a[i - 1];
//                a[i - 1] = temp;
//            }
//            k--;
//        }
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
//     }
// }
// ---------------------------------------------------------------------
// 2)
// the product of 1 * 2 * 3 = 6
// Approach:
// To solve this problem efficiently, we can use two auxiliary arrays: leftProducts and
// rightProducts. These arrays will store the products of elements to the left and right of each
// element, respectively.
// a)Compute leftProducts:
// Initialize an array leftProducts of the same length as nums and set leftProducts[0] = 1 since
// there are no elements to the left of the first element.
// Iterate from left to right through nums, updating leftProducts[i] as the product of all elements
// to the left of nums[i].

// b)Compute rightProducts:
// Initialize an array rightProducts of the same length as nums and set rightProducts[n-1] = 1
// since there are no elements to the right of the last element.
// Iterate from right to left through nums, updating rightProducts[i] as the product of all
// elements to the right of nums[i].

// c)Compute the final result output:
// For each index i, the product of all elements except nums[i] is given by leftProducts[i] *
// rightProducts[i].
// Populate the output array accordingly.

// import java.util.*;
// public class Main {
//   public int[] productExpectSelf(int []nums)
//   {
//       int n=nums.length;
//       int []result=new int[n];
//       int leftProduct=1;
//       for(int i=0;i<n;i++)
//       {
//           result[i]=leftProduct;
//           leftProduct *= nums[i];
//       }
//       int rightProduct=1;
//       for(int i=n-1;i>=0;i--)
//       {
//           result[i] *= rightProduct;
//           rightProduct *= nums[i];
//       }
//       return result;
//   }
//     public static void main(String[] args) {
//      Main solution=new Main();
//      int []nums={1,2,3,4};
//      int []result=solution.productExpectSelf(nums);
//         System.out.println(Arrays.toString(result));
//     }
// }
// }
// ----------------------------------------------------------------------------------------
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

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//        int a[]={1, 2, 3, 1};

//        int k=0;
//        for(int i=1;i<a.length-1;i++)
//        {
//            if(a[i]>a[i-1] && a[i]>a[i+1])
//            {
//                System.out.println("peak element= "+a[i]);
//                System.out.println("index= "+i);
//            }
//        }
//     }
// }
// ----------------------------------------------------------------------------------------
// 4)
// Selection of MPCS exams include a fitness test which is conducted on ground. There will be
// a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record
// their oxygen level after every round. After trainee are finished with all rounds, calculate for
// each trainee his average oxygen level over the 3 rounds and select one with highest oxygen
// level as the most fit trainee. If more than one trainee attains the same highest average level,
// they all need to be selected.
// Display the most fit trainee (or trainees) and the highest average oxygen level.
// Note:
// a)The oxygen value entered should not be accepted if it is not in the range between 1 and
// 100.
// b)If the calculated maximum average oxygen value of trainees is below 70 then declare the
// trainees as unfit with meaningful message as “All trainees are unfit.
// c)Average Oxygen Values should be rounded.
// Example 1:
// INPUT VALUES
// 95
// 92
// 95
// 92
// 90
// 92
// 90
// 92
// 90
// OUTPUT VALUES
// Trainee Number : 1
// Trainee Number : 3
// Note:
// Input should be 9 integer values representing oxygen levels entered in order as
// Round 1
// a)Oxygen value of trainee 1
// b)Oxygen value of trainee 2
// c)Oxygen value of trainee 3
// Round 2
// a)Oxygen value of trainee 1
// b)Oxygen value of trainee 2

// c)Oxygen value of trainee 3
// Round 3
// a)Oxygen value of trainee 1
// b)Oxygen value of trainee 2
// c)Oxygen value of trainee 3
// Output must be in given format as in above example. For any wrong input final output should
// display “INVALID INPUT”

// public class Main {
//     public static void main(String[] args) {
//         int a[][]={{95,92,95},
//                 {92,90,92},
//                 {90,92,90}};

//         int max=0;
//         for(int i=0;i<a.length;i++)
//         {
//             int result=0;

//             for(int j=0;j<a[i].length;j++)
//             {
//                 result=result+a[j][i]/a[i].length;
//             }
//             if(max<=result)
//             {
//                 max=result;
//                 System.out.println("trainee number= "+(i+1));
//             }
//         }
//     }
// }
// ----------------------------------------------------------------------------
// 6)
// Program to check if two given matrices are identical

// public class Main {
//     public static void main(String[] args) {
//        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
//        int b[][]={{1,2,3},{1,2,3},{1,2,3}};
//        int flag=0;

//        for(int i=0;i<a.length && i<b.length;i++)
//        {
//            for(int j=0;j<a[i].length && j<b[i].length;j++)
//            {
//                if(a[i][j]!=b[i][j])
//                {
//                    flag=1;
//                    break;
//                }
//            }
//        }
//        if(flag==0)
//            System.out.println("identical");
//            else
//            System.out.println("not identical");
//     }
// }
// --------------------------------------------------------------------------------
// 7)
// Given a 2D array, print it in spiral form. See the following examples.
// NOTE:- Please comment down the code in other languages as well below .
// Input:
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// Output:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
// Input:
// 1 2 3 4 5 6
// 7 8 9 10 11 12
// 13 14 15 16 17 18
// Output:
// 1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11


// public class Main {
//     public static void main(String[] args) {
//         int a[][]= {{1 ,2 ,3 ,4 ,5 ,6},
//                 {7 ,8 ,9 ,10 ,11 ,12},
//                 {13 ,14 ,15 ,16 ,17 ,18}};

//         int row=3;
//         int column=6;
//         int mincol=0;
//         int minrow=0;
//         int maxrow=row-1;
//         int maxcol=column-1;
//         int n=1;
//         while(n<row*column)
//         {
//             for (int i = mincol; i <= maxcol && n<=row*column ; i++)
//             {
//                 System.out.print(a[minrow][i]+" ");;
//                 n++;
//             }
//             for (int i = minrow+1 ; i <= maxrow && n<=row*column ; i++)
//             {
//                 System.out.print(a[i][maxcol]+" ");;
//                 n++;
//             }
//             for (int i = maxcol-1 ; i >= mincol && n<=row*column  ; i--)
//             {
//                 System.out.print(a[maxrow][i]+" ");;
//                 n++;
//             }

//             for (int i = maxrow-1 ; i >= minrow+1 && n<=row*column; i--)
//             {
//                 System.out.print(a[i][mincol]+" ");;
//                 n++;
//             }
//             mincol++;
//             minrow++;
//             maxcol--;
//             maxrow--;
//         }
//     }
// }
// -------------------------------------------------------------------------------------
// 8)
// Problem Statement – Write a program to calculate the fuel consumption of your
// truck.The program should ask the user to enter the quantity of diesel to fill up the
// tank and the distance covered till the tank goes dry.Calculate the fuel consumption
// and display it in the format (liters per 100 kilometers).
// Convert the same result to the U.S. style of miles per gallon and display the result. If
// the quantity or distance is zero or negative display ” is an Invalid Input”.
// [Note: The US approach of fuel consumption calculation (distance / fuel) is the
// inverse of the European approach (fuel / distance ). Also note that 1 kilometer is
// 0.6214 miles, and 1 liter is 0.2642 gallons.]
// The result should be with two decimal place.To get two decimal place refer the
// below-mentioned print statement :
// float cost=670.23;
// System.out.printf(“You need a sum of Rs.%.2f to cover the trip”,cost);
// Sample Input 1:
// Enter the no of liters to fill the tank
// 20
// Enter the distance covered

// 150
// Sample Output 1:
// Liters/100KM
// 13.33
// Miles/gallons
// 17.64
// Explanation:
// For 150 KM fuel consumption is 20 liters,
// Then for 100 KM fuel consumption would be (20/150)*100=13.33,
// Distance is given in KM, we have to convert it to miles (150*0.6214)=93.21,
// Fuel consumption is given in liters, we have to convert it to gallons
// (20*0.2642)=5.284,
// Then find (miles/gallons)=(93.21/5.284)=17.64
// Sample Input 2:
// Enter the no of liters to fill the tank
// -5
// Sample Output 2:
// -5 is an Invalid Input
// Sample Input 3:
// Enter the no of liters to fill the tank
// 25
// Enter the distance covered
// -21
// Sample Output 3:
// -21 is an Invalid Input

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no of liters to fill the tank");
//         int a= sc.nextInt();
//         System.out.println("Enter the distance covered");
//         int b= sc.nextInt();

//         if(a<=0)
//         {
//             System.out.println(a+" is an Invalid Input");
//         }
//         else if(b<=0)
//         {
//             System.out.println(b+" is an Invalid Input");
//         }
//         else {
//             float km = (float)a*100/b;
//             float miles = (b * 0.6214f);
//             float gallons = a * 0.2642f;
//             float gall = (miles / gallons);
//             System.out.printf("Liters/100KM=%.2f %n", km);
//             System.out.printf("Miles/gallons=%.2f ", gall);
//         }
//     }
// }
// -----------------------------------------------------------------------------------------

// 9)
// Problem statement : You will be given a 2d matrix. Write the code to traverse the matrix in a
// spiral format. Check the input and output for better understanding.
// Input :

// 5 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// 17 18 19 20
// Output :
// 1 2 3 4 8 12 16 20 19 18 17 13 9 5 6 7 11 15 12 14 10

// public class Main {
//     public static void main(String[] args) {
//         int a[][]= {{1 ,2 ,3 ,4 ,5 ,6},
//                 {7 ,8 ,9 ,10 ,11 ,12},
//                 {13 ,14 ,15 ,16 ,17 ,18}};

//         int row=3;
//         int column=6;
//         int mincol=0;
//         int minrow=0;
//         int maxrow=row-1;
//         int maxcol=column-1;
//         int n=1;
//         while(n<row*column)
//         {
//             for (int i = mincol; i <= maxcol && n<=row*column ; i++)
//             {
//                 System.out.print(a[minrow][i]+" ");;
//                 n++;
//             }
//             for (int i = minrow+1 ; i <= maxrow && n<=row*column ; i++)
//             {
//                 System.out.print(a[i][maxcol]+" ");;
//                 n++;
//             }
//             for (int i = maxcol-1 ; i >= mincol && n<=row*column  ; i--)
//             {
//                 System.out.print(a[maxrow][i]+" ");;
//                 n++;
//             }

//             for (int i = maxrow-1 ; i >= minrow+1 && n<=row*column; i--)
//             {
//                 System.out.print(a[i][mincol]+" ");;
//                 n++;
//             }
//             mincol++;
//             minrow++;
//             maxcol--;
//             maxrow--;
//         }
//     }
// }
// ---------------------------------------------------------------------------------------

// 10)Problem: Set Matrix Zeroes
// Problem Description:
// Given a matrix matrix, modify it in-place such that if an element is 0, set its entire row and
// column to 0. Do it in such a way that modifies the matrix in constant space.
// Example:
// Input:
// [
// [1, 2, 3],
// [4, 0, 6],
// [7, 8, 9]
// ]
// Output:
// [
// [1, 0, 3],
// [0, 0, 0],
// [7, 0, 9]
// ]
// Explanation: In the input matrix, the element at position (1,1) is 0. Hence, its entire row and
// column are set to 0 in the output matrix

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size");
//         int size= sc.nextInt();

//         int a[][]=new int[size][size];

//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a[i].length;j++)
//             {
//                 a[i][j]= sc.nextInt();
//             }
//         }

//         int p=0;
//         int q=0;
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a[i].length;j++)
//             {
//                 if(a[i][j]==0)
//                 {
//                     p=i;
//                     q=j;
//                 }
//             }
//         }
//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a[i].length;j++)
//             {
//                if(i==p || j==q)
//                {
//                    a[i][j]=0;
//                }
//             }
//         }

//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=0;j<a[i].length;j++)
//             {
//                 System.out.print(a[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// ----------------------------------------------------------------------------------------








































