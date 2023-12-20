// 1)Node 
// simple node 
// ----------------------------------

// public class Ab{
//     public static class Node{
//         int data;
//         Node next;
//     }
//     public static void main(String[] args) {
//         Node x1 = new Node();
//         System.out.println(x1.next);
//     }
// }

// -------------------------------------------------------------
// // 2)
// // address print with separate 
// // Node1    

// // Node2     12,56,78,34,78,23,12
// // ----------------------------------
// public class Ab {
//     public static class Node1 {
//         int data;
//         Node1 next;

//         Node1(int data) {
//             this.data = data;
//         }
//     }

//     public static class Node2 {
//         int data2;
//         Node2 next2;

//         Node2(int data2) {
//             this.data2 = data2;
//         }
//     }

//     public static void main(String[] args) {
//         // 23,78,34,12
//         Node1 x1 = new Node1(23);
//         Node1 x2 = new Node1(78);
//         Node1 x3 = new Node1(34);
//         Node1 x4 = new Node1(12);

//         System.out.println(x1.next);
//         System.out.println(x2.next);
//         System.out.println(x3.next);
//         System.out.println(x4.next);

//         System.out.println("Node2 data");
        
//         Node2 y1 = new Node2(23);
//         Node2 y2 = new Node2(78);
//         Node2 y3 = new Node2(34);
//         Node2 y4 = new Node2(12);

//         System.out.println(y1.next2);
//         System.out.println(y2.next2);
//         System.out.println(y3.next2);
//         System.out.println(y4.next2);
//     }
// }
// ---------------------------------------------------------------------------


// // 4)
// // 23,78,34,12 

// // 12,56,78,34,78,23,12

// // data print 
// public class Ab {
//     public static class Node1 {
//         int data;
//         Node1 next;

//         Node1(int data) {
//             this.data = data;
//         }
//     }

//     public static class Node2 {
//         int data2;
//         Node2 next2;

//         Node2(int data2) {
//             this.data2 = data2;
//         }
//     }

//     public static void main(String[] args) {
//         // 23,78,34,12
//         Node1 x1 = new Node1(23);
//         Node1 x2 = new Node1(78);
//         Node1 x3 = new Node1(34);
//         Node1 x4 = new Node1(12);

//         System.out.println(x1.data);
//         System.out.println(x2.data);
//         System.out.println(x3.data);
//         System.out.println(x4.data);

//         System.out.println("Node2 data");
//         // 12,56,78,34,78,23,12

//         Node2 y1 = new Node2(12);
//         Node2 y2 = new Node2(56);
//         Node2 y3 = new Node2(78);
//         Node2 y4 = new Node2(23);
//         Node2 y5 = new Node2(12);

//         System.out.println(y1.data2);
//         System.out.println(y2.data2);
//         System.out.println(y3.data2);
//         System.out.println(y4.data2);
//         System.out.println(y5.data2);
//     }
// }
// -------------------------------------------------------------------

// // 4)
// // 23,78,34,12 

// // 12,56,78,34,78,23,12

// // data print 
// public class Ab {
//     public static class Node1 {
//         int data;
//         Node1 next;

//         Node1(int data) {
//             this.data = data;
//         }
//     }

//     public static class Node2 {
//         int data2;
//         Node2 next2;

//         Node2(int data2) {
//             this.data2 = data2;
//         }
//     }

//     public static void main(String[] args) {
//         // 23,78,34,12
//         Node1 x1 = new Node1(23);
//         Node1 x2 = new Node1(78);
//         Node1 x3 = new Node1(34);
//         Node1 x4 = new Node1(12);
//         x1.next = x2;
//         x2.next = x3;
//         x3.next = x4;

//         System.out.println(x1);
//         System.out.println(x2);
//         System.out.println(x3);
//         System.out.println(x4);

//         System.out.println(x1.data);
//         System.out.println(x1.next.data);
//         System.out.println(x1.next.next.data);
//         System.out.println(x1.next.next.next.data);

//         System.out.println("Node2 data");
//         // 12,56,78,34,78,23,12

//         Node2 y1 = new Node2(12);
//         Node2 y2 = new Node2(56);
//         Node2 y3 = new Node2(78);
//         Node2 y4 = new Node2(23);
//         Node2 y5 = new Node2(12);

//         y1.next2 = y2;
//         y2.next2 = y3;
//         y3.next2 = y4;
//         y4.next2 = y5;

//         System.out.println(y1);
//         System.out.println(y2);
//         System.out.println(y3);
//         System.out.println(y4);
//         System.out.println(y5);

//         System.out.println(y1.data2);
//         System.out.println(y1.next2.data2);
//         System.out.println(y1.next2.next2.data2);
//         System.out.println(y1.next2.next2.next2.data2);
//         System.out.println(y1.next2.next2.next2.next2.data2);
//     }
// }
// --------------------------
