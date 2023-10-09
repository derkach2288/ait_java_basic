import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// STREAM - объект, который умеет работать с потоком данных
public class Main {
    /*
    map
    filter
    forEach
    toList
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 4, 5, 4, 66, 34);

        //1
        System.out.println("------------");
        list.stream()
                .map(i -> String.valueOf(i) + "q") // инт в строку
                .map(s->s.length()) // строку в инт - длина строки
                .map(i-> Integer.toBinaryString(i)) // инт в двоичный
                .forEach(s -> System.out.println(s)); // выводим на печать каждый элемент

        //2
        System.out.println("------2------");
        List<String> list1 = list.stream()
                .filter(i -> i % 2 == 0) // фильтр - только четные числа
                .map(i -> Integer.toBinaryString(i))
                .toList();
        System.out.println(list1);
        list.forEach(s -> System.out.println(s));

        System.out.println("----------3------------");
        List<Person> listPerson = List.of(
                new Person("Ivan", "Polyakov", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName1", "lName1", "ivan@gmail.com", "+3241512",
                        new Address("124524", "Moscow", "Bolotnaya", "24-1")),
                new Person("fName2", "lName2", "ivan2@gmail.com", "+2222",
                        new Address("124524", "Moscow", "Bolotnaya", "25-1")),
                new Person("Jack", "London", "jack@gmail.com", "+512412",
                        new Address("42151", "London", "Compton", "+24125412")));

        List<String> strings = listPerson.stream()
                .map(p -> p.getfName() + " " + p.getlName())
                .toList();
        System.out.println(strings);

        strings = listPerson.stream()
                .map(p -> p.getEmail())
                .toList();
        System.out.println(strings);

        Set<String> set1 = listPerson.stream()
                .map(p -> p.getEmail())
                .collect(Collectors.toSet()); // ложит в set
        System.out.println(set1);

        LinkedHashSet<String> set2 = listPerson.stream()
                .map(p -> p.getEmail())
                .collect(Collectors.toCollection(() -> new LinkedHashSet<>()));// ложит в LinkedHashSet
        System.out.println(set1);

        System.out.println("-------4------");

        List<Student> students = List.of(
                new Student("jack", List.of(1, 2, 3)),
                new Student("jack1", List.of(5, 2)),
                new Student("jack2", List.of(2, 2, 3))

        );

        System.out.println(students.stream()
                .map(s -> s.getName())
                .toList());

        List<List<Integer>> list2 = students.stream()
                .map(s -> s.getRate())
                .toList();

        System.out.println(students.stream()
                .flatMap(s -> s.getRate().stream()) // каждый студент распался на поток из оценок
                .count()); // количество оцeнок

        System.out.println(students.stream()
                .flatMap(s -> s.getRate().stream()) // каждый студент распался на поток из оценок
                .sorted()
                .filter(i -> i==2)
                .toList());



    }



}
