package symbol;

public class HomeWork {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int ch1 = 'B';
        System.out.println("ASCII значение символа 'B': " + ch1);

        // если в 16ричной системе
        int hex = 0xFF; // ox говорит о том, что записанное дальше - 16ричное число
        System.out.println(hex);

        // если в 8ричной системе
        int oct = 011;
        System.out.println(oct);

        // если в 2ичной системе
        int binary = 0b1100; // ob в двоичной системе
        System.out.println(binary);

        //__________________________________
        System.out.println("\nЗадача 2");

        String a = "Hi";
        String b = "Bye";

        System.out.println("Соединение строк в виде abba : " + a + b + b + a);

        //__________________________________
        System.out.println("\nЗадача 3");

        String ja = "Java";
        System.out.println("Символ строки с индексом 2 в строке Java: " + ja.charAt(2));

        // или
        char ch2 = ja.charAt(2);
        System.out.println("Символ строки с индексом 2 в строке Java: " + ch2);

        // чтоб вывести последний символ:
        ja = "Hi";
        System.out.println(ja.charAt(ja.length() - 1));
        // или
        int lengthHi = ja.length();
        ch2 = ja.charAt(lengthHi - 1);
        System.out.println(ch2);

        //__________________________________
        System.out.println("\nЗадача 4");

        int len = ja.length()*2;
        System.out.println("Двойная длина строки Java = " + len);









    }
}
