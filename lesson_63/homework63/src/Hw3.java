/*
Задание 3 Varargs
Создайте класс скрипка. Пусть у скрипки будут поля:

String имя мастера, LocalDate дата производства Создайте в
Майне метод, который должен принимать произвольное число скрипок
и возвращать имя мастера самой старой скрипки из переданных.
То есть метод должен бытия статическим и возвращать String.
 */

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Hw3 {
    public static void main(String[] args) {

        Violin violin1 = new Violin("John", LocalDate.of(1988, 12, 10));
        Violin violin2 = new Violin("Bah", LocalDate.of(1900, 10, 15));
        Violin violin3 = new Violin("Mozart", LocalDate.of(1942, 8, 10));

        System.out.println(oldViolin(violin1, violin2, violin3));
        System.out.println(oldViolin(violin1, violin3));


    }

    public static String oldViolin(Violin... arg) {
        if (arg == null) return null;
        String old = Arrays.stream(arg)
                .min((a, b) -> a.getDate().compareTo(b.getDate()))
                .orElseGet(()->null)
                .getName();
        return old;
    }

}
