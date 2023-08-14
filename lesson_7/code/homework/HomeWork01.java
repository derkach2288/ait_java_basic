package homework;

public class HomeWork01 {
    public static void main(String[] args) {
        /*
        Задача1
        С помощью цикла while написать программу, выводящую на экран
        куб числа от 1 до заданного числа n
        Пример:для числа n=3
        1 в кубе 1
        2 в кубе 8
        3 в кубе 27
         */

        int n = 4;
        int i = 1;
        int kub = 0;

        while (i <= n){
            kub = i*i*i;
            System.out.println(i + " в кубе = " + kub);
            i++;
        }
    }
}
