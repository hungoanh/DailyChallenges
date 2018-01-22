package main.java.Algorithms.LinkedLists;

/**
 * Created by hungle on 1/21/18.
 */
public class SumOfLinkedLists {
    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(6);
        a.next = new Node(7);
        b.next = new Node(7);
        Node result = sumLists(a, b);
        return;
    }

    private static class Node {
        int value;
        Node next;

        private Node(int val) {
            this.value = val;
        }

        private Node() {};
    }

    private static Node sumLists(Node l1, Node l2) {
        Node first = null, last = null;
        Node head1 = l1;
        Node head2 = l2;
        int carryOver = 0;

        while (head1 != null && head2 != null) {
            Node newNode = addNodes(head1, head2, carryOver);
            if ((carryOver = newNode.value / 10) > 0) {
                newNode.value = newNode.value % 10;
            }
            if (last == null) {
                last = newNode;
                first = last;
            } else {
                last.next = newNode;
                last = last.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if (carryOver > 0) {
            last.next = new Node(carryOver);
        }
        return first;
    }

    private static Node addNodes(Node a, Node b, int carryOver) {
        Node sum = new Node();
        sum.value = a.value + b.value + carryOver;
        return sum;
    }
}
