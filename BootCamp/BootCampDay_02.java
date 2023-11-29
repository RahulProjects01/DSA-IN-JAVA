// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number: ");
//         int a = sc.nextInt();
//         int arr[] = new int[a];

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 arr[count++] = arr[i];
//             }
//         }
//         for (int i = count; i < a; i++) {
//             arr[i] = 0;
//         }

//         for (int i = 0; i < a; i++) {
//             System.out.print(arr[i] + " ");
//         }

//     }
// }

// =======================================================================================

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter length: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int max = Integer.MIN_VALUE;
//         int count = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }

// =========================================================
// import java.util.*;

// public class Main {
//     static int singleDigitSum(int n, int r){
//         if (r == 0) {
//             return 0;
//         }
//         int currentSum = digitSum(n);
//         for (int i = 1; i < r; i++) {
//             currentSum = digitSum(currentSum + n);
//         }
//     }

//     static int digitSum(int number) {
//         int sum = 0;
//         while (number != 0) {
//             sum += number % 10;
//             number = number / 10;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number; ");
//         int n = sc.nextInt();
//         System.out.println("Value of R:");
//         int r = sc.nextInt();

//         int result = singleDigitSum(r, n);
//         System.out.println("output: " + result);
//     }
// }
// =========================================

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("value of V: ");
//         int v = sc.nextInt();
//         System.out.println("Value of W: ");
//         int w = sc.nextInt();

//         if (w >= 2) {
//             int t = w / 2;
//             int k = t - v;
//             v = v - k;
//             System.out.println("TW =" + v);
//             System.out.println("FW =" + k);
//         }
//     }
// }
// =================================================

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         System.out.println("enter value of T: ");
//         int n2 = sc.nextInt();
//         int b[] = new int[n2];

//         System.out.println("number of guests entering");
//         for (int i = 0; i < n; i++) {
//             a[i] = sc.nextInt();
//         }

//         System.out.println("number of guests leaving");
//         for (int i = 0; i < n2; i++) {
//             b[i] = sc.nextInt();
//         }
//         int max = 0;
//         for (int i = 0; i < a.length; i++) {
//             int total = a[i] - b[i];
//             System.out.println(a[i] + "-" + b[i] + "=" + total);
//             if (max < total) {
//                 max = total;
//             }
//         }
//         System.out.println("Maximum number of guests on cruise at an instance= " + max);
//     }
// }
// ==================================================================

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number of candies");
//         int k = sc.nextInt();
//         int N = 10;

//         if (k >= 5) {
//             System.out.println("Invalid input");
//         } else {
//             int available = N - k;
//             System.out.println("NUMBER OF CANDIES SOLD= " + k);
//             System.out.println("NUMBER OF CANDIES AVAILABLE= " + available);
//         }
//     }
// }





























// ===============================================================================================
// 1)
// Problem Statement –A chocolate factory is packing chocolates into the packets. The
// chocolate packets here represent an array of N number of integer values. The task is to find
// the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
// Example 1 :
// N=8 and arr = [4,5,0,1,9,0,5,0] There are 3 empty packets in the given set. These 3 empty
// packets represented as O should be pushed towards the end of the array
// Input :
// 8 – Value of N
// [4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by
// newline
// Output:
// 4 5 1 9 5 0 0 0

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size");
//         int size=sc.nextInt();

//         int a[]=new int[size];

//         for(int i=0;i<a.length;i++)
//         {
//             a[i]=sc.nextInt();
//         }

//         for(int i=0;i<a.length;i++)
//         {
//             for(int j=i+1;j<a.length;j++)
//             {
//                 if(a[i]==0)
//                 {
//                     int temp=a[i];
//                     a[i]=a[j];
//                     a[j]=temp;
//                 }
//             }
//         }
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.print(a[i]+" ");
//         }
//     }
// }
// -----------------------------------------------------------------------------------
// 2)
// Given an integer array Arr of size N the task is to find the count of elements whose value is
// greater than all of its prior elements.
// Note : 1st element of the array should be considered in the count of the result.
// For example,
// Arr[]={7,4,8,2,9}
// As 7 is the first element, it will consider in the result.
// 8 and 9 are also the elements that are greater than all of its previous elements.
// Since total of 3 elements is present in the array that meets the condition.
// Hence the output = 3.
// Example 1:
// Input
// 5 -> Value of N, represents size of Arr
// 7-> Value of Arr[0]
// 4 -> Value of Arr[1]
// 8-> Value of Arr[2]
// 2-> Value of Arr[3]

