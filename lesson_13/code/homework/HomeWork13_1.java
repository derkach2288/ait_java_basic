package homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork13_1 {
    public static void main(String[] args) {
        /*
        Задача 1
        Напишите метод, который имитирует бросание игрового кубика. На вход методу
        подается число бросков, на выходе метод возвращает результаты всех бросков.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество кубиков: ");

        int cubes = scanner.nextInt();
        System.out.println("Результат игры: ");


        int[] result = gameResult(cubes);
        for (int i : result){
            System.out.print(i + " | ");
        }
    }
    //-----------Method------------
    public static int[] gameResult(int n){
        Random random = new Random();
        int[] res = new int[n];

        for (int i = 0; i < res.length; i++) {
            res[i] = random.nextInt(1, 7);
        }
        return res;
        
    }

    //-----------------------------
}
