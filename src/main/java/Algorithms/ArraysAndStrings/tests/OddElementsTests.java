package main.java.Algorithms.ArraysAndStrings.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.Algorithms.ArraysAndStrings.main.OddElements;

/**
 * Created by hungle on 1/19/18.
 */
public class OddElementsTests {
    @Test
    public void testOddElementReturnsOne() {
        OddElements oe = new OddElements();
        assertEquals(1, (int) oe.findOddElement(new Integer[] {1,2,1,2,1}));
    }
}
