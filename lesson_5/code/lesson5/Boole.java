package lesson5;

public class Boole {
    public static void main(String[] args) {

        // Тип boolean
        /*
        boolean занимает 1 бит и может принимать 2 значения
        true или false
         */

        boolean b = false;

        System.out.println(b);

        b = true;
        System.out.println(b);

        // 10>9 - результат true или false
        System.out.println("10>9 " + (10>9));
        System.out.println("10<9 " + (10<9));


        // Relational operators
        /*
        > больше
        < меньше
        >= больше или равно
        <= меньше или равно
        == равно
        != не равно

         */
        // результатом выполнения операторов сравнения будет true или false
        int i = 11;
        int j = 10;
        System.out.println("");
        System.out.println("i<j " + (i<j));
        System.out.println("i>j " + (i>j));
        System.out.println("i<=j " + (i<=j));
        System.out.println("i>=j " + (i>=j));
        System.out.println("i==j " + (i==j));
        System.out.println("i!=j " + (i!=j));

        //----------------------------------
        // логические операторы (Logical operators)
        // результат тоже bolean
        /*
        & - AND (и)
        | - OR (или)
        ! - NOT (не)
        ^ - XOR (исключающая или)

        p       q       p & q    p | q    p ^ q   !p
        false false     false    false    false   true
        true false      false    true     true    false
        false true      false    true     true    true
        true true       true     true     false   false

        false 0
        true 1

        Когда значения p и q разные - XOR дает true, одинаковые - false

         */

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1&b2 " + (b1 & b2));
        System.out.println("!(b1&b2) " + !(b1 & b2));
        System.out.println("b1|b2 " + (b1 | b2));
        System.out.println("b1^b2 " + (b1 ^ b2));

        /*
            будет проверять второй оперант только в случае необходимости
            || - Conditinal-OR (условный или)
            && - Conditinal-AND (условный и)
            обычный or and всегда проверяет оба

         */

        int n, d;

        n = 10;
        d = 0;

        if (d != 0 && (n % d)==0){
            System.out.println("n делится на d без остатка");
        }




    }
}
