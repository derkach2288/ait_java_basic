package ait.daresort.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest2 {
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

            if (s1Year > s2Year) {
                return 1;
            } else if (s1Year < s2Year) {
                return -1;
            } else {
                if (s1Month > s2Month) {
                    return 1;
                } else if (s1Month < s2Month) {
                    return -1;
                } else {
                    if (s1Day > s2Day) {
                        return 1;
                    } else if (s1Day < s2Day) {
                        return -1;
                    }
                }
            }


            return 0;
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