// 9-> Value of Arr[4]
// Output :
// 3
// Example 2:
// 5 -> Value of N, represents size of Arr
// 3 -> Value of Arr[0]
// 4 -> Value of Arr[1]
// 5 -> Value of Arr[2]
// 8 -> Value of Arr[3]
// 9 -> Value of Arr[4]
// Output
// 5

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size");
//         int size=sc.nextInt();

//         int a[]=new int[size];

//         for(int i=0;i<a.length;i++)
//         {
//             a[i]=sc.nextInt();
//         }

//        int count=1;
//         for(int i=0;i<a.length-1;i++)
//         {
//             if(a[i+1]>a[i])
//             {
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }
// ------------------------------------------------------------------------------------------
// 4)
// An intelligence agency has received reports about some threats. The reports consist of
// numbers in a mysterious method. There is a number “N” and another number “R”. Those
// numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are
// summed up and this action is performed ‘R’ number of times. The resultant is also a single
// digit that is yet to be deciphered. The task here is to find the single-digit sum of the given
// number ‘N’ by repeating the action ‘R’ number of times.
// If the value of ‘R’ is 0, print the output as ‘0’.
// Example 1:
// Input :
// 99 -> Value of N
// 3 -> Value of R
// Output :
// 9 -> Possible ways to fill the cistern.
// Explanation:
// Here, the number N=99
// 1)Sum of the digits N: 9+9 = 18
// 2)Repeat step 2 ‘R’ times i.e. 3 tims (9+9)+(9+9)+(9+9) = 18+18+18 =54
// 3)Add digits of 54 as we need a single digit 5+4
// Hence , the output is 9.
// Example 2:
// Input :
// 1234 -> Value of N
// 2 -> Value of R
// Output :
// 2 -> Possible ways to fill the cistern
// Explanation:
// Here, the number N=1234
// 1)Sum of the digits of N: 1+2+3+4 =10
// 2)Repeat step 2 ‘R’ times i.e. 2 times (1+2+3+4)+(1+2+3+4)= 10+10=20

// 3)Add digits of 20 as we need a single digit. 2+0=2
// Hence, the output is 2.
// Constraints:
// 0<N<=1000
// 0<=R<=50
// The Input format for testing
// The candidate has to write the code to accept 2 input(s)
// First input- Accept value for N (positive integer number)
// Second input: Accept value for R(Positive integer number)
// The output format for testing
// The output should be a positive integer number or print the message (if any) given in the
// problem statement. (Check the output in Example 1, Example 2).

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter Value of N");
//         int n=sc.nextInt();
//         System.out.println("enter Value of R");
//         int r=sc.nextInt();

//         if(r==0)
//         {
//             System.out.println(r);
//         }
//         else
//         {
//             int rem;
//             int total=0;
//             int result=0;
//             while(n>0)
//             {
//                 rem=n%10;
//                 total=total+rem;
//                 n=n/10;
//             }
//             total=total*r;

//             while (total>0)
//             {
//                 rem=total%10;
//                 result=result+rem;
//                 total=total/10;
//             }
//             System.out.println(result);
//         }
//     }
// }
// ------------------------------------------------------------------------------------------
// 5)
// Problem Statement
// Particulate matters are the biggest contributors to Delhi pollution. The main reason behind
// the increase in the concentration of PMs include vehicle emission by applying Odd Even
// concept for all types of vehicles. The vehicles with the odd last digit in the registration
// number will be allowed on roads on odd dates and those with even last digit will on even
// dates.
// Given an integer array a[], contains the last digit of the registration number of N vehicles
// traveling on date D(a positive integer). The task is to calculate the total fine collected by the
// traffic police department from the vehicles violating the rules.
// Note : For violating the rule, vehicles would be fined as X Rs.
// Example 1:
// Input :
// 4 -> Value of N
// {5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line
// 12 -> Value of D, i.e. date

// 200 -> Value of x i.e. fine
// Output :
// 600 -> total fine collected
// Explanation:
// Date D=12 means , only an even number of vehicles are allowed.
// Find will be collected from 5,3 and 7 with an amount of 200 each.
// Hence, the output = 600.
// Example 2:
// Input :
// 5 -> Value of N
// {2,5,1,6,8} -> a[], elements a[0] to a[N-1], during input each element is separated by new
// line
// 3 -> Value of D i.e. date
// 300 -> Value of X i.e. fine
// Output :
// 900 -> total fine collected
// Explanation:
// Date D=3 means only odd number vehicles with are allowed.
// Find will be collected from 2,6 and 8 with an amount of 300 each.
// Hence, the output = 900
// Constraints:
// ->0<N<=100
// ->1<=a[i]<=9
// ->1<=D <=30
// ->100<=x<=5000
// The input format for testing

