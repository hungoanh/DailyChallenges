package main.java.Algorithms.LinkedLists;

import java.util.Arrays;

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
        reverseList(head);
        return;
    }

    private static Node reverseList(Node head) {
        // if head.next is null, we have reached the end of the list
        if (head == null || head.next == null) {
            return head;
        }

        Node tail = reverseList(head.next);
        // The
        head.next.next = head;
        head.next = null;

        return tail;
    }


}
