package ait.arrays.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysTest {
    Integer[] arrNum;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
    }


    @Test
    void OddEvenComparator() {
        System.out.println("=====OddEvenComparator=====");
        System.out.println(Arrays.toString(arrNum));

        Arrays.sort(arrNum, (n1, n2) -> n1 % 2 - n2 % 2);
        System.out.println(Arrays.toString(arrNum));
    }

    @Test
    void OddEvenComparator2() {
        System.out.println("=====OddEvenComparator2=====");
        System.out.println(Arrays.toString(arrNum));

        Arrays.sort(arrNum, (n1, n2) -> {
            if (n1 % 2 != 0) {
                return n2 % 2 != 0 ? n2 - n1 : 1;
            }

            return n2 % 2 != 0 ? -1 : n1 - n2;

        });
        System.out.println(Arrays.toString(arrNum));
    }


}
