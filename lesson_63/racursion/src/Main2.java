public class Main2 {
    public static void main(String[] args) {
        recursivePrint(2);
    }
    public static void recursivePrint(int number) {
        if (number == 0) { // базовый случай - условие выхода
            System.out.println(0);
            return;
        }
        System.out.println(number);
        recursivePrint(number - 1); // number - 1 - шаг рекурсии
    }
}

