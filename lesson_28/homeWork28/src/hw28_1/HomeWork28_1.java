package hw28_1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class HomeWork28_1 {
    /*

   Задача 1. Задайте массив на 10 элементов и заполните его случайными числами в интервале от -10 до 10.
   Распечатайте полученный массив. Создайте метод, который определяет наличие дубликатов в массиве.
   Разработайте соответсвующий тест (набор тестов).
     */
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10, 11);
        }

        printArray(array);
        System.out.println(duplicatesInArray(array));
        System.out.println(duplicatesInArrayBoolean(array));


    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static String duplicatesInArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if (arr[i] == arr[j+1]){
                    return "В массиве есть дубликаты";

                }
            }
        }
        return "В массиве нет дубликатов";
    }

    public static boolean duplicatesInArrayBoolean(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if (arr[i] == arr[j+1]){
                    return true;

                }
            }
        }
        return false;
    }


}
