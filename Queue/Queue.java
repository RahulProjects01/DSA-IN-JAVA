// QUEUE

// import java.util.*;
// public class Main{
// public static void main(String[] args) {
// Queue<Integer> q = new LinkedList<>();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// Queue<Integer> helper = new ArrayDeque<>();
// while(q.size() > 0){
// System.out.println(q.peek() + " ");
// helper.add(q.poll());
// }
// System.out.println();
// System.out.println("helper" + helper);
//
// while(helper.size() > 0){
// q.add(helper.poll());
// System.out.println(q);
// }
// System.out.println(q);
// }
// }
// ==========================================================================================================
// predefined method add() remove() peek() empty() display() method

// public class Main {
// public static class QueueA {
// int front = -1;
// int rear = -1;
// int size = 0;
// int[] a = new int[5];
//
// public void add(int value) {
// if (rear == a.length - 1) {
// System.out.println("Queue is full");
// return;
// }
// if (front == -1) {
// front = rear = 0;
// a[0] = value;
// } else {
// a[++rear] = value;
// }
// size++;
// }
//
// public int remove() {
// if (size == 0) {
// System.out.println("Queue is Empty");
// return -1;
// }
// front++;
// size--;
// return a[front - 1];
// }
//
// public int peek() {
// if (size == 0) {
// System.out.println("Queue is Empty");
// return -1;
// }
// return a[front];
// }
//
// public boolean isEmpty() {
// if (size == 0) {
// return true;
// } else {
// return false;
// }
// }
// public void display() {
// if (size == 0) {
// System.out.println("Queue is Empty");
// } else {
// for (int i = front; i <= rear; i++) {
// System.out.println(a[i] + " ");
// }
// }
// System.out.println();
// }
// }
// public static void main(String[] args) {
// QueueA q = new QueueA();
// q.display();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// q.display();
//     }
// }

//LinkedList node through Queue
public class Queue {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class QueueA {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;

            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue empty");
                return -1;
            }
            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("queue empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public void display() {
            if (size == 0) {
                System.out.println("queue is empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.display();
        q.add(23);
        q.add(43);
        q.add(43);
        q.add(44);
        System.out.println("print all element");
        q.display();
        System.out.println("remove");
        q.remove();
        q.display();
        System.out.println("peek element");
        System.out.println(q.peek());

    }
}




 