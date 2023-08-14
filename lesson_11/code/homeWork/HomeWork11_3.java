package homeWork;

public class HomeWork11_3 {
    public static void main(String[] args) {
        /*
        Задача3
        Написать метод, принимающий массив целых чисел, и печатающий
        его в обратном порядке. Сначала последний элемент, потом предпоследний, и т. д.
         */
        int[] array = {1, 2, 3, 4, 5, 6};
        printReversArray(array);

    }
    public static void printReversArray(int arr[]){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " | ");
        }
    }
}
