package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork13_3 {
    public static void main(String[] args) {
        /*
        Задание 3
        Реализовать метод, выводящий на экран все делители введенного пользователем целого числа.
        Вернуть массив со всеми делителями числа.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");

        int n = scanner.nextInt();

        System.out.println("Делители числа " + n + " :" );


        int[] res = dividers(n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " | ");
        }
    }
    //===========Method============
    public static int[] dividers(int number){
        int counter = 0;
        int[] divid = new int[number];
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0){
                divid[counter] = i;
                counter++;
            }
        }
        int[] newDivider = Arrays.copyOfRange(divid, 0, counter); // обрезка массива от и до. Последний эл. не входит
        return newDivider;
    }

    //=============================
}
