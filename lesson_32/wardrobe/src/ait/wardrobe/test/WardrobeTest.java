package ait.wardrobe.test;

import ait.wardrobe.model.Wardrobe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class WardrobeTest {

    private static final int SIZE = 10;
    private static final int MAX = 5;
    static Random random = new Random();
    Wardrobe[] arr;

    @BeforeEach
    void setUp() {
        arr = getWardrobes();
    }

    private Wardrobe[] getWardrobes() {
        Wardrobe[] res = new Wardrobe[SIZE];
        for (int i = 0; i < res.length; i++) {
            double height = 1 + random.nextInt(MAX); // рандом генерит от 0 до макс, не включаю макс. добавили 1, чтоб было от 1 до макс включительно
            double width = 1 + random.nextInt(MAX);
            double depth = 1 + random.nextInt(MAX);
            res[i] = new Wardrobe(height, width, depth);
        }
        return res;
    }

    private void printArray(Wardrobe[] arr, String title) {
        System.out.println("======" + title + "=========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    void testComparableWardrobe() {
        printArray(arr, "Test Comparable before sort");
        Arrays.sort(arr);
        printArray(arr, "Test Comparable after sort");
        int index = Arrays.binarySearch(arr, new Wardrobe(2, 4, 1));
        System.out.println("Index = " + index);

    }

    @Test
    void testAreaComparator(){
        printArray(arr, "Test Area Comparator before sort");
        Comparator<Wardrobe> comparator = (w1, w2) -> Double.compare(w1.area(), w2.area());
        Arrays.sort(arr, comparator);
        printArray(arr, "Test Area Comparator after sort");
        int index = Arrays.binarySearch(arr, new Wardrobe(2, 4, 1), comparator);
        System.out.println("Index = " + index);

    }

    @Test
    void testAreaComparatorHeight(){
        printArray(arr, "Test Area ComparatorHeight before sort");
        Comparator<Wardrobe> comparator = (h1, h2) -> Double.compare(h1.getHeight(), h2.getHeight());
        Arrays.sort(arr, comparator);
        printArray(arr, "Test Area ComparatorHeight after sort");
    }

    @Test
    void testVolumeComparator(){
        printArray(arr, "Test Volume Comparator before sort");
        Comparator<Wardrobe> comparator = (w1, w2) -> Double.compare(w1.volume(), w2.volume());
        Arrays.sort(arr, comparator);
        printArray(arr, "Test Volume Comparator after sort");
        int index = Arrays.binarySearch(arr, new Wardrobe(2, 4, 1), comparator);
        System.out.println("Index = " + index);

    }

    @Test
    void testHeightVolumeComparator(){
        printArray(arr, "Test Height Volume Comparator before sort");
        Comparator<Wardrobe> comparator = (w1, w2) -> {
            int res = Double.compare(w1.getHeight(), w2.getHeight());
            return res !=0 ? res: Double.compare(w1.volume(), w2.volume()); // если высота разная - сортируем по высоте, если одинаковая - по объему
        };
        Arrays.sort(arr, comparator);
        printArray(arr, "Test Height Volume Comparator after sort");
        int index = Arrays.binarySearch(arr, new Wardrobe(2, 4, 1), comparator);
        System.out.println("Index = " + index);

    }

    @Test
    void testIntegerDesc() {
        Integer[] actual = {-1, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Integer[] expected = {Integer.MAX_VALUE, -1, Integer.MIN_VALUE};
        Arrays.sort(actual, (a, b) -> Integer.compare(b, a));
        assertArrayEquals(expected, actual);
    }


}