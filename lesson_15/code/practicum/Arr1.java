package practicum;

public class Arr1 {
    public static void main(String[] args) {
        /*
        Написать метод. который получает массив целых чисел, и возвращает последнее число в массиве, которое меньше 0
         */
        int[] arr = {6, 2, 5, 4, -2, -4, 6}; // result will be -2
        System.out.println(getLastNumberLessThenZero(arr));

    }
    public static int getLastNumberLessThenZero(int[] array){
        int min = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]<0){
//                min = array[i];
//            }
//        }
//        return min;
        for (int i = array.length-1; i >= 0; i--) {
            if (array[i]<0){
                return array[i];
            }
        }
        return min;

    }
}
