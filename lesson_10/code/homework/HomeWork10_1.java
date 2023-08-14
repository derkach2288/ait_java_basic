package homework;

import java.util.Scanner;

public class HomeWork10_1 {
    public static void main(String[] args) {
        /*
        Задача1
        Написать программу, которая принимает с клавиатуры имя , фамилию и возраст
        (Ваши или воображаемого персонажа) и выводит в консоль эту информацию в следующем виде:
        First name: John
        Last name: Smith
        Age: 25
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("First name: " + name);
        System.out.println("Last name: " + surname);
        System.out.println("Age: " + age);

    }
}
