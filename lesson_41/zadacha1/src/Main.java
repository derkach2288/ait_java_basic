import java.util.*;

public class Main<E> {
    public static void main(String[] args) {
        // Написать метод, который принимает лист имен и возвращает лист без повторяющихся элементов

        System.out.println(task(List.of("jack", "john", "ann", "jack", "nick")));

        Person victor = new Person("Victor", 31);

        List<Person> people = task1(List.of(
                new Person("Jack", 21),
                new Person("John", 22),
                new Person("Ann", 30),
                new Person("Jack", 21),
                new Person("Jack", 21),
                victor

        ));

        Set<Person> set = new HashSet<>(people);
        Set<Person> set1 = new LinkedHashSet<>(people); // сохраняет порядок добавления элементов



        System.out.println(set);
        System.out.println(victor.hashCode());
        victor.setAge(32);
        System.out.println(victor.hashCode());
        System.out.println(set.contains(victor));
        System.out.println(set);
    }


    public static List<String> task(List <String> list){
        if (list == null) return null;

        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static List<Person> task1(List <Person> list){
        if (list == null) return null;

        Set<Person> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

}
