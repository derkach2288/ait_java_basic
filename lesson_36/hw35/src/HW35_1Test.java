import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HW35_1Test {
    private HW35_1 hw35_1;

    @BeforeEach
    void setUp() {
        hw35_1 = new HW35_1();
    }

    @Test
    public void yesOrNoTestEmpty() {
        assertEquals(Arrays.asList(), hw35_1.yesOrNo(Arrays.asList(), Arrays.asList()));
    }

    @Test
    public void yesOrNoTestOneElement() {
        List<String> expected = Arrays.asList("No");
        List<Integer> actual1 = Arrays.asList(1);
        List<Integer> actual2 = Arrays.asList(3);

        assertEquals(expected, hw35_1.yesOrNo(actual1, actual2));
    }

    @Test
    public void yesOrNoTestSeveralElement() {
        List<String> expected = Arrays.asList("No", "Yes", "Yes", "No");
        List<Integer> actual1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> actual2 = Arrays.asList(7, 2, 3, 9);

        assertEquals(expected, hw35_1.yesOrNo(actual1, actual2));
    }

    @Test
    public void withoutElementsEmpty() {
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Arrays.asList();
        assertEquals(expected, hw35_1.filteredListIterator(actual, 5));

    }

    @Test
    public void withoutElementsOneElt() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);

        assertEquals(expected, hw35_1.filteredListIterator(actual, 5));

    }

    @Test
    public void withoutElementsNoSuchElts() {
        List<Integer> expected = Arrays.asList();

        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(3);
        actual.add(8);
        actual.add(7);

        assertEquals(expected, hw35_1.filteredListIterator(actual, 0));

    }

    @Test
    public void withoutElementsSeveral() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(8);
        expected.add(7);

        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(3);
        actual.add(8);
        actual.add(7);
        actual.add(77);

        assertEquals(expected, hw35_1.filteredListIterator(actual, 8));

    }




}