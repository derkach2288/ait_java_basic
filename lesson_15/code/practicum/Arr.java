package practicum;

public class Arr {
    public static void main(String[] args) {
        /*
        Написать метод. который получает массив целых чисел, и возвращает последнее число в массиве, которое меньше 0
         */
        int[] arr = {6, 5, 2, -2, 0, 6, -4, 0};
        System.out.println("Последний минимальный элемент массива: " + minArray(arr));
    }
    public static int minArray(int[] array){
        int min = array[0];
        int equal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
            else if (array[i] == equal){
               equal = array[i];
            }
        }
        if ((min == equal)){
            return 0;
        }
        return min;
    }
}
