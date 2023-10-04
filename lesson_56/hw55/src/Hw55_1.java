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

//        int[][] arr ={ {3,4,5}, {6,7,8}};
        int[][] array = createArrayAndFill(5, 3);
        printArray(array);
        System.out.println(Arrays.toString(toArray(array)));

        System.out.println("--------");
        changeRows(array,1, 3);
        printArray(array);


    }

    public static int[][] createArrayAndFill(int row, int col) {
        int[][] arr = new int[row][col];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(50);
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] toArray(int[][] arr) {
        int[] result = new int[arr.length*arr[0].length];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[index++] = arr[i][j];
            }
        }

        return result;
    }

    public static void changeRows(int[][] arr, int row1, int row2){
        if (row1<0 || row2<0 || row1>=arr.length || row2 >= arr.length){
            throw new IllegalArgumentException("IllegalArgumentException");
        }

        int[] temp = arr[row1];
        arr[row1] = arr[row2];
        arr[row2] = temp;
    }


}