// The candidate has to write the code to accept 4 input(s).
// First input – Accept for N(Positive integer) values (a[]), where each value is separated by a
// new line.
// Third input – Accept value for D(Positive integer)
// Fourth input – Accept value for X(Positive integer )
// The output format for testing
// The output should be a positive integer number (Check the output in Example 1, Example e)
// if no fine is collected then print ”0”.

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size");
//         int size=sc.nextInt();

//         int a[]=new int[size];

//         for(int i=0;i<a.length;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         System.out.println("enter value of D");
//         int d=sc.nextInt();
//         System.out.println("enter value of x");
//         int x=sc.nextInt();
//         int count=0;

//         if(d%2==0)
//         {
//             for(int i=0;i<a.length;i++)
//             {
//                 if(a[i]%2==1)
//                 {
//                     count++;
//                 }
//             }
//         }
//         else
//         {
//             for(int i=0;i<a.length;i++)
//             {
//                 if(a[i]%2==0)
//                 {
//                     count++;
//                 }
//             }
//         }
//         System.out.println("total fine collected= "+count*x);
//     }
// }
// --------------------------------------------------------------------------------------
// 6)
// Problem Statement – An automobile company manufactures both a two wheeler (TW) and a
// four wheeler (FW). A company manager wants to make the production of both types of
// vehicle according to the given data below:
// a)1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
// b)2nd data, Total number of wheels = W
// The task is to find how many two-wheelers as well as four-wheelers need to manufacture as
// per the given data.
// Example :
// Input :
// 200 -> Value of V
// 540 -> Value of W
// Output :
// TW =130 FW=70
// Explanation:
// 130+70 = 200 vehicles
// (70*4)+(130*2)= 540 wheels
// Constraints :
// a)2<=W
// b)W%2=0
// c)V<W
// Print “INVALID INPUT” , if inputs did not meet the constraints.
// The input format for testing
// The candidate has to write the code to accept two positive numbers separated by a new line.
// a)First Input line – Accept value of V.

// b)Second Input line- Accept value for W.

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter Value of V");
//         int v=sc.nextInt();
//         System.out.println("enter Value of W");
//         int w=sc.nextInt();

//         if(w%2!=0 || v>=w || w<2)
//         {
//             System.out.println("Invalid input");
//         }
//         else
//         {
//             int fw=(w/2)-v;
//             int tw=v-fw;
//             System.out.println("TW= "+tw);
//             System.out.println("FW= "+fw);
//         }
//     }
// }
// ------------------------------------------------------------------------------------------
// 7)
// A party has been organised on cruise. The party is organised for a limited time(T). The
// number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as
// elements of the array. The task is to find the maximum number of guests present on the
// cruise at any given instance within T hours.
// Example 1:
// Input :
// a)5 -> Value of T
// b)[7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by
// new line
// c)[1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by new
// line.
// Output :
// 8 -> Maximum number of guests on cruise at an instance.
// Explanation:
// 1st hour:
// Entry : 7 Exit: 1
// No. of guests on ship : 6
// 2nd hour :
// Entry : 0 Exit : 2
// No. of guests on ship : 6-2=4
// Hour 3:
// Entry: 5 Exit: 1
// No. of guests on ship : 4+5-1=8
// Hour 4:
// Entry : 1 Exit : 3
// No. of guests on ship : 8+1-3=6
// Hour 5:
// Entry : 3 Exit: 4
// No. of guests on ship: 6+3-4=5
// Hence, the maximum number of guests within 5 hours is 8.
// Example 2:
// Input:
// 4 -> Value of T
// [3,5,2,0] -> E[], Element of E[0] to E[N-1], where input each element is separated by new
// line.
// [0,2,4,4] -> L[], Element of L[0] to L[N-1], while input each element in separated by new line

// Output:
// 6
// Cruise at an instance
// Explanation:
// Hour 1:
// Entry: 3 Exit: 0
// No. of guests on ship: 3
// Hour 2:
// Entry : 5 Exit : 2
// No. of guest on ship: 3+5-2=6
// Hour 3:
// Entry : 2 Exit: 4
// No. of guests on ship: 6+2-4= 4
// Hour 4:
// Entry: 0 Exit : 4
// No. of guests on ship : 4+0-4=0
// Hence, the maximum number of guests within 5 hours is 6.
// The input format for testing
// The candidate has to write the code to accept 3 input.
// First input- Accept value for number of T(Positive integer number)
// Second input- Accept T number of values, where each value is separated by a new line.
// Third input- Accept T number of values, where each value is separated by a new line.
// The output format for testing
// The output should be a positive integer number or a message as given in the problem
// statement(Check the output in Example 1 and Example 2)
// Constraints:
// a)1<=T<=25
// b)0<= E[i] <=500
// c)0<= L[i] <=500

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter size");
//         int size=sc.nextInt();

