package main.java.Algorithms.BST;

/**
 * Created by hungle on 1/22/18.
 */
public class Insertion {
    private static class Node {
        int data;
        Node left;
        Node right;

        private Node(int data) {
            this.data = data;
        }
    }

    public static void main(String [] args) {
        Node root = new Node(4);
        root.right = new Node(7);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        insert(root, 6);
        return;
    }

    private static Node insert(Node root, int value) {
        Node current = root;
        if (current == null) {
            current = new Node(value);
        } else {
            if (value > current.data) {
                current.right = insert(current.right, value);
            } else {
                current.left = insert(current.left, value);
            }
        }
        return current;
    }
}
