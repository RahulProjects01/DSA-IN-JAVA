// BFS in tree : Breadth first search

// level = 
// level 1: which element
// level 2 : which element
import java.util.*;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class BreadthFirstSearch {
    static Scanner sc = new Scanner(System.in);

    static Node createTree() {
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);
        System.out.println("Enter left data: " + data);
        root.left = createTree();

        System.out.println("Enter the right data: " + data);
        root.right = createTree();

        return root;
    }

    int maximum(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }

    void printCurrentLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.println(root.data + " ");

        } else if (level > 1) {
            printCurrentLevel(root.level, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        Node root = createTree();
        System.out.println("Enter level");
        int level = sc.nextInt();
        System.out.println("Node at level: " + level);
        tree.printCurrentLevel(root, level);
        int result = tree.maximum(root);
        System.out.println("Maximum in the tree: "+result);
    }}
