package hw28_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork28_1Test {

    HomeWork28_1 homeWork28_1;
    @BeforeEach
    void setUp() {
        homeWork28_1 = new HomeWork28_1();
    }

    @Test
    void duplicatesInArray() {
        int[] arr = {1,2,3,1};
        System.out.println(HomeWork28_1.duplicatesInArray(arr));
        int[] arr1 = {1,2,3,4};
        System.out.println(HomeWork28_1.duplicatesInArray(arr1));

    }

    @Test
    void duplicatesInArrayBoolean() {
        int[] arr = {1,2,3,1};
        assertTrue(HomeWork28_1.duplicatesInArrayBoolean(arr));
        int[] arr1 = {1,2,3,4};
        assertFalse(HomeWork28_1.duplicatesInArrayBoolean(arr1));

    }



}