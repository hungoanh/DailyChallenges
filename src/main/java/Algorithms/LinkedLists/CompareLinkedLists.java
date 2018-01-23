package main.java.Algorithms.LinkedLists;

/**
 * Created by hungle on 1/22/18.
 */
public class CompareLinkedLists {
    private static class Node {
        int value;
        Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(5);
        l1.next = new Node(3);
        l1.next.next = new Node(1);
        compareNodes(l1, l1);
        compareNodes(null, null);
        Node l2 = new Node(5);
        l2.next = new Node(3);
        l2.next.next = new Node(2);
        compareNodes(l1, l2);
    }

    private static boolean compareNodes(Node h1, Node h2) {
        while (h1 != null && h2 != null) {
            if (h1.value != h2.value) {
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        if (h1 != null || h2 != null) {
            return false;
        }
        return true;
    }
}
