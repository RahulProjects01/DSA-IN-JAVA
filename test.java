// // impost java.util.*;
// public class test {
//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public static class linkedlist {
//         Node head = null;
//         Node tail = null;

//         void insertAtEnd(int val) {
//             Node temp = new Node(val);
//             if (head == null) {
//                 head = temp;
//             } else {
//                 tail.next = temp;
//             }
//             tail = temp;
//         }

//         void display() {
//             Node temp = head;
//             while (temp != null) {
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         linkedlist ll = new linkedlist();
//         ll.insertAtEnd(4);
//         ll.insertAtEnd(5);
//         ll.insertAtEnd(23);
//         ll.display();
//     }
// }
import java.util.*;
public class test {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtStart(int val) {
            Node temp = new Node(val);

            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            if (idx == size()) {
                insertAtEnd(val);
                return;
            }

            if (idx == 0) {
                insertAtStart(val);
                return;
            }

            else if (idx < 0) {
                System.out.println("Wrong index");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(23);
        ll.insertAtEnd(32);
        ll.insertAtEnd(34);
        ll.insertAtStart(222);
        ll.insertAt(0, 777);
        ll.display();
    }
}