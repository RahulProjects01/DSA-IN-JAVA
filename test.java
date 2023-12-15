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
        Node size = 0;
        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtStart(int val) {
            Node temp = new Node(val);

            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;

            if (idx == size) {
                insertAtEnd(val);
                return;
            }

            if (idx == 0) {
                insertAtStart(val);
                return;
            }

            else if (idx < 0 || idx > size) {
                System.out.println("Wrong index");
                return;
            }

            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        // get value function
        int getAt(int idx) {
              if (idx < 0 || idx > size) {
                System.out.println("Wrong index");
                return -1;
            }
            
            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // int size() {
        //     Node temp = head;
        //     int count = 0;

        //     while (temp != null) {
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(23);
        ll.insertAtEnd(32);
        ll.insertAtEnd(34);
        ll.insertAtStart(222);
        ll.insertAt(0, 777);
        ll.display();

        System.out.println(ll.getAt(0));
        System.out.println(ll.size);
        // System.out.println("size if linkedList: "+ll.size());
    }
}