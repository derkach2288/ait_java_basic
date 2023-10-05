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
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Smith", "john@gmail.com", "+4917623432203", new Address("10965", "Berlin", "Berliner Str.", "34"));
        Person p2 = new Person("Ann", "Ivanova", "ivanova@gmail.com", "+49177543745", new Address("10315", "Berlin", "Gensinger Str.", "53"));
        Person p3 = new Person("Alex", "Kotenko", "kotenko@gmail.com", "+491763456543", new Address("12434", "Postdam", "Postdamer Str.", "12"));

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);


        List<String> temp = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            temp.add(personList.get(i).getfName());
        }
        System.out.println(temp);


        List<String> names = personProcessing(personList, (person -> person.getfName()+ " " + person.getlName()));
        System.out.println(names);

        List<String> emails = personProcessing(personList, person -> person.getEmail());
        System.out.println(emails);

        List<String> phones = personProcessing(personList, person -> person.getPhone());
        System.out.println(phones);

        List<String> addresses = personProcessing(personList, (person) -> {
//            return person.getAddress().getPostcode() + " " + person.getAddress().getCity() + " " + person.getAddress().getStreet() + " " + person.getAddress().getHouse();
            return person.getAddress().toString();
        });
        System.out.println(addresses);

        names = handlerPredicat(names, s -> s.startsWith("A"));
        System.out.println(names);

        addresses = handlerPredicat(addresses, s -> s.contains("Berlin"));
        System.out.println(addresses);



    }

//    public static <T> List<T> personProcessing(List<T> list, PersonTransformer<T> transformer){
//        List<T> res = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            res.add(transformer.transform(list.get(i)));
//        }
//
//        return res;
//    }

    public static List<String> personProcessing(List<Person> list, PersonTransformer transformer){
        List<String> res = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            res.add(transformer.transform(list.get(i)));
        }

        return res;
    }

    public static <T> List<T> handlerPredicat(List<T> list, Predicate<T> predicate){
        List<T> res= new ArrayList<>();
        for (T el:list) {
            if(predicate.test(el)) res.add(el);
        }
        return res;
    }




}
