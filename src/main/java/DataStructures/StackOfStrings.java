package main.java.DataStructures;

/**
 * Created by hungle on 1/20/18.
 *
 * Description: Linked-list implementation for a Stack of Strings
 */
public class StackOfStrings {
    private Node first = null;

    public String pop() {
        String val = first.value;
        first = first.next;
        return val;
    }

    public void push(String str) {
        Node newNode = new Node();
        newNode.value = str;
        newNode.next = first;
        first = newNode;
    }

    public int size() {
        int cnt = 0;
        // Use a local variable to traverse the list.
        Node tmp = first;
        while (tmp != null) {
            cnt++;
            tmp = tmp.next;
        }
        return cnt;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    private static class Node {
        private String value;
        private Node next;
    }
}
