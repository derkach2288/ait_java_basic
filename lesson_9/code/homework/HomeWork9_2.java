package homework;

public class HomeWork9_2 {
    public static void main(String[] args) {
        /*
        Задача 2
        Есть массив из 10 целых чисел. Написать программу, находящую количество четных чисел в нем.
         */

        int[] array = {3, 4, 2, 8, 34, 87, 23, 2, 54, 6};
        int counter = 0;

        for (int i=0; i < array.length; i++){
            if (array[i]%2==0) {
                System.out.print(array[i] + " | ");
                counter++;
            }
        }
        System.out.println(" - четные числа массива");
        System.out.println("Количество четных чисел = " + counter);
    }
}
