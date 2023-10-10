import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "mango", "lime", "lime");

        // собираем в лист
        List<String> fruitsCapitals = fruits
                .stream()
                .map(s -> s.toUpperCase())
//                .toList();
                .collect(Collectors.toList());

        // собираем в множества
        Set<String> fruitsSet = fruits
                .stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println(fruitsSet);

        // собрать в конкретную структуру
        LinkedList<String> fruitsLinkedList = fruits
                .stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toCollection(LinkedList::new));

        // counting
        Long count = fruits
                .stream()
                .map(s -> s.toUpperCase())
//                .count();
                .collect(Collectors.counting());

        // собираем в Map
        // сохраним слова как ключи, а длину в кач-ве значений
        Map<String, Integer> fruitsMap = fruits.stream()
                .map(s -> s.toUpperCase())
                .distinct()
                // s -> s это Function.identity()
                .collect(Collectors.toMap(Function.identity(), fruit -> fruit.length()));
        System.out.println(fruitsMap);

    }
}
