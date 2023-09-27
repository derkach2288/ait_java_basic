/*
Задача 2
Дан файл с текстом, например из первой задачи (result.txt).
Ваша задача прочитать жтот файл и создать на диске ено копию,
в которой все символы заданные параметром ch1 будут заменены
символом заданным в ch2. Например:
Файл 1: "Есть только миг" ch1='г' ch2='ф'
Файл 2: "Есть только миф"
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HW52_2 {
    public static void main(String[] args) {
        readAndMakeACopy();
    }

    public static void readAndMakeACopy(){
        try(FileReader fileReader = new FileReader("hw52_1.txt")) {
            int data;
            FileWriter fileWriter = new FileWriter("hw52_2.txt");
            while ((data = fileReader.read())!=-1){
                if (data == 'г'){
                    data = 'ф';
                }
                fileWriter.write(data);
                fileWriter.flush();
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
