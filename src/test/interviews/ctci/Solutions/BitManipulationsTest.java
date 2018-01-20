package test.interviews.ctci.Solutions;

import main.java.interviews.ctci.Solutions.BitManipulations.BasicBitManipulations;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by hle on 1/19/18.
 */
public class BitManipulationsTest {
    @Test
    public void testBasicBitManipulationSSuccess() {
        BasicBitManipulations bbm = new BasicBitManipulations();
        assertEquals(4, bbm.leftShift(1, 2));
    }
}
