package practicum;

import java.util.Scanner;

public class ScannerOur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // создаем сканер

        System.out.println("Enter a number");
        int num1 = scanner.nextInt(); // чтение ввода пользователь и запись в переменную num1

        System.out.println("You entered number " + num1);


        System.out.println("Enter second number");
        int num2 = scanner.nextInt(); // чтение ввода пользователь и запись в переменную num1

        System.out.println("You entered number " + num2);

        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);

        //_________________________________
        System.out.println("----------------");






    }
}
