
// // size of binary tree : how many nodes present in a tree
// // lenght = start from 1 
// // size = start from 0

import java.util.*;

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

public class SizeOfTree {
    static Scanner sc = new Scanner(System.in);

    static Node creatTree() {
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);
        System.out.println("Enter left data: " + data);
        root.left = creatTree();

        System.out.println("Enter right data : " + data);
        root.right = creatTree();
        return root;
    }

    static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    public static void main(String[] args) {
        Node root = creatTree();
        int result = size(root);
        System.out.println("size of the tree: " + result);
    }
}
