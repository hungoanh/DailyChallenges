package main.java.Algorithms.LinkedLists;

/**
 * Created by hle on 1/25/18.
 */
public class DeleteNodeFromTail {
    private static class Node {
        int data;
        Node next;

        private  Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        Node t = deleteNode(head, 2);
        return;
    }

    private static Node deleteNode(Node l, int k) {
        int index = 0;
        Node current = l;
        Node result = null;
        // Last result trails the result node to track it.
        Node lastResult = null;
        try {
            while (current != null && current.next != null) {
                current = current.next;
                index++;
                // Only set result to the head of list when the k distance is met
                if (index == k) {
                    result = l;
                } else if (index > k) {
                    // Just like a sliding ruler, result will not traverse until
                    // current has traversed a distance == k
                    lastResult = result;
                    result = result.next;
                }
            }
            // Once the current node reaches the tail, we delete the kth node (result) by
            // connecting the last node to its next node. Therefore the result node is out
            // of the linked list.
            if (lastResult != null) {
                lastResult.next = result.next;
                result.next = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return l;
    }
}
