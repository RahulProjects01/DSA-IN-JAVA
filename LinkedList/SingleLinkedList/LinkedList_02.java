// 1)linkedlist 

// add() 

// first elemet pr add 

// mid mey insert 

// 1 2 3 4 5 
// insert =>1 
// 23

// insert :2 
// 78

// insert :5
// 89
// ---------------------------------------------------------------
// // 1)linkedlist 
// // add() 
// // first elemet pr add 
// // mid mey insert 
// // 1 2 3 4 5 
// // insert =>1 
// // 23
// // insert :2 
// // 78
// // insert :5
// // 89

// public class Main {
//   static class Node {
//     int data;
//     Node next;

//     Node(int data) {
//       this.data = data;
//     }
//   }

//   static class LinkedList {
//     Node head = null;
//     Node tail = null;

//     void addLast(int val) {
//       Node temp = new Node(val);
//       if (head == null) {
//         head = temp;
//       } else {
//         tail.next = temp;
//       }
//       tail = temp;
//     }

//     void addMid(int index, int val) {
//       Node t = new Node(val);
//       Node temp = head;
//       for (int i = 1; i <= index-1; i++) {
//         temp = temp.next;
//       }
//       t.next = temp.next;
//       temp.next = t;
//     }

//     void display() {
//       Node temp = head;
//       while (temp != null) {
//         System.out.println(temp.data + " ");
//         temp = temp.next;
//       }
//     }

//     void addFirst(int val) {
//       Node temp = new Node(val);

//       if (head == null) {
//         head = temp;
//         tail = temp;
//       } else {
//         temp.next = head;
//         head = temp;
//       }
//     }
//   }

//   public static void main(String[] args) {
//     LinkedList ll = new LinkedList();
//     ll.addLast(67);
//     ll.addLast(89);
//     ll.addLast(12);
//     ll.addLast(97);
//     System.out.println("Real LinkedList------------------------");
//     ll.display();

//     System.out.println("insert element first index-------------------------");
//     ll.addFirst(34);
//     ll.display();

//     System.out.println(" insert element mid index-------------------------");
//     ll.addMid(1, 99);
//     ll.display();
    
//     System.out.println("insert element last index-------------------------");
//     ll.addLast(100);
//     ll.display();
//   }
// }
// -------------------------------------------------------------------
// // --------------------------------------------------------------------
// // 23 67 89 23 12 

// // insert element 
// // -------------------------
// // count()
// // --------------------------
// // length()

// // ------------
// // size() 

// public class Main {
//   static class Node {
//     int data;
//     Node next;

//     Node(int data) {
//       this.data = data;
//     }
//   }

//   static class LinkedList {
//     Node head = null;
//     Node tail = null;

//     void addLast(int val) {
//       Node temp = new Node(val);
//       if (head == null) {
//         head = temp;
//       } else {
//         tail.next = temp;
//       }
//       tail = temp;
//     }

//     void display() {
//       Node temp = head;
//       while (temp != null) {
//         System.out.println(temp.data + " ");
//         temp = temp.next;
//       }
//     }

//     int size() {
//       int count = 0;
//       Node temp = head;
//       while (temp != null) {
//         count++;
//         temp = temp.next;
//       }
//       return count;
//     }

//     int length() {
//       int count = 0;
//       Node temp = head;
//       while (temp != null) {
//         count++;
//         temp = temp.next;
//       }
//       return count;
//     }

//     int count() {
//       int count = 0;
//       Node temp = head;
//       while (temp != null) {
//         count++;
//         temp = temp.next;
//       }
//       return count;
//     }
//   }

//   public static void main(String[] args) {
//     LinkedList ll = new LinkedList();
//     ll.addLast(23);
//     ll.addLast(33);
//     ll.addLast(23);
//     ll.addLast(44);
//     ll.addLast(90);
//     ll.display();
//     System.out.println("size of LinkedList: " + ll.size());
//     System.out.println("length of LinkedList: " + ll.length());
//     System.out.println("count of LinkedList: " + ll.count());
//   }
// }