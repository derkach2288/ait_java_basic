package homework;

import practicum.Array;

public class HomeWork8_3 {
    public static void main(String[] args) {
        /*
        Задача 3
        Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
        Выведите массив на печать. Поменяйте местами первый и последний элементы
        массива и снова выведите массив на печать.
         */

        int[] array = new int[20];

        int a = 10;
        int b = 20;
        int i = 0;

        while (i < array.length){
            array[i] = (int) (Math.random()*(b - a +1) +a);
            System.out.print(array[i] + " | ");
            i++;
        }
        System.out.println();
        int last = array[0];
        array[0] = array[array.length-1];
        array[19] = last;

        i = 0;
        while (i < array.length){
            System.out.print(array[i] + " | ");
            i++;
        }

    }
}
