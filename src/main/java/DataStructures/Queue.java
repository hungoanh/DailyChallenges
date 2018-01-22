package main.java.DataStructures;

/**
 * Created by hungle on 1/20/18.
 */
public class Queue<T> {

    // first and last are nodes in the head and tail of the queue
    private Node first, last;

    private class Node {
        T item;
        Node next;
    }

    public void enqueue(T item ) {

        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        oldLast.next = last;
    }
    /*
    public T dequeue() {

    }

    public int size() {

    }

    public boolean isEmpty() {

    }
    */
}
