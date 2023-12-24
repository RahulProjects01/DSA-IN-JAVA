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

//         void insertAdd(int data) {
//             Node temp = new Node(data);
//             if (head == null) {
//                 head = temp;
//             } else {
//                 tail.next = temp;
//             }
//             tail = temp;
//         }

//         int size() {
//             int count = 0;
//             Node temp = head;
//             while (temp != null) {
//                 temp = temp.next;
//                 count++;
//             }
//             return count;
//         }

//         void display(){
//             Node temp = head;
//             while (temp!= null) {
//                 System.out.println(temp.data);
//                 temp = temp.next;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.insertAdd(22);
//         ll.insertAdd(33);
//         ll.insertAdd(23);
//         ll.insertAdd(44);
//         ll.display();
//         System.out.println("Length of LinkedList: "+ll.size());
//     }
// }

// ============================================================
// Bubble Sort --------->

// public class Main {
//     public static void print(int a[]) {
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }

//     public static void bubble(int a[]) {
//         for (int i = 0; i < a.length - 1; i++) {
//             for (int j = 0; j < a.length - i - 1; j++) {
//                 if (a[j] > a[j + 1]) {
//                     int temp = a[j];
//                     a[j] = a[j + 1];
//                     a[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int a[] = { 23, 46, 7, 8, 9, 99, 39, 77, 11 };
//         bubble(a);
//         print(a);
//     }
// ======================================================================================

// 3)insertion sort 

// public class Main {

//     public static void insertionSort(int a[]) {
//         for (int i = 0; i < a.length; i++) {
//             int j = 0;
//             while (j > 0 && a[j] > a[j - 1]) {
//                 int temp = a[j];
//                 a[j] = a[j - 1];
//                 a[j - 1] = temp;
//                 j--;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int a[] = { 10, 20, 30, 40, 50, 60 };
//         insertionSort(a);
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }


// ===============================

// public class Main {
//     public static void selectionSort(int a[])
//     {
//         for (int i = 0; i < a.length-1; i++) {
//             int min_value = i;
//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[j] < a[min_value]) {
//                     min_value = j;
//                 }
//             }
//             int temp = a[i];
//             a[i] = a[min_value];
//             a[min_value] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         int a[] = {20,70,90,80,50,60};
//         selectionSort(a);
//         for (int i = 0; i < a.length; i++) {
//         System.out.print(a[i]+" ");
//        }
//     }
// }

// mearge sort---------->

// public class Main {
//     static void display(int a[]) {
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//         System.out.println();
//     }

//     static void merge(int arr[], int l, int mid, int r) {
//         int n1 = mid - l + 1;
//         int n2 = r - mid;
//         int[] left = new int[n1];
//         int[] right = new int[n2];
//         int i, j, k;
//         for (i = 0; i < n1; i++) {
//             left[i] = arr[l + i];
//         }
//         for (j = 0; j < n2; j++) {
//             right[j] = arr[mid + 1 + j];
//         }
//         i = 0;
//         j = 0;
//         k = l;
//         while (i < n1 && j < n2) {
//             if (left[i] < right[j]) {
//                 arr[k++] = left[i++];
//             } else {
//                 arr[k++] = right[j++];
//             }
//         }
//         while (i < n1) {
//             arr[k++] = left[i++];
//         }
//         while (i < n2) {
//             arr[k++] = right[j++];
//         }
//     }

//     static void mergeSort(int arr[], int l, int r) {
//         if (l >= r) {
//             return;
//         }
//         int mid = (l + r) / 2;
//         mergeSort(arr, l, mid);
//         mergeSort(arr, mid + 1, r);
//         merge(arr, l, mid, r);
//     }

//     public static void main(String[] args) {
//         int a[] = { 23, 7, 81, 76, 18, 8 };
//         int n = a.length;
//         display(a);
//         mergeSort(a, 0, n - 1);
//         display(a);
//     }
// }