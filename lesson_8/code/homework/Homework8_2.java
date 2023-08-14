package homework;

public class Homework8_2 {
    public static void main(String[] args) {
        /*
        Задача 2
        Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        Найдите максимальный элемент массива и его индекс.
         */

        int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int i = 0;
        int max = array[0];
        int pointer = 0;

        while (i < array.length){
            if (array[i] > max){
                max = array[i];
                pointer = i;
            }
            i++;
        }
        System.out.println("Максимальный элемент массива: " + max + ", его индекс: " + pointer);
    }
}
