package practicum;

public class WhileLoop {
    public static void main(String[] args) {

        // Цикл While

        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println();

        /* while ( condition ){ condition это переменная или выражение, в результате дающая boolean
            statement;
            statement;
           }
         */

        int i = 0; // присвоение начального значения переменной условия цикла

        while (i < 10){
            System.out.println(1);
            i++;
        }
        System.out.println("Конец цикла\n");


        i = 0; // присвоение начального значения переменной условия цикла
        while (i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("Конец цикла\n");


        int j = 10;

        while (j > 1){
            System.out.println(j);
            j--;
        }
        System.out.println("конец цикла\n");

//        while (true){ // пример бесконечного цикла
//            System.out.println("hello");
//        }

        char ch = 'a';

        while (ch <= 'z'){
            System.out.print(ch+" ");
            ch++;
        }

        /*
        Написать программу, считающую сумму чисел от 1 до 5.
        1+2+3+4+5 = 15
         */

        int y = 1;
        int sum = 0;

        while (y <= 5){
            sum = sum + y;
            y++;
        }
        System.out.println("\n\nsum = " + sum);

//------------------------
        y = 1;
        sum = 0;
        int n = 6;

        while (y <= n){
            sum = sum + y;
            y++;
        }
        System.out.println("\n\nsum = " + sum);
        System.out.println("____________");

//----------------------------------------------
        // цикл DO-WHILE условие выполняется хотя бы один раз, условие проверяется в конце цикла, а не в начале
        /*
        Отличие цикла DO-WHILE от WHILE - проверка условия в цикле происходит вконце цикла

        do{
         statament(s)
        } while (condition)
         */

        int g = -1;

        do {
            System.out.println(g);
            g--;
        }while (g > 1);

    }
}
