package AutomatedTestingAndTDD.NextDayCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NextDayCalculatorTest {

    @Test
    void testCase1() {
        int day = 1, month = 1, year = 2018;
        int[] nextDate = {2, 1, 2018};
        String expected = String.format("%02d/%02d/%d", nextDate[0], nextDate[1], nextDate[2]);
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual, "Test Case 1 Failed!");
    }

    @Test
    void testCase2() {
        int day = 31, month = 1, year = 2018;
        int[] nextDate = {1, 2, 2018};
        String expected = String.format("%02d/%02d/%d", nextDate[0], nextDate[1], nextDate[2]);
        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual, "Test Case 2 Failed!");
    }

    @Test
    void testCase3() {
        int day = 30, month = 4, year = 2018;
        int[] nextDate = {1, 5, 2018};
        String expected = String.format("%02d/%02d/%d", nextDate[0], nextDate[1], nextDate[2]);

        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual, "Test Case 3 Failed!");
    }

    @Test
    void testCase4() {
        int day = 28, month = 2, year = 2018;
        int[] nextDate = {1, 3, 2018};

        String expected = String.format("%02d/%02d/%d", nextDate[0], nextDate[1], nextDate[2]);

        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual, "Test Case 4 Failed!");
    }

    @Test
    void testCase5() {
        int day = 29, month = 2, year = 2020;
        int[] nextDate = {1, 3, 2020};

        String expected = String.format("%02d/%02d/%d", nextDate[0], nextDate[1], nextDate[2]);

        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual, "Test Case 5 Failed!");
    }

    @Test
    void testCase6() {
        int day = 31, month = 12, year = 2018;
        int[] nextDate = {1, 1, 2019};

        String expected = String.format("%02d/%02d/%d", nextDate[0], nextDate[1], nextDate[2]);

        String actual = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual, "Test Case 6 Failed!");
    }
}
