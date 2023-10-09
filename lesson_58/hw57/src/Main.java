/*
1.
В программе задан список Person{ String fName, String lName, String email, String phone, Address address}.
Класс адрес в Person это:  Address{String postcode, String city, String street, String house}
Реализовать следующие функции:
   	                   	-получить список всех ФИО
           	   	    	-получить список всех e-mail
   	                   	-получить список всех телефонов
   	                   	-получить список всех адресов в виде строки адреса
Естественно, все вышеперечисленные функции может и должен реализовать один метод, в который в качестве параметра
должен приходить список Person и реализация необходимого способа обработки.

2.
Добавить в ваш метод возможность отфильтровать список, т.е. возможность получить список не всех ФИО, а только список
ФИО содержащих заданную строку, или начинающихся на заданную. букву

 */


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("John", "Smith", "john@gmail.com", "+4917623432203", new Address("10965", "Berlin", "Berliner Str.", "34"));
        Person p2 = new Person("Ann", "Ivanova", "ivanova@gmail.com", "+49177543745", new Address("10315", "Berlin", "Gensinger Str.", "53"));
        Person p3 = new Person("Alex", "Kotenko", "kotenko@gmail.com", "+491763456543", new Address("12434", "Postdam", "Postdamer Str.", "12"));

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        List<String> res = handler(list, p -> p.getfName() + " " + p.getlName());
        System.out.println(res);

        res = handler(list, p -> p.getEmail());
        System.out.println(res);

        res = handler(list, p -> p.getPhone());
        System.out.println(res);

        res = handler(list, p -> p.getAddress().toString());
        System.out.println(res);

        res = handler(list,
                p -> p.getAddress().toString(),
                p -> p.getlName().equals("Kotenko"));
        System.out.println(res);

        res = handler(list,
                p -> p.getAddress().toString(),
                p -> p.getAddress().getCity().equals("Berlin"));
        System.out.println(res);

        List<Address> addresses = ganericHandler(list, p -> p.getAddress(), p -> true);
        System.out.println(addresses);

        List<Integer> list1 = ganericHandler(List.of("1", "2", "3", "4"), s -> Integer.parseInt(s), s -> true);
        System.out.println(list1);



    }

    public static List<String> handler(List<Person> list, Function<Person, String> function) {
//        List<String> result = new ArrayList<>();
//        if (list == null || list.isEmpty()) return result;
//
//        for (Person p : list) {
//            String str = function.apply(p); // преобраазовало персона в строку
//            result.add(str);
//        }
//
//        return result;

//        return handler(list, function, null);
        return handler(list, function, p ->true);
    }

    public static List<String> handler(List<Person> list, Function<Person, String> function, Predicate<Person> predicate) {
        List<String> result = new ArrayList<>();
        if (list == null || list.isEmpty()) return result;

        for (Person p : list) {
            if (predicate.test(p)){
//            if (predicate==null || predicate.test(p)){
                String str = function.apply(p); // преобраазовало персона в строку
                result.add(str);
            }
        }

        return result;
    }


    // T - тип исходных данных
    // R - тип результата
    public static <T, R>List<R> ganericHandler(List<T> list, Function<T, R> function, Predicate<T> predicate) {
        List<R> result = new ArrayList<>();
        if (list == null || list.isEmpty()) return result;

        for (T p : list) {
            if (predicate.test(p)){
//            if (predicate==null || predicate.test(p)){
                R str = function.apply(p); // преобраазовало T в строку
                result.add(str);
            }
        }

        return result;
    }



}
