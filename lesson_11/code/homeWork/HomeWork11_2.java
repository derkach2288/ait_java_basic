package homeWork;

public class HomeWork11_2 {
    public static void main(String[] args) {
        /*
        Задача2
        Реализуйте метод sumOfArray (сумма элементов массива),
        который получает на вход массив и определяет сумму его элементов.
         */

        int[] array = {4, 23, 58, 33, 97, 1};
        sumOfArray(array);
    }
    public static void sumOfArray (int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}
