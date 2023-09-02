package ait.daresort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {
    Comparator<String> dateComparator;

    @BeforeEach
    void setUp() {
        dateComparator = (s1, s2) -> {
            String[] arrDate1 = s1.split("-");
            int s1Day = Integer.parseInt(arrDate1[0]);
            int s1Month = Integer.parseInt(arrDate1[1]);
            int s1Year = Integer.parseInt(arrDate1[2]);

            String[] arrDate2 = s2.split("-");
            int s2Day = Integer.parseInt(arrDate2[0]);
            int s2Month = Integer.parseInt(arrDate2[1]);
            int s2Year = Integer.parseInt(arrDate2[2]);

            int date1 = s1Year*10000 + s1Month*100 + s1Day;
            int date2 = s2Year*10000 + s2Month*100 + s2Day;


            return date1-date2;
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, dateComparator);
        assertArrayEquals(expected, dates);
        System.out.println(Arrays.toString(dates));
    }
}
