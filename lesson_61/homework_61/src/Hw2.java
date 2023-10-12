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
        LocalDate date2 = LocalDate.of(2022, 02, 24);
        System.out.println(periodOfTime(date1, date2));


    }

    public static String periodOfTime(LocalDate date1, LocalDate date2){
        Period period = Period.between(date2, date1);

        return period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days";
    }

}
