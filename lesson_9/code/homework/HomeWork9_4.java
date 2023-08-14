package homework;

public class HomeWork9_4 {
    public static void main(String[] args) {
        /*
        Задача 4*
        Написать программу, выводящую на экран треугольник,
        состоящий из цифр от 1 до 6 такого вида:
        1
        12
        123
        1234
        12345
        123456
         */
        int[] array = {1,2,3,4,5,6};
        for (int n = 5; n>=0; n--) {
            for (int i = 0; i < array.length - n; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        }

        // Вариант 2-------------------------


        int m = 8;

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
//
//        for (int i = 0; i < array.length-4; i++){
//            System.out.print(array[i]);
//        }
//
//        System.out.println();
//        for (int i = 0; i < array.length-3; i++){
//            System.out.print(array[i]);
//        }
//
//        System.out.println();
//        for (int i = 0; i < array.length-2; i++){
//            System.out.print(array[i]);
//        }
//
//        System.out.println();
//        for (int i = 0; i < array.length-1; i++){
//            System.out.print(array[i]);
//        }
//
//        System.out.println();
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i]);
//        }


