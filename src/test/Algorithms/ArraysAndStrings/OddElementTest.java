package test.Algorithms.ArraysAndStrings;

import org.junit.Test;
import static org.junit.Assert.*;
import main.java.Algorithms.ArraysAndStrings.OddElements;


/**
 * Created by hle on 1/19/18.
 */
public class OddElementTest {
    @Test
    public void testOddElementReturnsOne() {
        OddElements ol = new OddElements();
        assertEquals((Integer) 2, ol.findOddElement(new Integer[] {1,2,1,2,1}));
    }

}
