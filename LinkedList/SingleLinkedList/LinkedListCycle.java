
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        // check if the linkedlist is empty or has only one node
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // if there is a cycle ,the slow and fast pointer will meet
            if (slow == fast) {
                return true;
            }
        }
        // if the loop complete,there is no cycle
        return false;
    }

    public static void main(String[] args) {
        // ListNode | linked list
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(78);
        head.next.next.next = new ListNode(89);
        head.next.next.next.next = head.next;

        LinkedListCycle solution = new LinkedListCycle();
        boolean hasCycle = solution.hasCycle(head);

        if (hasCycle) {
            System.out.print("cycle is present in thids code ");
        } else {
            System.out.println("cycle is not present ");
        }
    }
}