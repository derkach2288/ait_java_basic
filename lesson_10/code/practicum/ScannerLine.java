package practicum;

import java.util.Scanner;

public class ScannerLine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // создаем сканер

        // nextLine() для чтение строк
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        String bin = scanner.nextLine(); // мусорная переменная, потому что после ввода цифры в следующую переменную записывается enter
        System.out.println(bin);


        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();


        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);

    }
}
