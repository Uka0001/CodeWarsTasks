package codewars;

import codewars.kyu8.Opposite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class KataTest {
    @Test
    public void tests() {
        assertEquals(-1, Opposite.opposite(1));
    }
}