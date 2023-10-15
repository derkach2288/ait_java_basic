/*
Задание 2 рекурсия (супер опциональное)
Дано слово, состоящее только из строчных латинских букв.
Проверьте, является ли это слово палиндромом. Выведите yes, если
является и no - если не является.

P.S. Палиндром - это слово, которое одинаково читается слева
направо, например: око, потоп.
 */

public class Hw2 {
    public static void main(String[] args) {

        System.out.println(palindrome("qwe"));
        System.out.println(palindrome("oko"));



    }


    public static String palindrome(String str){
        if (str.length() ==0 || str.length() == 1){
            return "yes";
        }
        if (str.charAt(0) == str.charAt(str.length()-1)){
            return palindrome(str.substring(1, str.length()-1));
        }
        return "no";
    }

}
