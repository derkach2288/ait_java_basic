package homework;

public class HomeWork13_4 {
    public static void main(String[] args) {
        /*
        Задача 4 (*)
        Написать метод, возвращающий минимальный и максимальный элемент из поданного ему на вход массива целых чисел.
         */
        int[] array = {2, 54, 244, 1, 3, 54, 334, 32};
        int min = maxMin(array)[0];
        int max = maxMin(array)[1];
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " +max);

    }
    //=========Method============
    public static int[] maxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
        }
        int[] arrMinMax = {min, max};
        return arrMinMax;
    }

    //===========================
}
