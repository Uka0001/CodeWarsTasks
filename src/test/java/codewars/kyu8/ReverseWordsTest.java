package codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests +

public class ReverseWordsTest {
    @Test
    public void testSomething() {
        assertEquals("running faster than you can", ReverseWords.reverseWords("can you than faster running"));
        assertEquals("I like jogging", ReverseWords.reverseWords("jogging like I"));
        assertEquals("Future is in long time relation", ReverseWords.reverseWords("relation time long in is Future"));
    }
}