package symbol;

public class Main {
    public static void main(String[] args) {
        System.out.println("Char");

        /*
        513 != 5+1+3
        5*100 + 1*10+ 3*1 = 513
        5*10^2 + 1*10^1 + 3*10^0 = 513

        decimal         binary
        0               000
        1               001
        2               010
        3               011
        4               0100
        5               101
        6               110
        7               111
        8               1000

        101 = 1*2^2 + 0*2^1 + 1*2^0 = 4+0+1 = 5

        00
        10
        01
        11

        987654.321 = 0.987654321 * 10^6 - мантиса

        ASCII - American Standart Code for Information Interchange

        Hexadecimal     Decimal     Binary
        0               0           0000
        1               1           0001
        2               2           0010
        .
        .
        .
        A               10
        B               11
        C               12

         */

        System.out.println("\u0024"); // символ unicode

        /* Тип char. В Джава для хранения символов используется 2 байта
        т.е. можно хранить симаолы в диапазоне
        от 0 до 65535.
        Джава использует Юникод. ASCII являются частью
        юникода в дтапазоне от 0 до 127
         */

        char ch;
        ch = 'X';
//        ch = 'a';
        System.out.println("Это символ: " + ch);
        System.out.println("Это символ: " + "X");

        ch++;
        System.out.println("Это символ : " + ch);

        int chInt = 'X';
        System.out.println("chInt это:" + chInt);

        char char1 = 88;
        System.out.println("char1 это " + char1);

        System.out.println("He says \"hello\""); // \это экранирование символа

        System.out.print("Hello\n");
        System.out.println("\nJava"); // \n - перевод на новую строку

        System.out.println("\tHi\tJava"); // \t - tab

        // \\uxxxx - \\u это символ юникода

        System.out.println("k"); // ""строка тз одного символа
        System.out.println('k'); // ''символ


        //-------------------------------------
        System.out.println("---------------\n");

        String a = "Hello";
        System.out.println(a);


        Person john = new Person();
        john.name = "John";
        john.age = 25;

        System.out.println("Person name is " + john.name);
        System.out.println("Person's age is " + john.age);
        john.canWalk();
        john.canTalk();


        Person bill = new Person();
        bill.name = "Bill";
        bill.age = 46;

        System.out.println("Person name is " + bill.name);
        System.out.println("Person's age is " + bill.age);
        bill.canTalk();
        bill.canWalk();








    }
}
