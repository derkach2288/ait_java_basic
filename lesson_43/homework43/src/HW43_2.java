import java.util.*;

public class HW43_2 {
/*
** Задача 2 **

Дан Map<Integer, List> - ключ возраст, значение список имен людей этого возраста.
Необходимо получить список объектов Person{String name, int age}
1. перебираем map
2. перебираем каждый list
3. для каждой записи в листе создаем Person
 */

    public static void main(String[] args) {

        Map<Integer, List<String>> map = new HashMap<>();
        map.put(23, new ArrayList<>(List.of("Jack", "John")));
        map.put(24, new ArrayList<>(List.of("Nick", "Ann", "Alex")));
        System.out.println(map);

        System.out.println(mapAgeListNamesToListPerson(map));


//        Person p1 = new Person("Jack", 23);
//        Person p2 = new Person("John", 23);
//        Person p3 = new Person("Nick", 24);
//        Person p4 = new Person("Ann", 24);
//        Person p5 = new Person("Alex", 24);
//
//        List<Person> listPerson = new ArrayList<>();
//        listPerson.add(p1);
//        listPerson.add(p2);
//        listPerson.add(p3);
//        listPerson.add(p4);
//        listPerson.add(p5);
//        System.out.println(listPerson);

//        System.out.println(mapPerson(listPerson));




    }
    public static List<Person> mapAgeListNamesToListPerson(Map<Integer, List<String>> map){
        List<Person> result = new ArrayList<>();
        if (map == null) return result;

        Set<Map.Entry<Integer, List<String>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<String>> e :entries) {
            Integer age = e.getKey();
            for (String name : e.getValue()) {
                result.add(new Person(name, age));
            }
        }


        return result;
    }

//    public static Map<Integer, List> mapPerson(List<Person> listPerson){
//        Map<Integer, List> mapPerson = new HashMap<>();
//
//        for (Person person : listPerson) {
//            List<String> list = mapPerson.getOrDefault(person.getAge(), new ArrayList());
//            list.add(person.getName());
//            mapPerson.put(person.getAge(), list);
//        }
//        return mapPerson;
//    }
}
