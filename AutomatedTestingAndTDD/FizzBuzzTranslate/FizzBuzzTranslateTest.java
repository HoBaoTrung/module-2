package AutomatedTestingAndTDD.FizzBuzzTranslate;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    public void testFizzTranslate() {
        int number = 6;
        String expected = "Fizz";
        String actual = FizzBuzzTranslate.traslate(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testBuzzTranslate() {
        int number = 10;
        String expected = "Buzz";
        String actual = FizzBuzzTranslate.traslate(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testFizzBuzzTranslate() {
        int number = 15;
        String expected = "FizzBuzz";
        String actual = FizzBuzzTranslate.traslate(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testNotFizzBuzzTranslate() {
        int number = 4;
        String expected = "4";
        String actual = FizzBuzzTranslate.traslate(number);
        assertEquals(expected, actual);
    }

    @Test
    public void testNumberTranslateToWord() {}

    @Test
    public void testValidNumbers() {
        assertEquals("năm", FizzBuzzTranslate.readToWord(5));
        assertEquals("Mười", FizzBuzzTranslate.readToWord(10));
        assertEquals("Hai mươi mốt", FizzBuzzTranslate.readToWord(21));
        assertEquals("Ba mươi", FizzBuzzTranslate.readToWord(30));
        assertEquals("Bốn mươi lăm", FizzBuzzTranslate.readToWord(45));
        assertEquals("Chín mươi chín", FizzBuzzTranslate.readToWord(99));
    }

    @Test
    public void testInvalidNumbers() {
        assertEquals("Số phải nằm trong khoảng từ 0 đến 99.", FizzBuzzTranslate.readToWord(-1));
        assertEquals("Số phải nằm trong khoảng từ 0 đến 99.", FizzBuzzTranslate.readToWord(100));
    }
}
