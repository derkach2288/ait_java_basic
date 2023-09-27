/*
Задача 1
Напишите програму, которая позволяет пользователю ввести несколько
строк текста (используя Scanner) и записать их в текстовый файл
(result.txt). Признаком того, что полтзователь закончил ввод
текста, должна служить введенная строка "exit" (естественно, она
не должна попадать в итоговый файл.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW52_1 {
    public static void main(String[] args) {
        writeFile();

    }


    public static void writeFile(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = scanner.nextLine();

        try(FileWriter fileWriter = new FileWriter("hw52_1.txt")) {
            while (!str.equals("exit")){
                fileWriter.write(str);
                str = scanner.nextLine();
            }
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
