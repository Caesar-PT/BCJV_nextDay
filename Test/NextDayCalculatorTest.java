import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("1-1-2018")
    void nextDay1Month1Year2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected =  "2-1-2018";
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("31-1-2018")
    void nextDay31Month1Year2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected =  "1-2-2018";
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("30-4-2018")
    void nextDay30Month4Year2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected =  "1-5-2018";
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("28-2-2018")
    void nextDay28Month2Year2018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected =  "1-3-2018";
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("29-2-2020")
    void nextDay29Month2Year2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected =  "1-3-2020";
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("31-12-2018")
    void nextDay31Month12Year2018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected =  "1-1-2019";
        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected, result);
    }
}