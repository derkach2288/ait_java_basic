package homeWork;

import java.util.Random;

public class HomeWork11_4 {
    public static void main(String[] args) {
        /*
        Задача 4 (*)
        Имеется массив данных - остатки на счетах клиентов банка
        (задать случайными числами в интервале от 10 000 до 100 000000 д.е.,
        количество клиентских счетов = 20). Произошла деноминация, теперь 1 д.е = 100
        старых д.е. Рассчитайте новые остатки денег на счетах клиентов.
         */
        Random random = new Random();

        double[] money = new double[20];

        System.out.println("Старые остатки денег на счетах: ");

        for (int i = 0; i < money.length; i++) {
//            money[i] = random.nextLong(10000L, 100000001L);
            money[i] = random.nextInt(10000, 10000001); // убрал один ноль
            System.out.print(money[i] + " | ");
        }
        System.out.println();
        System.out.println("Новые остатки денег на счетах: ");
        newMoney(money);

    }
    public static void newMoney(double array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] / 100;
            System.out.print(array[i] + " | ");
        }

    }
}
