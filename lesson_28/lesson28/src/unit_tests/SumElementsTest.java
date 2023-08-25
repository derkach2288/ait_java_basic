package unit_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumElementsTest {

    SumElements sumElements;

    @BeforeEach
    void setUp() {
        sumElements = new SumElements();
    }

    @Test
    void averageEvenElements() {
        int[] arr = {10, 21, 20, 41 };
        // четные элементы это 10 и 20, их среднее 15.0
        assertEquals(15.0, SumElements.averageEvenElements(arr));
    }
}