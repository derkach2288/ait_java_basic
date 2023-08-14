import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Mein {
    public static void main(String[] args) {

        System.out.println("Hallo Java"); // печать с новой строки после этого
        System.out.print("Hello Java 1");
        System.out.println("Hello");

        // переменные в джава

        int a = 5; // integer - целое число
        double c = 2.1; // числа с запятой
        String b = "Hello"; // строка
        char ch = 'r';
        a = 10;
        a = a + 1;

        System.out.println(a);

        int sum = a + 6;

        System.out.println(sum);
        System.out.println("Hello" + "Java" + b );
        System.out.println("1" + 2 );
        System.out.println(1+2+"1"+2+2 );



        // byte, short, int, long - для работы с целыми числами
        // float, double - для работы с числами с точкой
        // char - для хранения символов
        // boolean - true false
        /*
        byte - 1 байт - от -128 до 127
        short - 2 байта
        int - 4 байта - -2млрд до 2 млрд
        long - 8 байт
        long x = 9000000L; - если не указать L - воспринимается как интеджер
         */

    }
}
