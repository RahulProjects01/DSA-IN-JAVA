// delete minddle node --------->



class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class A {
    public ListNode deleteMListNode(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = slow.next;
        }
        else {
            head = head.next;
        }
        return head;
    }
}

public class test {
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(12);
        head.next = new ListNode(67);
        head.next = new ListNode(12);
        head.next = new ListNode(78);
        head.next = new ListNode(8);

        System.out.println("orignal");
        printList(head);

        A k = new A();
        k.deleteMListNode(head);
        System.out.println("delete");
        printList(head);

    }
}
