package codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

class DayOfWeekTest {
    @Test
    void testSomething() {
        assertEquals("Sunday", DayOfWeek.getDay(1));
        assertEquals("Monday", DayOfWeek.getDay(2));
        assertEquals("Tuesday", DayOfWeek.getDay(3));
        assertEquals("Wrong, please enter a number between 1 and 7", DayOfWeek.getDay(8));
        assertEquals("Wrong, please enter a number between 1 and 7", DayOfWeek.getDay(20));
    }
}

