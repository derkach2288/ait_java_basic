package mathemat;

public class HomeWork {
    public static void main(String[] args) {

        System.out.println("Задача 1 ");

        int x0 = 0;
        int x1 = 1;
        int x2 = 1;
        int x3 = 3;
        int x4 = 4;
        int x5 = 5;
        int x6 = 6;
        int x7 = 7;
        int x8 = 8;
        int x9 = 9;

        int sum = (x0 + x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9)/10;
        System.out.println( "Среднее арифметическкое : " + sum ); // программа отбросила в дробной части 4


        System.out.println("--------------------------");
        System.out.println("Задача 2");

        int a = 1000;
        int b = 500;

        int total = ( a + b) - 100;

        System.out.println("Сумма со скидкой : " + total + " руб. ");

        System.out.print("Сумма скидки от этой покупки : ");
        System.out.println( a + b - total + " руб. " ); // легких путей не ищем))


        System.out.println("--------------------------");
        System.out.println("Задача 3");

        int t1 = 18;
        int t2 = 17;
        int t3 = 20;
        int t4 = 23;
        int t5 = 21;
        int t6 = 19;
        int t7 = 23;

        double st = (double)(t1 + t2 + t3 + t4 + t5 + t6 + t7)/7;

        System.out.print("Средняя температура за неделю : ");
        System.out.printf("Result: %.2f", st);
        System.out.println(" градусов по Цельсию");


        System.out.println("--------------------------");
        System.out.println("Задача 4");

        int num1 = 2 ;
        int num2 = 5;
        int num3 = 7;

        System.out.print("Если " + num1 + " / 2 " + " остаток от деления = ");
        System.out.println( num1 % 2 );

        System.out.print("Если " + num2 + " / 2 " + " остаток от деления = ");
        System.out.println( num2 % 2 );

        System.out.print("Если " + num3 + " / 2 " + " остаток от деления = ");
        System.out.println( num3 % 2 );

        System.out.print("Если " + num1 + " / 3 " + " остаток от деления = ");
        System.out.println( num1 % 3 );

        System.out.print("Если " + num2 + " / 3 " + " остаток от деления = ");
        System.out.println( num2 % 3 );

        System.out.print("Если " + num3 + " / 3 " + " остаток от деления = ");
        System.out.println( num3 % 3 );


        System.out.println("--------------------------");
        System.out.println("Задача 5");

        int x = 3;

        x+=x++;

        System.out.println("x = " + x); // x будет равно 6, посколько х++ это постфиксная операция. x+=x++ равносильно x = x + x++


    }

}
