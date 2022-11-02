package codewars.kyu8;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class KataOddTest{
    @Test
    public void fixedTest() {
        assertEquals(7, KataOdd.oddCount(15));
        assertEquals(7511, KataOdd.oddCount(15023));
        assertEquals(3, KataOdd.oddCount(7));
        assertEquals(8, KataOdd.oddCount(17));
    }
}