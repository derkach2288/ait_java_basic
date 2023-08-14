package homeWork;

public class HomeWork2 {
    public static void main(String[] args) {

        /*
        Задача 2. В программе задаются случайным образом две целочисленные
        координаты x и y в интервале от -10 до 10. Определите, в какую четверть
        попадает точка с координатами ( x, y).
         */

        int a = -10;
        int b = 10;


        int x = (int) (Math.random() * (b - a + 1) + a); // [ 0; 1), (int) - преобразование типа
        System.out.println("x = " + x);

        int y = (int) (Math.random() * (b - a + 1) + a); // [ 0; 1), (int) - преобразование типа
        System.out.println("y = " + y);

        if (x > 0 & y > 0) {
            System.out.println("Точка лежит в 1 четверти системы координат");
        } else if (x < 0 & y > 0) {
            System.out.println("Точка лежит в 2 четверти системы координат");
        } else if (x < 0 & y < 0) {
            System.out.println("Точка лежит в 3 четверти системы координат");
        } else if (x > 0 & y < 0) {
            System.out.println("Точка лежит в 4 четверти системы координат");
        } else if (x != 0 & y == 0) {
            System.out.println("Точка лежит на оси X");
        } else if (x == 0 & y != 0) {
            System.out.println("Точка лежит на оси Y");
        } else
            System.out.println("Точка лежит в нулевой точке системы координат");

    }
}
