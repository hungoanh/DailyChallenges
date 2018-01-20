package main.java.DataStructures;

/**
 * Created by hungle on 1/20/18.
 */
public class Stack<T> {

    private class Node {
        T item;
        Node next;
    }

    private Node first = null;

    public void push(T item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public T pop() {
        Node oldFirst = first;
        first = first.next;
        return oldFirst.item;
    }

    public int size() {
        Node tmp = first;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return (first == null);
    }

}
