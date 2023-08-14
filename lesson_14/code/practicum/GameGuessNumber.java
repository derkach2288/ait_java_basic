package practicum;

import java.util.Scanner;
        /*
    Написать игру "Угадай число", в которой за ограниченное число попыток ввода числа
    с клавиатуры нужно угадать секретное число от 0 до 9.

    Условия;
    1.Код игры находится в классе GameGuessNumber
    2.Класс должен содержать:
        - сканер для ввода числа
        - secret ,  в которой записано секретное число
        - следующие методы:
            - метод, считывающий количество предоставляемых попыток
            - метод, который считывает вводимое число
            - метод, содержащий логику игры
            - метод - последовательности вызова прдыдущих методов
     */


public class GameGuessNumber {
    static Scanner scanner = new Scanner(System.in);

    static int secret = 9; // нужно угадать это число

    public static void main(String[] args) {
        start();

    }
    //========Method========


    public static void start(){
        int attempts = readNumber0fAttempts();
        guessNumber(attempts);
        scanner.close();
    }

    static int readNumber0fAttempts(){ // считывает количество попыток
        System.out.println("Enter number of attempts ");
        return scanner.nextInt();
    }

    static int readNumber(){ // считывает с клавиатуры число, вводимое пользователем
        System.out.println("Enter the number from 0 to 9 ");
        return scanner.nextInt();
    }

    static void guessNumber (int attempts){
        while (attempts > 0 ){
            int number = readNumber();
            attempts--;
            if (number == secret){
                System.out.println("Bingo! You have guessed");
                return; // выйти из программы
            } else {
                System.out.println("Wrong! You have "+attempts+"attempts left.");
            }
        }
        System.out.println("Sorry, buddy. Maybe some other");
    }

    //======================
}
