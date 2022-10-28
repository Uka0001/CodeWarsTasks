package codewars;

import codewars.kyu8.OppositesAttract;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OppositesAttractTest {

    @org.junit.Test
    public void testOddAndEven() {
        assertEquals(true, OppositesAttract.isLove(1, 4));
    }

    @org.junit.Test
    public void testEvenAndEven() {
        assertEquals(false, OppositesAttract.isLove(2, 2));
    }

    @org.junit.Test
    public void testOddAndOdd() {
        assertEquals(false, OppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertEquals(true, OppositesAttract.isLove(0, 1));
    }

}