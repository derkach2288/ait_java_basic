/*
Задание 1 рекурсия
Дано натуральное число n. Выведите все числа от 1 до n.
Иными словами, метод должен принимать натуральное число и выводить числа
от 1 до это числа.
Например, для параметра 6 -> выведет 1 2 3 4 5 6
 */

public class Hw1 {
    public static void main(String[] args) {

        recursivePrint(6);
    }

    public static void recursivePrint(int n){
        if (n > 1){
            recursivePrint(n-1);
            System.out.println(n);
        } else
            System.out.println(1);
        return;
    }




}
