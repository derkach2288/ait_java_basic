package homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork13_2 {
    public static void main(String[] args) {
        /*
        Задача 2
        Реализуйте метод, который заполняет массив случайными буквами. Размер массива подается на вход методу
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество букв: ");

        int n = scanner.nextInt();

        char[] rLat = randomChar(n);

//        for (int i = 0; i < rLat.length; i++) {
//            System.out.print(rLat[i]);
//        }
        System.out.println("Вот ваши случайные буквы: ");
        for (char i: rLat) {
            System.out.print(i);
        }


    }
    //========Method==========
    public static char[] randomChar(int len){
        Random random = new Random();
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray(); // переводит строку в массив символов, лень было писать столько символов через запятую))
        char[] randomLetters = new char[len];
        for (int i = 0; i < randomLetters.length; i++) {
            randomLetters[i] = alphabet[random.nextInt(0, alphabet.length-1)];
        }
        return randomLetters;
    }

    //========================
}
