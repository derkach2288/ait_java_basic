/*
Задача 2 Дан массив строк. Каждую строку из этого массива нужно преобразовать в массив байт
(см. метод getBytes у строки). Получить двумерный массив byte[][] такой, где каждая строка -
это массив байта, полученный преобразованием соответствуюшей String из данного массива строк.
 */

import java.util.Arrays;

public class Hw55_2 {
    public static void main(String[] args) {

        String[] arrStr = {"one", "two", "three", "four", "five"};

        byte[][] arrByte = convertToArrayByte(arrStr);
//        System.out.println(Arrays.deepToString(arrByte));
        printArray(arrByte);

    }

    public static byte[][] convertToArrayByte(String[] arrStr){
        byte[][] res = new byte[arrStr.length][];
        for (int i = 0; i < arrStr.length; i++) {
            res[i] = arrStr[i].getBytes();
            }
        return res;
        }

    public static void printArray(byte[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    }

