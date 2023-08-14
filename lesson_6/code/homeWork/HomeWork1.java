package homeWork;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        Задача 1.
        Написать программу, выводящую на экран максимальное из трех целых чисел.
        Числа задайте самостоятельно внутри программы. Решите эту задачу с помощью
        if ... else и также с помощью тернарного оператора.
         */

        int a = 6;
        int b = 5;
        int c = 8;

        if (a>b && a>c) {
                System.out.println("Максимальное число из: " + a + "; " + + b + "; " + c + " = " + a);
            }
            else if (b>a && b>c) {
                System.out.println("Максимальное число из: " + a + "; " + + b + "; " + c + " = " + b);
            }
            else {
                System.out.println("Максимальное число из: " + a + "; " + + b + "; " + c + " = " + c);
            }

            //с помощью тернарного оператора

        int max = b > a ? b : a;
        int more = max > c ? max : c;
        System.out.println("Максимальное число из: " + a + "; " + + b + "; " + c + " = " + more);
//-----------------
        int max1 = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Максимальное число из: " + a + "; " + + b + "; " + c + " = " + max1);
    }
}

