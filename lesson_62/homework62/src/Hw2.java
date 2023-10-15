/*
Задача 2 (Дополнительная) ⭐⭐⭐
Создайте метод, который принимает две даты LocalDate,
а возвращает строку, сколько времени между ними пройдет.

Например: "10 years, 2 months, 3 days"

Используйте класс Period
 */

import java.time.LocalDate;
import java.time.Period;

public class Hw2 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2023,10,12);
//        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2022, 02, 24);
        System.out.println(periodOfTime(date1, date2));
        System.out.println(periodOfTime2(date2, date1));



    }

    public static String periodOfTime(LocalDate date1, LocalDate date2){
        Period period = Period.between(date2, date1);

        return period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days";
    }

    public static String periodOfTime2(LocalDate date1, LocalDate date2){

        LocalDate earLierDate = date1.isBefore(date2) ? date1 : date2; // если дата 1 болше - выбираем ее, если меньше - выбираем дату2
        LocalDate laterDate = date2.isBefore(date1) ? date1 : date2; // выбираем дату позднюю
        Period period = Period.between(earLierDate, laterDate);


        int years = period.getYears(); // модуль числа, чтоб убрать минус
        int month = period.getMonths();
        int days = period.getDays();


//        int years = Math.abs(period.getYears()); // модуль числа, чтоб убрать минус
//        int month = Math.abs(period.getMonths());
//        int days = Math.abs(period.getDays());

//        return years + " years " + month + " months " + days + " days";
        return String.format("%d years, %d month, %d days", years, month, days);
    }
    //    %d - digit - для целочисленных
    //    %f - float - для даблов и флот %.2f - это 3.33
    //    %s - String - для строк
    //    %b - boolean - для булеан


}
