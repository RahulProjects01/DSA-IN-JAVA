import java.util.*;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class Tree {
    static Scanner sc = new Scanner(System.in);

    static Node createTree() {
        Node root = null;
        System.out.println("Enter Data: ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter Left data: " + data);
        root.left = createTree();

        System.out.println("Enter Right data: " + data);
        root.right = createTree();

        return root;
    }

    public static void main(String[] args) {
        createTree();
    }
}