
public class LinkedListPallindrome {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        Node after = null;

        while (current != null) {
            after = current.next;
            current.next = previous;
            previous = current;
            current = after;
        }
        return previous;
    }

    public static boolean isPallindrome(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static void display(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        display(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(56);
        Node b = new Node(45);
        Node c = new Node(12);
        Node d = new Node(78);
        Node e = new Node(72);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        System.out.println("diaplay");
        display(a);
        System.out.println();
        boolean r = isPallindrome(a);
        System.out.println(r);

    }
}
