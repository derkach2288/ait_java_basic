package homework;

import java.util.Random;

public class Homework8_3a {
    public static void main(String[] args) {
        /*
        Задача 3
        Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
        Выведите массив на печать. Поменяйте местами первый и последний элементы
        массива и снова выведите массив на печать.
         */

//        random.nextInt(100); // генерит случайные числа от 0 до 99
//        random.nextInt(10,21); // генерит случайные числа от 10 до 20

        // рандом с 2мя границами работает после 17й версии джава

//        random.nextInt(max-min+1)+min; генерация с одним диапазоном рандома в старых версиях

        Random random = new Random();

        int[] array = new int[20];

        int a = 10;
        int b = 20;
        int i = 0;

        while (i < array.length){
//            array[i] = random.nextInt(10,21);
            array[i] = random.nextInt(b-a+1)+a;
            System.out.print(array[i] + " | ");
            i++;
        }
        System.out.println();

        int last = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = last;

        i = 0;
        while (i < array.length){
            System.out.print(array[i] + " | ");
            i++;
        }

    }
}
