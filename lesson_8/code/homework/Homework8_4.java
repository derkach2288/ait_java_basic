package homework;

public class Homework8_4 {
    public static void main(String[] args) {
        /*
        Задача 4(*)
        Создайте массив, содержащий в себе название карточных мастей.
        Создайте массив, содержащий в себе карты от двойки до туза.
        Раздайте из колоды по 6 карт на 4 игрока.
         */

        String[] cardsuit = {"Трефы", "Бубны", "Черви", "Пики"};
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "валет", "дама", "король", "туз"};

        // формируем колоду карт
        String[] deck = new String[52];
//        deck[0] = cards[0] + cardsuit[0];
//        System.out.println(deck[0]);

        int icards = 0;
        int icardsuit = 0;
        int idesc = 0;
//        while (idesc < deck.length) {
            while (icardsuit < cardsuit.length) {
                while (icards < cards.length) {
                    deck[idesc] = cardsuit[icardsuit] + cards[icards];
                    System.out.print(deck[idesc] + " | ");
                    idesc++;
                    icards++;
                }
                icards = 0;
                icardsuit++;
                System.out.println();
            }
////            icardsuit++;
//        }

        System.out.println();
        System.out.println(deck[50]);



//        String[] player1 = new String[6];
//
//        int a = 0;
//        int b = 3;
//        int i = 0;
//
//        while (i < player1.length){
//            player1[i] = cardsuit[(int) (Math.random()*(b - a +1) +a)];
//            System.out.print(player1[i] + " | ");
//            i++;
//        }
//
    }
}
