package codewars;

import codewars.kyu8.Opposite;
import codewars.kyu8.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void tests() {
        assertEquals(-1, Opposite.opposite(1));
    }
}