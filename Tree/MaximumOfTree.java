import java.util.*;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class MaximumOfTree {
    static Scanner sc = new Scanner(System.in);

    static Node createTree(){
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        root = new Node(data);
        System.out.println("Enter left data: "+data);
        root.left = createTree();

        System.out.println("Enter right data: "+data);
        root.right = createTree();
        return root;
    }

    static int maximum(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static void main(String[] args) {
        Node root = createTree();
        int result = maximum(root);
        System.out.println("Max: " + result);
    }
}
