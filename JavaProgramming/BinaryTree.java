package JavaProgramming;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int val) {
        data = val;
        left = right = null;
    }
}

public class BinaryTree {

    TreeNode root;

    // Insertion in Level Order
    void insert(int key) {
        TreeNode newNode = new TreeNode(key);
        if (root == null) {
            root = newNode;
            return;
        }       
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else q.add(temp.left);

            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else q.add(temp.right);
        }
    }

    // Inorder traversal
    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Preorder traversal
    void preorder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder traversal
    void postorder(TreeNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Search operation
    boolean search(TreeNode node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
        return search(node.left, key) || search(node.right, key);
    }

    // Height of tree
    int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    // Main method
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(40);
        bt.insert(50);

        System.out.print("Inorder: ");
        bt.inorder(bt.root);         // Output: 40 20 50 10 30

        System.out.print("\nPreorder: ");
        bt.preorder(bt.root);        // Output: 10 20 40 50 30

        System.out.print("\nPostorder: ");
        bt.postorder(bt.root);       // Output: 40 50 20 30 10

        int key = 50;
        System.out.println("\nSearch " + key + ": " + bt.search(bt.root, key)); // true

        System.out.println("Height of tree: " + bt.height(bt.root)); // 3
    }
}

