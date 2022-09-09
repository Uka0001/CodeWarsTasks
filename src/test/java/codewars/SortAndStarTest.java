package codewars;

import codewars.kyu8.SortAndStar;
import codewars.kyu8.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortAndStarTest {

    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", SortAndStar.twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", SortAndStar.twoSort(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }
}