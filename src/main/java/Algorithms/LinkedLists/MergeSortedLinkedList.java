package main.java.Algorithms.LinkedLists;

/**
 * Created by hungle on 1/22/18.
 */
public class MergeSortedLinkedList {
    private static class Node {
        int data;
        Node next;

        private Node(int value) {
            this.data = value;
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);
        l1.next.next.next = new Node(6);
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(7);
        mergeList(l1, l2);
        return;
    }

    private static Node mergeList(Node headA, Node headB) {
        if (headA == null && headB == null) {
            return null;
        }
        Node first = null;
        Node last = null;
        do {
            Node tmp;
            if (headB == null) {
                // List 2 has run out, copy the rest to last.
                tmp = headA;
                headA = null;
            } else if (headA == null) {
                // List 1 has run out, copy the rest to last.
                tmp = headB;
                headB = null;
            } else {
                // Both lists still have values, do compare
                if (headA.data <= headB.data) {
                    tmp = headA;
                    headA = headA.next;
                } else {
                    tmp = headB;
                    headB = headB.next;
                }
                // Break the node from the list
                tmp.next = null;
            }
            // Enqueuing the node
            if ( first == null) {
                first = tmp;
                last = first;
            } else {
                Node oldLast = last;
                last = tmp;
                oldLast.next = last;
            }
        } while (headA != null || headB != null);
        return first;
    }
}
