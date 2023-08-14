package homework;

import java.util.Scanner;

public class HomeWork10_3 {
    public static void main(String[] args) {
        /*
        Написать метод для перевода градусов по фаренгейту в шкалу цельсия.
        Формула для расчета С = 5*(F-32)/9. Результат вывести на экран
         */

        fahrenheitСelsius();
    }
    static void fahrenheitСelsius (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение по шкале фаренгейта: ");
        double f = scanner.nextDouble() ;
        double c = 5*(f-32)/9;
        System.out.printf(f + " фаренгейт = " +  "%.2f", c );
        System.out.println(" градусов цельсия");
    }
}
