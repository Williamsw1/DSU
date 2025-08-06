package JavaProgramming;



public class BinarySearchTree {

    // Node class (static nested class inside BinarySearchTree)
    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    // Insert a node
    Node insert(Node node, int key) {
        if (node == null) return new Node(key);
        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        return node;
    }

    // Public insert method
    void insert(int key) {
        root = insert(root, key);
    }

    // Search a node
    boolean search(Node node, int key) {
        if (node == null) return false;
        if (key == node.key) return true;
        return key < node.key ? search(node.left, key) : search(node.right, key);
    }

    // Find minimum value node
    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete a node
    Node delete(Node root, int key) {
        if (root == null) return root;

        if (key < root.key)
            root.left = delete(root.left, key);
        else if (key > root.key)
            root.right = delete(root.right, key);
        else {
             // Node to be deleted found
            //System.out.println("Deleted node: " + root.key);
            
            // Node with one or no child
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            // Node with two children
            root.key = minValueNode(root.right).key;
            root.right = delete(root.right, root.key);
        }
        return root;
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int val : values)
            bst.insert(val);

        System.out.print("Inorder traversal: ");
        bst.inorder(bst.root);
        System.out.println();

        System.out.print("Search 40: ");
        System.out.println(bst.search(bst.root, 40));  // true

        bst.root = bst.delete(bst.root, 50);
      
        System.out.print("Inorder after deleting 50: ");
        bst.inorder(bst.root);
        System.out.println();
    }
}


// class Node {
//     int key;
//     Node left, right;

//     Node(int item) {
//         key = item;
//         left = right = null;
//     }
// }

// public class BinarySearchTree {
//     Node root;

//     // Insert a node
//     Node insert(Node node, int key) {
//         if (node == null) return new Node(key);
//         if (key < node.key)
//             node.left = insert(node.left, key);
//         else if (key > node.key)
//             node.right = insert(node.right, key);
//         return node;
//     }

//     // Public insert method
//     void insert(int key) {
//         root = insert(root, key);
//     }

//     // Search a node
//     boolean search(Node node, int key) {
//         if (node == null) return false;
//         if (key == node.key) return true;
//         return key < node.key ? search(node.left, key) : search(node.right, key);
//     }

//     // Find minimum value node
//     Node minValueNode(Node node) {
//         Node current = node;
//         while (current.left != null)
//             current = current.left;
//         return current;
//     }

//     // Delete a node
//     Node delete(Node root, int key) {
//         if (root == null) return root;

//         if (key < root.key)
//             root.left = delete(root.left, key);
//         else if (key > root.key)
//             root.right = delete(root.right, key);
//         else {
//             // Node with only one child or no child
//             if (root.left == null) return root.right;
//             else if (root.right == null) return root.left;

//             // Node with two children
//             root.key = minValueNode(root.right).key;
//             root.right = delete(root.right, root.key);
//         }
//         return root;
//     }

//     // Inorder traversal (sorted output)
//     void inorder(Node root) {
//         if (root != null) {
//             inorder(root.left);
//             System.out.print(root.key + " ");
//             inorder(root.right);
//         }
//     }

//     // Preorder traversal
//     void preorder(Node root) {
//         if (root != null) {
//             System.out.print(root.key + " ");
//             preorder(root.left);
//             preorder(root.right);
//         }
//     }

//     // Postorder traversal
//     void postorder(Node root) {
//         if (root != null) {
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.key + " ");
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         BinarySearchTree bst = new BinarySearchTree();
//         int[] values = {50, 30, 20, 40, 70, 60, 80};

//         for (int val : values)
//             bst.insert(val);

//         System.out.print("Inorder: ");
//         bst.inorder(bst.root);
//         System.out.println();

//         System.out.print("Search 40: ");
//         System.out.println(bst.search(bst.root, 40));  // true

//         bst.root = bst.delete(bst.root, 50);
//         System.out.print("Inorder after deleting 50: ");
//         bst.inorder(bst.root);
//         System.out.println();
//     }
// }
