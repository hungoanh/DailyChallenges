package main.java.Algorithms.LinkedLists;

/**
 * Created by hle on 1/19/18.
 */
public class MergeSortedLists {
    // 1->2->3 and 1->3->4.  Result is 1->1->2->3->3->4
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        Node head = head1;
        while (head != null) {
            System.out.print(head.value);
            head = head.next;
        }

        System.out.println();
        head = head2;
        while (head != null) {
            System.out.print(head.value);
            head = head.next;
        }
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private static Node mergeLists(Node l1, Node l2) {
        Node head = null;
        Node h1 = l1;
        Node h2 = l2;

        Node tResult = head;
        while (h1 != null) {
            while (h2 != null) {
                if (h1.value >= h2.value) {
                    tResult = h1;
                    tResult.next = null;
                    h1 = h1.next;
                    break;
                } else {
                    tResult = h2;
                    tResult.next = null;
                    h2 = h2.next;
                    break;
                }
            }
        }
        return head;
    }
}
