/*
Задание 1 Period, LocalDate (опциональное)
Сегодня возраст нашего героя - 50 лет, сколько лет ему было в 2007
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Hw1 {
    public static void main(String[] args) {

        int ageIn2007 = age(2007, 50);
        System.out.println("Сегодня возраст нашего героя - 50 лет, в 2007 году ему было " + ageIn2007);

        //--------variant2--------
        int var2ageIn2007 = age2(2007, 50);
        System.out.println("Сегодня возраст нашего героя - 50 лет, в 2007 году ему было " + var2ageIn2007);

    }
    public static int age(int year, int ageToday){
        LocalDate today = LocalDate.now(); // дата сейчас
        LocalDate date = LocalDate.of(year, today.getMonth(), today.getDayOfMonth()); // дата в 2007
        Period period = Period.between(date, today);

        return ageToday-period.getYears();

    }

    public static int age2(int year, int ageToday){
        LocalDate today = LocalDate.now(); // дата сейчас
        return ageToday -(today.getYear() - year);

    }

}
