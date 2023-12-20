
public class RandomDoublyLinkedList {
    public static class Node {
        int val;
        Node next;
        Node previous;

        Node(int val) {
            this.val = val;
        }
    }

    public static void dispaly(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void dispalyRandom(Node random) {
        Node temp = random;
        while (temp.previous != null) {
            temp = temp.previous;
        }

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
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

        dispaly(a);

        System.out.println("display for Random: ");
        dispalyRandom(e);
    }
}
