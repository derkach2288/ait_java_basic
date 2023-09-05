package ait.city.test;

import ait.city.model.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {
    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);
    }

    private void printArray(Object[] arr, String title){
        System.out.println("=========" + title + "======");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    void testComparable(){
        printArray(cities, "Originals array");
        Arrays.sort(cities);
        printArray(cities, "Natural order");

        City city = new City("Dallas", 1_300_000);
        int index = Arrays.binarySearch(cities, city); // поиск по полю, который указан в compareTo
        System.out.println("Index = " + index);

        city = new City("", 1_300_000);
        index = Arrays.binarySearch(cities, city); // поиск по полю, который указан в compareTo
        System.out.println("Index = " + index);

        city = new City(null, 1_300_000); // поиск по полю, который указан в compareTo
        index = Arrays.binarySearch(cities, city);
        System.out.println("Index = " + index);

    }

    @Test
    void testComparator(){
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comparator);
        printArray(cities, "Sort by name");

        City pattern = new City("Chicago", 0);
        int index = Arrays.binarySearch(cities, pattern, comparator); // ищет по компаратору, то есть по городу, а не понаселению
        System.out.println("Index = " + index);
    }

    @Test
    void restArrayCopy(){
//        City[] citiesCopy = cities;
//        printArray(citiesCopy, "citiesCopy before sort of ciries");
//        Arrays.sort(cities);
//        printArray(citiesCopy, "citiesCopy after sort of ciries");

        City[] citiesCopy = Arrays.copyOf(cities, cities.length*2); // копирует с нулевого индекса
        printArray(citiesCopy, "citiesCopy before sort of cities");
        Arrays.sort(cities);
        printArray(citiesCopy, "citiesCopy after sort of cities");

        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(citiesCopy, 0, cities.length, comparator); // сортировка от нулевого индекса до cities.length, используя comparator
        printArray(citiesCopy, "citiesCopy sort by name");
        City pattern = new City("Yalta", 0);
        int index = Arrays.binarySearch(citiesCopy, 0, cities.length, pattern, comparator);
        System.out.println("Index = " + index);


    }

    @Test
    void testCopyOfRange(){
        City[] citiesCopyOfRange = Arrays.copyOfRange(cities, 1, cities.length-1); // копирование от и до, от вклячая, до нет
        printArray(citiesCopyOfRange, "testCopyOfRange");

        citiesCopyOfRange = Arrays.copyOfRange(cities, 1, cities.length+1); // копирование от и до, от вклячая, до нет
        printArray(citiesCopyOfRange, "testCopyOfRange");

    }

    @Test
    void testSystemArrayCopy(){
        City[] citiesCopy = new City[cities.length*2];
        System.arraycopy(cities, 1, citiesCopy, 4, cities.length-2); // с какого массива, с какой позиции, в какой массив, в какую позицию в новом массиве, сколько элементов
        printArray(citiesCopy, "testSystemArrayCopy");
    }

    @Test
    void testKeepSorted(){
        Arrays.sort(cities);
        printArray(cities, "Natural order");

        City city = new City("Salem", 690_000);
        City[] citiesCopy = Arrays.copyOf(cities, cities.length+1);
//        citiesCopy[citiesCopy.length-1] = city;
//        Arrays.sort(citiesCopy);
        int index = Arrays.binarySearch(citiesCopy, 0, citiesCopy.length-1, city);
        System.out.println("index = " + index);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(citiesCopy, index, citiesCopy, index+1, citiesCopy.length - index - 1);
        citiesCopy[index] = city;
        cities = citiesCopy;
        printArray(cities, "Natural order after add city");

    }
}