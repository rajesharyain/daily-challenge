package daily.challenge.day01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    TwoSum twoSum;
    @BeforeEach
    void setUp(){
        twoSum = new TwoSum();
    }
    @Test
    void testBasicCase() {
        int[] nums = {10, 15, 3, 7};
        assertTrue(twoSum.sum(nums, 17));
    }

    @Test
    void testWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        assertTrue(twoSum.sum(nums, -8));
    }
    @Test
    void testNoValidPair(){
        int nums[] = {10,15,3,6};
        Assertions.assertFalse(twoSum.sum(nums, 17));

    }

    @Test
    void testWithDuplicates() {
        int[] nums = {5, 5, 5, 5};
        assertTrue(twoSum.sum(nums, 10));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        assertFalse(twoSum.sum(nums, 5));
    }
    @Test
    void testSingleElement() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {5};
        assertFalse(twoSum.sum(nums, 5));
    }
    @Test
    void testWithZero() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {0, 1, 2, 3};
        assertTrue(twoSum.sum(nums, 3));
    }

}