import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, Person> map2 = new HashMap<>();
        Map<Person, Integer> map3 = new HashMap<>(); // нужно сделать еквелс и хешкод для ключа
        Map<String, List<Person>> map4 = new HashMap<>();

        map1.put("qwe1", "123-123123"); // добавить
        map1.put("qwe2", "123-2344442"); // добавить
        map1.put("qwe3", "123-4566777"); // добавить
        map1.put("qwe4", "123-7564647"); // добавить

        System.out.println(map1);

        // get по ключу
        System.out.println(map1.get("qwe3"));

        // Iterate map
        System.out.println("=====Iterate map=====");
        Set<String> keyMap1 =  map1.keySet();
        for (String key : keyMap1) {
            System.out.println(key + " " + map1.get(key));
        }

        // Iterate map 2
        System.out.println("=====Iterate map 2=====");

        Set<Map.Entry<String, String>> entriesMap1 = map1.entrySet(); // comand alt v
        for (Map.Entry<String, String> entry : entriesMap1) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        /////////////
        System.out.println("===============");

        List<Person> people = List.of(
                new Person("Jack", 21),
                new Person("John", 23),
                new Person("Nick", 25),
                new Person("Ann", 10));

        for (Person p : people) {
            map3.put(p, p.getAge());
        }

        System.out.println(map3);

        Person person = new Person("Jack", 21);
        map3.put(person, person.getAge());
        System.out.println(map3);

        // map1.containsKey() есть ли такой ключ
        // map1.containsValue() есть ли такое значение - лучше не использовать, медленный

    }
}
