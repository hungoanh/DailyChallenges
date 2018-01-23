package main.java.Algorithms.LinkedLists;

/**
 * Created by hungle on 1/22/18.
 */
public class GetNodeFromTail {
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
        System.out.println(getNode(head, 0));
    }

    private static int getNode(Node l, int k) {
        int index = 0;
        Node current = l;
        Node result = l;
        while (current != null && current.next != null) {
            current = current.next;
            index++;
            if (index > k) {
                // Just like a sliding ruler, result will not traverse until
                // current has traversed a distance == k
                result = result.next;
            }
        }
        return result.data;
    }
}
