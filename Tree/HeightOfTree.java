// import java.util.*;

// class Node {
//     Node left, right;
//     int data;

//     public Node(int data) {
//         this.data = data;
//     }
// }

// public class HeightOfTree {
//     static Scanner sc = new Scanner(System.in);

//     static Node createTree() {
//         Node root = null;
//         System.out.println("enter the data");
//         int data = sc.nextInt();

//         if (data == -1) {
//             return null;
//         }

//         root = new Node(data);
//         System.out.println("Enter left data" + data);
//         root.left = createTree();

//         System.out.println("Enter right data" + data);
//         root.right = createTree();
//         return root;

//     }
    
//     static int height(Node root) {
//         if (root == null) {
//             return 0;
//         }
//         int leftHeight = height(root.left);
//         int rightHeight = height(root.right);

//         return 1 + Math.max(leftHeight, rightHeight);
//     }
//     public static void main(String[] args) {
//         Node root = createTree();
//         int result = height(root);
//         System.out.println("result: "+result);
//     }
// }



