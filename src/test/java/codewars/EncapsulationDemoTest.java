package codewars;

import codewars.kyu7.EncapsulationDemo;
import codewars.kyu8.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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