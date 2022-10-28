package codewars;

import codewars.kyu7.EncapsulationDemo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncapsulationDemoTest {
    @Test
    public void testSample() {
        EncapsulationDemo ed = new EncapsulationDemo();
        assertEquals(
                0,
                ed.getNumber()
        );
    }
}