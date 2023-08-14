package homework;

public class HoneWork9_1 {
    public static void main(String[] args) {
        /*
        Задача 1
        Написать программу, вычисляющую факториал числа 5.
        Факториал числа - это произведение всех целых чисел от 1 до самого числа.
        Т.е. факториал 5 это: 5! = 5 * 4 * 3 * 2 * 1.
        ! -обозначение факториала.
         */
        int f =5;
        int sum = 1; //

        for (int i = f; i>=1; i--){
            sum*=i; // sum = sum*i
        }
        System.out.println("Факториал числа " + f + " = " + sum);

        //-----------вариант 2
        int n = 5;
        int fact = 1;

        for (int i = 1; i<= n; i++){
            fact*=i;
        }
        System.out.println("Factotial " + n + " = " + fact);
    }
}
