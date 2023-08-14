package homework;

import practicum.Array;

public class Homework8_1 {
    public static void main(String[] args) {
        /*
        Задача 1
        Собрать в массив данные о росте (или возрасте) членов группы.
        Выведите на печать максимальное и минимальное значение.
         */
        int[] age = {34, 25, 54, 23, 25, 22, 25, 65, 23, 53, 34, 34, 43, 54, 43, 65, 34, 18, 45, 37};

        int i = 0;
        int min = age[0];
        int max = age[0];

        while (i < age.length){
            if (age[i] < min){
                min = age[i];
            }
            if (age[i] > max){ // можно заменить на else if
                max = age[i];
            }
            i++;
        }
        System.out.println("Минимальный возраст " + min);
        System.out.println("Максимальный возраст " + max);

    }
}
