package practicum;

public class Coin {
    public static void main(String[] args) {
        /*
        Задание 2. Написать методы, реализующие имитацию:

        бросание монеты
        На вход методов подается ко-во попыток, метод должен вернуть результаты попыток.
        орел и решка n = (int)(Math.random() * (1 - 0 + 1) + 0)
         */
        int[] game = coins(20);

        for (int i = 0; i < game.length; i++) {
            System.out.print(game[i] + " | ");
        }
    }
    //========Method=========
    public static int[] coins(int n ){
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = (int)(Math.random()*(1-0+1)+0);
        }
        return c;
    }

    //=========================
}
