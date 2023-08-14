package homeWork;

import java.util.Scanner;

public class HomeWork11_1 {
    public static void main(String[] args) {
        /*
        Задача1
        Реализуйте с помощью метода конвертор, который переводит
        скорость в милях в час в скорость в км/час. 1 миля равна
        1609 метров. Метод получает на вход данные от пользователя
        с клавиатуры.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость в милях: ");
        double mph = scanner.nextDouble();
        System.out.print(mph + " миль в час = ");
        mphinkmh(mph);
    }
    public static void mphinkmh (double mp){
        double kmh = mp * 1.609;
        System.out.printf("%.2f", kmh );
        System.out.print(" км/час");
    }
}
