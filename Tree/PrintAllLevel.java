
// print all the level of a tree at all level
import java.util.*;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class PrintAllLevel {

    static Scanner sc = new Scanner(System.in);

    static Node createTree() {
        Node root = null;
        System.out.println("Enter left data: " + data);
        root.left = createTree();

        System.out.println("Enter the right data: " + data);
        root.right = createTree();

        return root;
    }

    void printAllLevel(Node root) {
        int height = getHeight(root);
        for (int i = 1; i <= height; i++) {
            System.out.println("node at level: " + i + " ");
            printCurrentLevel(root, i);
            System.out.println();
        }
    }

    int getHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    void printCurrentLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.println(root.data + " ");
        } else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        Node root = createTree();
        tree.printAllLevel(root);
    }
}
