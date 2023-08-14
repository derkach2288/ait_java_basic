package practicum;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // создаем сканер

        // next() считывает пользовательский ввод строки до пробела

        String nameSecondName = scanner.next();
        System.out.println(nameSecondName);

        scanner.close(); // нужно закрывать сканнер, чтоб уменьшить нагрузку на систему



    }
}
