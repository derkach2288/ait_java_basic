package unit_tests;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {

    ArraySum arraySum;
    @BeforeEach
    void setUp() {
        arraySum = new ArraySum();
    }

    @org.junit.jupiter.api.Test
    void sumElOddIndex() {
        int[] arr = {10, 20, -30, 40}; // тестовый массив
        // элементы с нечетными индексами это 20 и 40, их сумма 60
        assertEquals(60, ArraySum.sumElOddIndex(arr));
    }
}