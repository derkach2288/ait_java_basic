/*
Задача 3 Записать каждую строку двумерного массива byte[][] (например, из второй задачи) в отдельный файл.
 */

import java.io.*;

public class Hw55_3 {
    public static void main(String[] args) {

        String[] arrStr = {"one", "two", "three", "four", "five"};

        byte[][] arrByte = convertToArrayByte(arrStr);
        printArray(arrByte);

        try {
            write(arrByte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


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

    public static void write(byte[][] arr) throws IOException {
        String name = "hw54_3_";
        for (int i = 0; i < arr.length; i++) {
            try(BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(name+=i))) {
                os.write(arr[i]);
            }
        }
    }


}
