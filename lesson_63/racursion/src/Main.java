public class Main {
    public static void main(String[] args) {

        recursivePrint(3);
        System.out.println();
        recursivePrint2(3);
    }

    // печатать числа от указанного числа до нуля
    public static void recursivePrint(int number) {
        if (number == 0) {
            // stop - базовый случай - когда рекурсия не запускается дальше без вызова
            // условие выхода
            System.out.println(0);
            return;
        }
        System.out.println(number);
        recursivePrint(number - 1); // шаг рекурсии
    }

    public static void recursivePrint2(int number) {
        if (number > 0) {
//            System.out.println(number);
            recursivePrint2(number - 1);
            System.out.println(number); // возвращается назад и дочитывается в обратном порядке
        } else
            // stop - базовый случай - когда рекурсия не запускается дальше без вызова
            // условие выхода
            System.out.println(0);
        return;
    }


    // бесконечный цикл
//    public static void recursivePrint2(int number){
//        recursivePrint2(number-1);
//        if (number == 0){
//            // stop - базовый случай - когда рекурсия не запускается дальше без вызова
//            // условие выхода
//            System.out.println(0);
//            return;
//        }
//        System.out.println(number);
//    }


}
