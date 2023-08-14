package practicum;

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {
        /*
        Задание 3. Написать метод, который получает на вход вид
        выбрасываемого мусора (слово), а возвращает цвет урны, в
        которую его надо выбросить. Протестировать метод, вызвав
        его в методе main.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you have - paper, bio, rest?");
        String w = scanner.nextLine();

        String respond = garbege(w);

        System.out.println(respond);
    }
    //========Method===============
    public static String garbege(String g){
        switch (g){
            case "paper":
                return "blau";
            case "bio":
                return "braun";
            case "rest":
                return "black";
            default: return "back home";
        }
    }

    //=============================
}
