package daily.challenge.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductArrayExceptSelfTest {
    ProductArrayExceptSelf productArrayExceptSelf;

    @BeforeEach
    void setup(){
        productArrayExceptSelf = new ProductArrayExceptSelf();
    }

    @Test
    void testEmpty(){
        assertArrayEquals(new int[]{}, productArrayExceptSelf.productArray(new int[]{}));
    }

    @Test
    void testValidArray(){
        assertArrayEquals(new int[] {120, 60, 40, 30, 24}, productArrayExceptSelf.productArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testWithOneArrayValue(){
        assertArrayEquals(new int[] {3}, productArrayExceptSelf.productArray(new int[]{3}));
    }

    @Test
    void testArrayHavingZeroValue(){
        // With division when having zero will throw an Airthmatic exception
        assertThrows(ArithmeticException.class, () ->  productArrayExceptSelf.productArray(new int[]{3, 1, 0, 4}));

    }

    /**
     * Test product without the division
     *
     */
    @Test
    void testProductWithoutDivision() {
        assertArrayEquals(new int[] {120, 60, 40, 30, 24}, productArrayExceptSelf.productArrayWithoutDivision(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void testProductWithoutDivisionWithNegativeValues() {
        assertArrayEquals(new int[] {-120, 60, -40, -30, -24}, productArrayExceptSelf.productArrayWithoutDivision(new int[]{1, -2, 3, 4, 5}));
    }

    @Test
    void testProductWithoutDivisionWithTwoNegativeValues() {
        assertArrayEquals(new int[] {120, -60, -40, 30, 24}, productArrayExceptSelf.productArrayWithoutDivision(new int[]{1, -2, -3, 4, 5}));
    }
    @Test
    void testArraWithoutDivisonyHavingZeroValue(){
        assertArrayEquals(new int[] {0, 0, 12, 0 }, productArrayExceptSelf.productArrayWithoutDivision(new int[]{3, 1, 0, 4}));
    }

    @Test
    void testWithoutDivisionWithOneArrayValue(){
        assertArrayEquals(new int[] {3}, productArrayExceptSelf.productArrayWithoutDivision(new int[]{3}));
    }

    @Test
    void testEmptyWithouDivision(){
        assertArrayEquals(new int[]{}, productArrayExceptSelf.productArrayWithoutDivision(new int[]{}));
    }

}