// public class Main{
//     public static void main(String[] args){
//         int a[] = {1,2,3,1};
//         int max = 0;
//         int index = 0;
//         for(int i=0;i<a.length-1;i++){
//             if(a[i] > a[i+1]){
//                 max = a[i];
//                 index = i;        
//             }
//         }

//         System.out.println(max);
//         System.out.println(index);
//     }
// }

// ========================================

// public class Main {
//     public static void main(String[] args) {
//         int a[][] = { { 95, 92, 95 }, { 92, 90, 92 }, { 90, 92, 90 } };
//         int sum = 0;
//         int sum2 = 0;
//         int max = 0;
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 if(a[i][j] > max){
//                     max = a[i][j];
//                     sum+=a[i][j];

//                 }  
//             }

//         }
//           System.out.print(sum + " ");

//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < a[i].length; j++) {
//                 a[i][j] = a[j][i];
//                 sum2 += a[j][i];
//                 break;
//             }

//         }
//         System.out.println("max num is: "+max);

//     }
// }

// ===================
// Q.1 ------->

// public class Main {
//     public static void main(String[] args) {
//         int a[] = { 1, 2, 3, 4, 5, 6, 7 };
//         int k = 3;
//         while (k > 0) {
//             for (int i = a.length - 1; i > 0; i--) {
//                 int temp = a[i];
//                 a[i] = a[i - 1];
//                 a[i - 1] = temp;
//             }
//             k--;
//         }
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }
// ===============================================
// import java.util.*;

// public class Main {
//     static void printArray(int arr[][]) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static int[][] spiral(int n) {
//         int a[][] = new int[n][n];
//         int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
//         int current = 1;
//         while (current < n * n) {
//             for (int j = leftCol; j < rightCol && current <= n * n; j++) {
//                 a[topRow][j] = current++;
//             }
//             topRow++;

//             for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
//                 a[i][rightCol] = current++;
//             } 
//             rightCol--;

//             for (int j = rightCol; j > leftCol && current <= n * n; j--) {
//                 a[bottomRow][j] = current++;
//             }
//             bottomRow--;

//             for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
//                 a[i][leftCol] = current++;
//             }
//             leftCol++;
//         }
//         return a;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n value: ");
//         int n = sc.nextInt();
//         int arr[][] = spiral(n);
//       printArray(arr);
//     }
// }

// =====================
// Q.4 ---->

// import java.util.*;

// public class Main {
//     static Scanner sc = new Scanner(System.in);
//         public static void main(String[] args) {
//         int x = 3;
//         String n = "";
//         while (x != 0) {
//             String s = sc.nextLine();
//             for (int i = 0; i < s.length(); i++) {
//                 if (x == 3) {
//                     if (s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'a' || s.charAt(i) == 'u'
//                             || s.charAt(i) == 'e') {
//                         n += "%";
//                     } else {
//                         n += s.charAt(i);
//                     }
//                 }
//                 if (x == 2) {
//                     if (s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'a' || s.charAt(i) == 'u'
//                             || s.charAt(i) == 'e') {
//                         n += s.charAt(i);
//                     } else {
//                         n += "#";
//                     }
//                 }
//             }
//             if (x == 1) {
//                 n += s.toUpperCase();
//             }
//             x--;
//         }
//         System.out.print(n);
//     }
// }

//================================
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {

//         String arr[] = { "home", "myfirst", "downloads", "myfirst", "myfirst" };
//         int count = 0;
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i] == arr[i+1]){
//                 System.out.print(arr[i] +": already exists in our system. So Add1 at the end of the folder name");
//                 count++;
//             }
//         else{
//             System.out.print(arr[i] +": "+" is unique");
//         }
//         System.out.println();
//         }
//        System.out.println("duplicate elements is: "+count);
//     }
// }

// public class Main {
//     static void print(int a[]) {
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }

//     static void zero(int a[]) {
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; i < a.length; j++) {
//                 if (a[i] != 0) {
//                     int temp = a[i];
//                     a[i] = a[j];
//                     a[j] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int a[] = { 1, 0, 2, 0, 4, 0, 9, 0 };
//         print(a);
//         zero(a);
//         print(a);

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int a[] = { 2, 3, 5, 7, 11, 13 };
//      int flag=0 ;
//         for(int i=0;i<a.length;i++){
            
//             for(int j=0;j<a.length;j++){
//                 if(i%j==0){
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag ==0){
//             System.out.print(a[i]+" ");
//         }
//         }
        
//     }
// }


// public class test{
//     static void printBinary(int binary[],int id){
//         for(int i=id-1;i>=0;i--)
//         {
//             System.out.print(binary[i]+"");
//         }
//     }
//     static void decimalToBinary(int num){
//         int[] binary = new int[35];
//         int id = 0;

//         while (num > 0) {
//             binar[id++] = num %2;
//             num = num /2;

//         }
//         printBinary(binary, id);
//     }
// public static void main(String[] args) {
//     int num = 5;

//     decimalToBinary(num);
// }
// }