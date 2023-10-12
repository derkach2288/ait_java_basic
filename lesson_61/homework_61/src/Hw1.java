/*
Задача 1
Создайте класс Person, c полями имя(стринг) и дата рождения(Date), которому при создании передавайте имя и дату рождения в виде строки в формате "ДД.ММ.ГГГГ".

Реализуйте в классе интерфейс Comparable<Person>, в котором "меньше" будет значить "младше".

Подсказка: не обязательно вычислять возраст, этому мы так и не научились. Но можно сравнивать даты рождения!
 */

import java.text.ParseException;
import java.util.List;

public class Hw1 {
    public static void main(String[] args) throws ParseException {

        List<Person> persons = List.of(
                new Person("John", "22.11.1988"),
                new Person("Anna", "22.10.1988"),
                new Person("Jek", "15.08.1998"),
                new Person("Alex", "45.03.1985")
        );
        System.out.println(persons);
        List<Person> personsSort = persons.stream().sorted().toList();
        System.out.println(personsSort);

//        List<Person> list = persons.stream()
//                .sorted((a, b) -> b.getDateOfBirth().compareTo(a.getDateOfBirth()))
//                .toList();
//
//        System.out.println(list);

    }
}
