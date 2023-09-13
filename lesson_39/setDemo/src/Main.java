import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); // set хранит только уникальные элементы
        set1.add("str1");
        set1.add("str2");
        set1.add("str2");
        set1.add("str3");
        set1.add("str4");
        set1.add("str4");
        System.out.println(set1);

        System.out.println("-----------------");
        for (String s : set1) {
            System.out.println(s);
        }

        // любая колекция джава имеет конструктор, в который можем передать set

        System.out.println("======");
        List<String> list = new ArrayList<>(set1);
        System.out.println(list);

        System.out.println(set1.contains("str4")); // говорит, есть элемент или нет
        System.out.println(set1.contains("str8")); // говорит, есть элемент или нет


    }
}
