
// public class LinkedListRevarce {
//     public static class Node {
//         int val;
//         Node next;

//         Node(int val) {
//             this.val = val;
//         }
//     }

//     public static void display(Node head) {
//         if (head == null) {
//             return;
//         }
//         display(head.next);
//         System.out.print(head.val + " ");
//     }

//     public static void main(String[] args) {
//         Node a = new Node(56);
//         Node b = new Node(45);
//         Node c = new Node(12);
//         Node d = new Node(78);
//         Node e = new Node(72);

//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         e.next = null;
//         display(a);
//     }
// }

// =======================================================================
// secound way--->

// public class LinkedListRevarce {
//     public static class Node {
//         int val;
//         Node next;

//         Node(int val) {
//             this.val = val;
//         }
//     }

//     public static Node reverse(Node head) {
//         if (head.next == null) {
//             return head;
//         }

//         Node newHead = reverse(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newHead;
//     }

//     public static void display(Node head) {
//         if (head == null) {
//             return;
//         }
//         System.out.print(head.val + " ");
//         display(head.next);
//     }

//     public static void main(String[] args) {
//         Node a = new Node(56);
//         Node b = new Node(45);
//         Node c = new Node(12);
//         Node d = new Node(78);
//         Node e = new Node(72);

//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         e.next = null;

//         System.out.println("dispaly");
//         display(a);
//         System.out.println();
//         a = reverse(a);
//         display(a);
//     }
// }
// ======================================================================

// third way , without recurasion--------->

// public class LinkedListRevarce {
//     public static class Node {
//         int val;
//         Node next;

//         Node(int val) {
//             this.val = val;
//         }
//     }

//     public static Node reverce(Node head) {
//         Node current = head;
//         Node previos = null;
//         Node after = null;

//         while (current != null) {
//             // number swap
//             after = current.next;
//             current.next = previos;
//             previos = current;
//             current = after;
//         }
//         return previos;
//     }

//     public static void display(Node head) {
//         if (head == null) {
//             return;
//         }
//         System.out.print(head.val + " ");
//         display(head.next);
//     }

//     public static void main(String[] args) {
//         Node a = new Node(56);
//         Node b = new Node(45);
//         Node c = new Node(12);
//         Node d = new Node(78);
//         Node e = new Node(72);

//         a.next = b;
//         b.next = c;
//         c.next = d;
//         d.next = e;
//         e.next = null;

//         System.out.println("dispaly");
//         display(a);
//         System.out.println();
//         Node r = reverce(a);
//         display(r);
//     }
// }
// ============================================