//         int a[]=new int[size];

//         System.out.println("number of guests entering");
//         for(int i=0;i<a.length;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         int b[]=new int[size];

//         System.out.println("number of guests leaving");
//         for(int i=0;i<b.length;i++)
//         {
//             b[i]=sc.nextInt(); 
//         }

//         int total=0;
//         int max=0;
//         for(int i=0;i<a.length;i++)
//         {
//              total=total+a[i]-b[i];
//              if(max<total)
//              {
//                  max=total;
//              }
//         }
//         System.out.println("Maximum number of guests on cruise at an instance= "+max);
//     }
// }
// -------------------------------------------------------------------------------------------
// 8)
// There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR
// can contain maximum N candies when JAR is full. At any point of time. JAR can have M
// number of Candies where M<=N. Candies are served to the customers. JAR is never remain
// empty as when last k candies are left. JAR if refilled with new candies in such a way that
// JAR get full.
// Write a code to implement above scenario. Display JAR at counter with available number of
// candies. Input should be the number of candies one customer can order at point of time.
// Update the JAR after each purchase and display JAR at Counter.

// Output should give number of Candies sold and updated number of Candies in JAR.
// If Input is more than candies in JAR, return: “INVALID INPUT”
// Given,
// N=10, where N is NUMBER OF CANDIES AVAILABLE
// K =< 5, where k is number of minimum candies that must be inside JAR ever.
// Example 1:(N = 10, k =< 5)
// Input Value
// 3
// Output Value
// NUMBER OF CANDIES SOLD : 3
// NUMBER OF CANDIES AVAILABLE : 7
// Example : (N=10, k<=5)
// Input Value
// 0
// Output Value
// INVALID INPUT NUMBER OF
// CANDIES LEFT : 10

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter number of candies");
//         int k=sc.nextInt();
//         int N=10;

//         if(k>5)
//         {
//             System.out.println("Invalid input");
//         }
//         else
//         {
//             int available=N-k;
//             System.out.println("NUMBER OF CANDIES SOLD= "+k);
//             System.out.println("NUMBER OF CANDIES AVAILABLE= "+available);
//         }
//     }
// }
// ----------------------------------------------------------------------------------------
// 9)
// Problem Statement
// We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per
// sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
// Take input as
// 1. Number of Interior walls
// 2. Number of Exterior walls
// 3. Surface Area of each Interior 4. Wall in units of square feet
// Surface Area of each Exterior Wall in units of square feet
// If a user enters zero as the number of walls then skip Surface area values as User may
// don’t want to paint that wall.
// Calculate and display the total cost of painting the property

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter Number of Interior walls");
//         int a= sc.nextInt();
//         System.out.println("enter Number of Exterior walls");
//         int b= sc.nextInt();
//         System.out.println("enter surface area");
//         int c= sc.nextInt();

//         int total;
//         if(c==0)
//         {
//              total=a*18+b*12;
//         }
//         else {
//             total=a*18*4+b*12;
//         }
//         System.out.println(total);
//     }
// }
// ---------------------------------------------------------------------------------------------
// 10)
// Ques. Write a code to check whether no is prime or not. Condition use function check() to
// find whether entered no is positive or negative ,if negative then enter the no, And if yes pas
// no as a parameter to prime() and check whether no is prime or not?
// a)Whether the number is positive or not, if it is negative then print the message “please enter
// the positive number”
// b)It is positive then call the function prime and check whether the take positive number is
// prime or not.

// import java.util.Scanner;
// public class Main {
//     static void checkPrime(int n)
//     {
//         int flag=0;
//         for(int i=2;i<n;i++)
//         {
//             if(n%i==0)
//             {
//                 flag=1;
//                 break;
//             }
//         }
//         if(flag==1)
//             System.out.println("not prime number");
//         else
//             System.out.println("prime number");
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter number");
//         int k=sc.nextInt();

//         if(k<0)
//         {
//             System.out.println("please enter the positive number");
//         }
//         else
//         {
//             checkPrime(k);
//         }
//     }
// }
// -----------------------------------------------------------------------------------








































