// import org.w3c.dom.Node;

// public class DoublyLinkedListInsertAtHead {
//     public static class Node {
//         int val;
//         Node next;
//         Node privous;

//         Node(int val) {
//             this.val = val;
//         }
//     }

//     public static void display(Node head) {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public static Node insertAtHead(Node head, int x) {
//         Node t = new Node(30);
//         t.next = head;
//         head.privous = t;
//         head = t;
//         return head;
//     }

//     public static void insertAtTail(Node head, int x) {
//         Node temp = head;
//         // temp ko tail talk lay
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         Node t = new Node(x);
//         temp.next = t;
//         t.privous = temp;
//     }

//      public static void insertAtIndex(Node head, int index, int value) {
//         Node s = head;
//         for (int i = 0; i < index; i++) {
//             s = s.next;
//         }//time compexity : O(n)
//         Node r = s.next;
//         Node t = new Node(value);
//         s.next = t;
//         t.privous = s;
//         t.next = r;
//         r.privous = t;
//     }

//     public static void main(String[] args) {
//         Node a = new Node(7);
//         insertAtHead(a, 2);
//         insertAtIndex(a, 0, 33);
//         display(a);
//     }
// }

// ===========================

// public class DoublyLinkedListInsertAtHead {
// public static class Node {
// int val;
// Node next;
// Node previous;

// Node(int val) {
// this.val = val;
// }
// }

// public static void dispaly(Node head) {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.val + " ");
// temp = temp.next;
// // temp = temp.previous;
// }
// }

// public static void insertAtTail(Node head, int x) {
// Node temp = head;
// // temp ko tail talk lay
// while (temp.next != null) {
// temp = temp.next;
// }
// Node t = new Node(x);
// temp.next = t;
// t.previous = temp;
// }

// public static void insertAtIndex(Node head, int index, int value) {
// Node s = head;
// for (int i = 1; i <= index-1; i++) {
// s = s.next;
// }
// Node r = s.next;
// Node t = new Node(value);
// s.next = t;
// t.previous = s;
// t.next = r;
// r.previous = t;
// }

// public static void main(String[] args) {
// Node a = new Node(56);
// Node b = new Node(48);
// Node c = new Node(12);
// Node d = new Node(78);
// Node e = new Node(79);

// a.next = b;
// a.previous = null;

// b.next = c;
// b.previous = a;

// c.next = d;
// c.previous = b;

// d.next = e;
// d.previous = c;

// e.next = null;
// e.previous = d;

// // insertAtTail(a, 2);
// insertAtIndex(a, 0, 22);
// dispaly(a);
// }
// }
// ==================================================



public class DoublyLinkedListInsertAtHead {
    public static class Node {
        int val;
        Node next;
        Node privous;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void insertAtTail(Node head, int x) {
        Node temp = head;
        // temp ko tail tak ley
        while (temp.next != null) {
            temp = temp.next;
        }//o(n) 
        Node t = new Node(x);
        temp.next = t;
        t.privous = temp;
    } 

    public static void insertAtIndex(Node head, int index, int value) {
        Node s = head;
        for (int i = 0; i < index; i++) {
            s = s.next;
        }//time compexity : O(n)
        Node r = s.next;
        Node t = new Node(value);
        s.next = t;
        t.privous = s;
        t.next = r;
        r.privous = t;
    }

    public static void main(String[] args) {
        Node a = new Node(56);
        Node b = new Node(48);
        Node c = new Node(12);
        Node d = new Node(78);
        Node e = new Node(79);

        a.next = b;
        a.previous = null;

        b.next = c;
        b.previous = a;

        c.next = d;
        c.previous = b;

        d.next = e;
        d.previous = c;

        e.next = null;
        e.previous = d;

        insertAtIndex(a, 2, 10);
        display(a);
    }
}