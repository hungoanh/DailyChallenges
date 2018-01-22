package main.java.Algorithms.LinkedLists;

/**
 * Created by hungle on 1/21/18.
 */
public class ReverseLinkedList {
    private static class Node {
        int value;
        Node next;

        private Node() {}

        private Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(1);
        return;
    }

    
}
