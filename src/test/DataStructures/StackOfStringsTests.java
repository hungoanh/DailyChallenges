package test.DataStructures;

import static org.junit.Assert.*;

import main.java.DataStructures.Stack;
import main.java.DataStructures.StackOfStrings;
import main.java.DataStructures.StackOfStrings2;
import org.junit.Test;

/**
 * Created by hungle on 1/20/18.
 */
public class StackOfStringsTests {
    @Test
    public void testStackOfStringsPushPopSuccess() {
        StackOfStrings stackOfStrings = new StackOfStrings();
        stackOfStrings.push("One");
        stackOfStrings.push("Two");
        assertEquals("Two", stackOfStrings.pop());
        assertEquals("One", stackOfStrings.pop());
    }

    @Test
    public void testStackOfStringsSizeSuccess() {
        StackOfStrings stackOfStrings = new StackOfStrings();
        stackOfStrings.push("One");
        stackOfStrings.push("Two");
        assertEquals(2, stackOfStrings.size());
        // Pop one size--
        stackOfStrings.pop();
        assertEquals(1, stackOfStrings.size());
        // Pop again size--
        stackOfStrings.pop();
        assertEquals(0, stackOfStrings.size());
    }

    @Test
    public void testStackOfStringsIsEmptySuccess() {
        StackOfStrings stackOfStrings = new StackOfStrings();
        stackOfStrings.push("One");
        stackOfStrings.push("Two");
        assertEquals(false, stackOfStrings.isEmpty());
        stackOfStrings.pop();
        stackOfStrings.pop();
        assertEquals(true, stackOfStrings.isEmpty());
    }

    @Test
    public void testStackOfStringsPushPopSuccess2() {
        StackOfStrings2 stackOfStrings = new StackOfStrings2(10);
        stackOfStrings.push("One");
        stackOfStrings.push("Two");
        assertEquals("Two", stackOfStrings.pop());
        assertEquals("One", stackOfStrings.pop());
    }

    @Test
    public void testStackOfStringsSizeSuccess2() {
        StackOfStrings2 stackOfStrings = new StackOfStrings2(10);
        stackOfStrings.push("One");
        stackOfStrings.push("Two");
        assertEquals(2, stackOfStrings.size());
        // Pop one size--
        stackOfStrings.pop();
        assertEquals(1, stackOfStrings.size());
        // Pop again size--
        stackOfStrings.pop();
        assertEquals(0, stackOfStrings.size());
    }

    @Test
    public void testStackOfStringsIsEmptySuccess2() {
        StackOfStrings2 stackOfStrings = new StackOfStrings2(10);
        stackOfStrings.push("One");
        stackOfStrings.push("Two");
        assertEquals(false, stackOfStrings.isEmpty());
        stackOfStrings.pop();
        stackOfStrings.pop();
        assertEquals(true, stackOfStrings.isEmpty());
    }

    @Test
    public void testStackGenericPushPopSuccess() {
        Stack<String> stackOfStrings = new Stack<>();
        stackOfStrings.push("One");
        stackOfStrings.push("Two");
        assertEquals("Two", stackOfStrings.pop());
        assertEquals("One", stackOfStrings.pop());

        Stack<Integer> stackOfIntegers = new Stack<>();
        stackOfIntegers.push(12);
        stackOfIntegers.push(12/2);
        assertEquals((Integer) 6, stackOfIntegers.pop());
        assertEquals((Integer) 12, stackOfIntegers.pop());
    }

    @Test
    public void testStackGenericSizeSuccess() {
        Stack<String> stackOfStrings = new Stack<>();
        stackOfStrings.push("One");
        stackOfStrings.push("Two");
        assertEquals(2, stackOfStrings.size());
        // Pop one size--
        stackOfStrings.pop();
        assertEquals(1, stackOfStrings.size());
        // Pop again size--
        stackOfStrings.pop();
        assertEquals(0, stackOfStrings.size());
    }

    @Test
    public void testStackGenericIsEmptySuccess() {
        Stack<String> stackOfStrings = new Stack<>();
        stackOfStrings.push("One");
        stackOfStrings.push("Two");
        assertEquals(false, stackOfStrings.isEmpty());
        stackOfStrings.pop();
        stackOfStrings.pop();
        assertEquals(true, stackOfStrings.isEmpty());
    }
}
