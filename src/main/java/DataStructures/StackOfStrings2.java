package main.java.DataStructures;

/**
 * Created by hungle on 1/20/18.
 */
public class StackOfStrings2 {
    private String [] stack = null;
    private int index = 0;

    // Drawback. Stack size is limited to capacity
    public StackOfStrings2(int capacity) {
        this.stack = new String[capacity];
    }

    public void push(String str) {
        this.stack[index++] = str;
    }

    public String pop() {
        String val = this.stack[--index];
        this.stack[index] = null;
        return val;
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return (this.stack[0] == null);
    }

}
