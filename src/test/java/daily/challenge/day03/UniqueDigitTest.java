package daily.challenge.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueDigitTest {

    UniqueDigit uniqueDigit;

    @BeforeEach
    void setUp(){
        uniqueDigit = new UniqueDigit();
    }

    @Test
    void testValidNums() {
        assertEquals(3, uniqueDigit.findUnique(new int[]{1, 2, 3, 1, 2}));
    }

    @Test
    void testValidNumsWithMoreThanTwice() {
        assertEquals(3, uniqueDigit.findUnique(new int[]{1, 2, 3, 1, 2,2,1}));
    }

    @Test
    void testValidNumsWithOneValue() {
        assertEquals(3, uniqueDigit.findUnique(new int[]{3}));
    }


}