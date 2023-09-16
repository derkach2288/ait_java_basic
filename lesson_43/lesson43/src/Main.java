import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(-1);
        set.add(-131);
        set.add(65);
        set.add(20);
        set.add(4);

//        set.addAll() // добавляет колекцию в существующий set
//        set.retainAll() // оставляет в сете только те элементы, которые есть в передаваемой колекции
//        set.descendingIterator() // итератор, который работает в обратном порядке
//        set.descendingSet() // вернет set отсортированный в обратном порядке
//        set.first(); // вернет первый эл
//        set.last(); // вернет последний



        System.out.println(set);

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "1");
        map.put(-10, "-10");
        map.put(5, "5");

    }
}
