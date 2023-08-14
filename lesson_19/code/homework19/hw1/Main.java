package homework19.hw1;

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
        Scanner scanner = new Scanner(System.in);


        ArrayOfIntegers arr1 = new ArrayOfIntegers();
        arr1.addNumber(scanner);
        System.out.println(arr1);



//        SmartArray sm1 = new SmartArray();
//        sm1.add(1);
//        System.out.println(sm1);
//        sm1.add(2);
//        System.out.println(sm1);


    }
}