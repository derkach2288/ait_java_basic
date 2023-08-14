package homework;

public class HomeWork02 {
    public static void main(String[] args) {
        /*
        Задача2
        С помощью цикла while написать программу, выводящую
        на экран результат умножения данного цисла n на все целые числа
        от 0 до n
        Пример: для числа 3 результат будет 0, 3, 6, 9
         */

        int n = 3;
        int i = 0;
        int res = 0;

        System.out.print("Для числа " + n + " результат будет ");


        while (i <= n){
            res = i * n;
            System.out.print(res + ", ");
            i++;
        }







    }
}
