// public class Main {
//     public static boolean prime(int n) {
//         if (n == 0 || n == 1) {
//             return false;
//         }
//         if (n == 2) {
//             return true;
//         }
//         for (int i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 return false;
//             } 
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int n = 1;
//         System.out.println(prime(n));

//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5 - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= 2 * i - 1; k++) {
//                 if (k == 1 || i == 5 || k == (2 * i - 1)) {
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main {
//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static class LinkedList {
//         Node head = null;
//         Node tail = null;

//         public void insertAtEnd(int data) {
//             Node temp = new Node(data);
//             if (head == null) {
//                 head = temp;
//             } else {
//                 tail.next = temp;
//             }
//             tail = temp;
//         }

//         public void insertAtFirst(int data) {
//             Node temp = new Node(data);
//             if (head == null) {
//                 head = temp;
//                 tail = temp;
//             } else {
//                 temp.next = head;
//                 head = temp;
//             }
//         }

//         public void insertMid(int index, int val) {
//             Node t = new Node(val);
//             Node temp = head;
//             for (int i = 1; i <= index - 1; i++) {
//                 temp = temp.next;
//             }
//             t.next = temp.next;
//             temp.next = t;
//         }

//         int size() {
//             int count = 0;
//             Node temp = head;
//             while (temp != null) {
//                 count++;
//                 temp = temp.next;
//             }
//             return count;
//         }

//         void deleteFirst() {
//             if (head == null) {
//                 System.out.println("HEad is null");
//                 return;
//             }
//             head = head.next;
//         }

//         public void deleteLast() {
//             // This is note good method
//             Node temp = head;
//             if (temp == null) {
//                 System.out.println("head is empty");
//                 return;
//             }
//             if (temp.next == null) {
//                 temp = null;
//                 head = temp;
//                 return;
//             }
//         }

//         void dispaly() {
//             Node temp = head;
//             while (temp != null) {
//                 System.out.println(temp.data + " ");
//                 temp = temp.next;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.insertAtEnd(14);
//         ll.insertAtEnd(15);
//         ll.insertAtEnd(44);
//         ll.insertAtEnd(65);
//         ll.insertAtFirst(1111);
//         ll.insertMid(2, 3333);
//         ll.deleteFirst();
//         ll.deleteLast();
//         ll.dispaly();
//         System.out.println(ll.size());
//     }
// }
// 2)
// Problem Statement – Rhea Pandey’s teacher has asked her to prepare well for the
// lesson on seasons. When her teacher tells a month, she needs to say the season
// corresponding to that month. Write a program to solve the above task.
// Spring – March to May,
// Summer – June to August,
// Autumn – September to November and,
// Winter – December to February.
// Month should be in the range 1 to 12. If not the output should be “Invalid month”.
// Sample Input 1:
// Enter the month:11
// Sample Output 1:
// Season:Autumn
// Sample Input 2:
// Enter the month:13
// Sample Output 2:
// Invalid month

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a month");
//         int month = sc.nextInt();

//         if (month > 12) {
//             System.out.println("Enter valid Month");
//         }
//         else if (month >= 3 && month <= 5) {
//             System.out.println("Spring");
//         }
//         else if (month >= 6 && month <= 8) {
//             System.out.println("Summer");
//         }
//         else if (month >= 9 && month <= 11) {
//             System.out.println("Autumn");
//         }
//         else if (month >= 1 && month <= 2 || month == 12) {
//             System.out.println("Winter");
//         }
//     }
// }
import java.util.Scanner;

public class TrafficFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N (number of vehicles)
        int N = scanner.nextInt();
        int[] registrationNumbers = new int[N];

        // Input registration numbers of N vehicles
        for (int i = 0; i < N; i++) {
            registrationNumbers[i] = scanner.nextInt();
        }

        // Input date D
        int D = scanner.nextInt();

        // Input fine amount X
        int X = scanner.nextInt();

        // Calculate total fine collected
        int totalFine = calculateTotalFine(registrationNumbers, D, X);

        // Output the result
        System.out.println(totalFine);

        // Close the scanner
        scanner.close();
    }

    private static int calculateTotalFine(int[] registrationNumbers, int date, int fineAmount) {
        int totalFine = 0;

        for (int i = 0; i < registrationNumbers.length; i++) {
            // Check if the vehicle violates the rule based on the date
            if ((date % 2 == 0 && registrationNumbers[i] % 2 != 0) || (date % 2 != 0 && registrationNumbers[i] % 2 == 0)) {
                totalFine += fineAmount;
            }
        }

        return totalFine;
    }
}
