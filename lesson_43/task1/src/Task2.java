import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        /*
        Дано список строк. Получить список 4 самых часто встречаемых слов
        1. получить список из листов со словами или обьеденить список в большой текст и разбить на слова(создать один лист слов)
        2. Сдалать мапу, в которой ключ это слово, значение - количество повторений Map<String, Integer>
        3. entryset - сделать сет из ентри
        4. создать трисет с компоратором по значению и переложить туда значения

         */
        List<String> list = new ArrayList<>(List.of("HashMap<K,V> represents a mapping or dictionary",
                "where each element represents a key-value pair", "All keys are unique within the Map object Such " +
                        "collections make it easy to look up an element if you", "know the key which acts as a unique " +
                        "identifier for the object"));

        System.out.println(stringToListWords(list));


        Map<String, Integer> map = new HashMap<>();
        map.put("qwe", 3);
        map.put("rty", 2);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> e :entries) {
//            System.out.println(e.getKey() + " " + e.getValue());
            System.out.println(e);
        }


    }
    public static List<String> stringToListWords(List<String> list) {
        if (list == null) return Collections.emptyList(); // вернется пустая коллекция, равносильно new ArrayList
        List<String> res = new ArrayList<>();
        for (String s: list) {
           res.addAll(new ArrayList<String>(List.of(s.split(" "))));
        }
        return res;
    }


}
