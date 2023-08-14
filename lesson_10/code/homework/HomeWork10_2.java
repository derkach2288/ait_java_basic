package homework;

public class HomeWork10_2 {
    public static void main(String[] args) {
        /*
        Задача2
        Оформить решение задачи 1 про факториал и задачи 4
        про треугольник из предыдущего домашнего задания в виде методов
         */
        triangle();
    }
    static void triangle (){
        int m = 6;

        for (int i = 1; i <= m; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
