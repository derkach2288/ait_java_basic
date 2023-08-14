package practicum;

import java.util.Scanner;

public class Pifagor {
    public static void main(String[] args) {
        /*
        Задача 1. Реализуйте метод, который вычисляет
        длину гипотенузы прямоугольного треугольника по
        двум заданным пользователем катетам (теорема
        Пифагора).
         */
        // шаг 1. создать, включить сканер
        // шаг 2. получить от пользователя данные про катеты

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input catet a: ");
        double a = scanner.nextDouble();

        System.out.println("Input catet b: ");
        double b = scanner.nextDouble();

        // шаг 3. вызов метода
        pifagorMethod(a, b); // с передачей ему аргумента

    }
    //--------Method--------
    public static void pifagorMethod(double x, double y){ // обьявили метод с параметрами на входе
        double c = Math.sqrt(Math.pow(x, 2) + y*y); // в квадрат можно возводить по разному
        System.out.println("Hipotenusa = " + c);
    }

    //-------end of methods-------
}
