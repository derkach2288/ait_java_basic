package practicum;

public class ArrayMethod {
    public static void main(String[] args) {
        /*
        Задача 4. реализуйте метод, который получает на вход массив
         и находит его минимальный элемент.
         */
        // шаг 1. Создать масив
        // шаг 2. Сделать мктод

        int[] array = {14, 73, 20, 8, -15, -45, 21, -999};

        minElArray(array);


    }
    // ---------Method---------
    public static void minElArray(int[] arr) {
        // ищем минимальный элемент
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min element of array is: " + min);
    }

    //------------------------
}
