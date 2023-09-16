import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW43_2 {
/*
** Задача 2 **

Дан Map<Integer, List> - ключ возраст, значение список имен людей этого возраста.
Необходимо получить список объектов Person{String name, int age}
 */

    public static void main(String[] args) {

        Map<Integer, List> map = new HashMap<>();
        map.put(23, new ArrayList<>(List.of("Jack", "John")));
        map.put(24, new ArrayList<>(List.of("Nick", "Ann", "Alex")));
        System.out.println(map);

        Person p1 = new Person("Jack", 23);
        Person p2 = new Person("John", 23);
        Person p3 = new Person("Nick", 24);
        Person p4 = new Person("Ann", 24);
        Person p5 = new Person("Alex", 24);

        List<Person> listPerson = new ArrayList<>();
        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);
        listPerson.add(p5);
        System.out.println(listPerson);

        System.out.println(mapPerson(listPerson));

//        Map<Integer, List> mapPerson = new HashMap<>();
//        for (Person person : listPerson) {
//            List<String> list = mapPerson.getOrDefault(person.getAge(), new ArrayList());
//            list.add(person.getName());
//            mapPerson.put(person.getAge(), list);
//        }
//        System.out.println(mapPerson);




    }
    public static Map<Integer, List> mapPerson(List<Person> listPerson){
        Map<Integer, List> mapPerson = new HashMap<>();

        for (Person person : listPerson) {
            List<String> list = mapPerson.getOrDefault(person.getAge(), new ArrayList());
            list.add(person.getName());
            mapPerson.put(person.getAge(), list);
        }
        return mapPerson;
    }
}
