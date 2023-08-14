package symbol;

public class OurString {
    public static void main(String[] args) {


        // String это класс

        // String это строка, последовательность символов

        String john = "John";
        //String bill = new String();
        String java = "Java";

        String hello = "Hello";
        System.out.println(hello);

        // H e l l o    length = 5
        // 0 1 2 3 4

        int len = hello.length();
        System.out.println(len);

        System.out.println("Java имеет символов: " + java.length());


        // charAt() - находит символ по заданному индексу

        char ch0 = hello.charAt(0); // H
        System.out.println(ch0);
        char ch1 = hello.charAt(1);
        System.out.println(ch1);
        char ch2 = hello.charAt(2);
        System.out.println(ch2);
        char ch3 = hello.charAt(3);
        System.out.println(ch3);
        char ch4 = hello.charAt(4);
        System.out.println(ch4);

        // .toUpperCase метод делает большими буквами
        System.out.println(hello.toUpperCase());

        // .toLowerCase() метод переводит в маленький регистр










    }
}
