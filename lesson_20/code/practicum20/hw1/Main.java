package practicum20.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Используя класс SmartArray реализуйте следующую программу: пользователь с клавиатуры вводит целые числа.
        Как только пользователь вводит 0, программа выдает следующее:
        You have input the following numbers: …введенные_значения…..
        Total …колмчество_чисел… numbers
        Average value: …среднее…

         */

        NumbersReader numbersReader = new NumbersReader();
        SmartArray nembers = numbersReader.read();
        System.out.println(nembers);
        NumbersHandler handler = new NumbersHandler(nembers);
        handler.printStat();

        nembers.remove(0);

        System.out.println(nembers);
        handler.printStat();
    }
}