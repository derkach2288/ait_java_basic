import java.util.*;

public class Hw2 {
    public static void main(String[] args) {
        /*
        ** Задача 2 **

Дан список студентов. Каждая запись в этом списке означает, что студен посетил занятие.
Необходимо сформировать Map<Student, Integer>, где ключ студент, а значение - количество занятий
         */

        List<String> students = new ArrayList<>(List.of("Ann", "John", "Jack", "Ann", "Jack", "Ann", "Ann"));
        Map<String, Integer> visit = new HashMap<>();

        for (String s : students) {
            if (visit.containsKey(s)){
                visit.put(s, visit.get(s)+1);
            } else visit.put(s, 1);
        }
        System.out.println(visit);

    }
}
