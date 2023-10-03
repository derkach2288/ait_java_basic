/*
Задача 1
Создать двумерный массив 5x3 т.е. 5 строк 3 столбца. Заполнить его случайными числпми.

Написать метод, который преобразует его в одномерный массив из 15 элементов, перенося числа по-порядку
(слева направо и сверху вниз) из исходного
Написать метод, который меняет все значения из первой строки, на соответствующие значения из 3 строки, а
значения из третьей строки на значения из первой. Т.е. в итоге нужно поменять местами первую и третью строки исходного
массива.
 */


import java.util.Arrays;
import java.util.Random;

public class Hw55_1 {
    public static void main(String[] args) {
        int[][] arr = fillTheArray(5, 3);
        printArray(arr);

        System.out.println("convertedToOneArray");
        int[] arrOne = convertedToOneArray(arr);
        System.out.println(Arrays.toString(arrOne));

        System.out.println("swapLines");
        printArray(swapLines(arr));

    }

    public static int[][] fillTheArray(int x, int y){
        int[][] arr = new int[x][y];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(0, 100);
            }
        }

        return arr;
    }

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] convertedToOneArray(int[][] arr){
        int[] res = new int[15];

        for (int i = 0, count = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res[count++] = arr[i][j];
            }
        }

        return res;
    }

    public static int[][] swapLines(int[][] arr){
        int[][] res = new int[arr.length][];
//        res[0] = arr[arr.length-1].clone();
//        res[arr.length-1] = arr[0].clone();
        for (int i = 0; i < res.length; i++) {
            if (i==0) {
                res[0] = arr[arr.length-1].clone();
            } else if (i== arr.length-1){
                res[i] = arr[0].clone();
            } else {
                res[i] = arr[i].clone();
            }
        }

        return res;
    }
}
