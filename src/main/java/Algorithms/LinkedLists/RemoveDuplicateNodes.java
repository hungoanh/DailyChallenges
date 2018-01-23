package main.java.Algorithms.LinkedLists;

/**
 * Created by hungle on 1/22/18.
 */
public class RemoveDuplicateNodes {
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
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(9);
        removeDups(head);
    }

    private static Node removeDups(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                Node tmp = current.next;
                current.next = current.next.next;
                tmp.next = null;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
