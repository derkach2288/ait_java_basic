package practicum;

public class ForLoop {
    public static void main(String[] args) {
        // Цикл For
        /*
        for(initialisation; condition; increment/decrement){
        statament(s)
        }

        initialisation - присвоение начального значения переменной, которая будет зменяться в цикле
        condition - булеановсское выражение, определяющее будет ли выполняться цикл
        increment/decrement - изменение счетчика
        statament - команды в теле цикла

         */

        for (int i = 0; i <=3; i++){
            System.out.println(i);
        }

        char exit = 'N';
        while (exit != 'N'){
            System.out.println("hallo");
        }

        for (int i = 100; i > -10; i-=5){
            System.out.println(i);
        }
        System.out.println("End");

        //_________________________

        for(int i = 10; i < 5; i++){
            i++;
        }

        int i,j;
        for(i = 0, j = 10; i < j; i++, j--){
            System.out.println("i and j: " + i + " "+ j);
        }
        System.out.println("-----------------");


//        for(int i = 0; i<10;){
//            System.out.println(i);
//            i++;
//        }

        // посчитать суммму чисел от 0 до n, используя for
        int n = 10;
        int sum = 0;

        for (int x = 0; x<=n; x++){
            sum+=x;
        }
        System.out.println(sum);

        // без тела цикла
        int y;
        sum = 0;

        for (y=0;y<=n;sum+=y++);
        System.out.println("sum with no body is "+sum);





    }
}
