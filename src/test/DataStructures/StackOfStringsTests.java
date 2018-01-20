package test.DataStructures;

import static org.junit.Assert.*;

import main.java.DataStructures.StackOfStrings;
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
}
