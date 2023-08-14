package homework;

public class HomeWork9_3 {
    public static void main(String[] args) {
        /*
        Задача 3
        Есть массив целых чисел. Написать программу, находящую разницу
        между значением максимального и минимального элементов. (max - min).
         */

        int[] array = {2, 54, 244, 3, 54, 334, 32};

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i]>max){
                max = array[i];
            } else if (array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println(max + " - " + min + " = " + (max-min));
    }
}
