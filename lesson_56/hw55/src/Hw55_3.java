/*
Задача 3 Записать каждую строку двумерного массива byte[][] (например, из второй задачи) в отдельный файл.
 */

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hw55_3 {
    public static void main(String[] args) {

        String[] arrStr = {"one", "two", "three", "four", "five"};

        byte[][] arrByte = convertToArrayByte(arrStr);
        printArray(arrByte);


            arrayToFile(arrByte);


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

    public static void arrayToFile(byte[][] arr) {
        String name = "hw54_3_";
        for (int i = 0; i < arr.length; i++) {
            byte[] currentArray = arr[i];
            try(BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file_"+i))) {
                os.write(currentArray);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
