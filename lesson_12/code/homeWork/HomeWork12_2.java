package homeWork;

public class HomeWork12_2 {
    public static void main(String[] args) {
        /*
        Задача 2
        Написать метод, проверяющий содержатся ли в массиве целых чисел 0 или -1. Если да, метод возвращает true,
        если нет false.
        static boolean checkOnesAndZeros( int[] ints)
        В методе main() вывести получившийся результат на экран
         */
        int[] array = {23, 12, -12, 65, 5, -1};

        System.out.println(checkOnesAndZeros(array));

    }
    static boolean checkOnesAndZeros( int[] ints ){

        for( int i = 0; i<ints.length; i++){
            if (ints[i] == 0 || ints[i] == -1){
                return true;
            }
        }
        return false;
    }
}
