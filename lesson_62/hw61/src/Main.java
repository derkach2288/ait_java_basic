/*
Задача 1
Создайте класс Person, c полями имя(стринг) и дата рождения(Date), которому при создании передавайте имя и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".

Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".

Подсказка: не обязательно вычислять возраст, этому мы так и не научились. Но можно сравнивать даты рождения!

Пример того как при помощи formatter можно парсить строки в date:

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    Date octoberfest = formatter.parse("16.09.2023");
    System.out.println(octoberfest);
  }
}
 */

import java.text.ParseException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

        List<Person> persons = List.of(
                new Person("John Watts", "22.05.1914"),
                new Person("Anna Freud", "22.06.1902"),
                new Person("John Both", "22.05.1917"),
                new Person("Will Weathers", "22.05.1914")
        );

        List<Person> orderPersons = persons.stream()
                .sorted()
                .toList();
        System.out.println(orderPersons);

    }
}
