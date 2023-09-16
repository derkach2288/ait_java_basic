import java.util.*;

public class Hw43 {
    public static void main(String[] args) {

        /*
        Дано список строк. Получить список 4 самых часто встречаемых слов
        1. получить список из листов со словами или обьеденить список в большой текст и разбить на слова(создать один лист слов)
        2. Сдалать мапу, в которой ключ это слово, значение - количество повторений Map<String, Integer>
        3. entryset - сделать сет из ентри
        4. создать трисет с компоратором по значению и переложить туда значения

         */
        List<String> list = new ArrayList<>(List.of("HashMap represents a mapping or dictionary",
                "where each element represents a key-value pair", "All keys are unique within the Map object Such " +
                        "collections make it easy to look up an element if you", "know the key which acts as a unique " +
                        "identifier for the object"));

        System.out.println(listToListWords(list));

        Map<String, Integer> map = listHandler(listToListWords(list));
        System.out.println(map);
        numberOfFrequentWords(map, 4);




//        Map<String, Integer> map = new HashMap<>();
//        map.put("qwe", 3);
//        map.put("rty", 2);
//
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        for (Map.Entry<String, Integer> e :entries) {
////            System.out.println(e.getKey() + " " + e.getValue());
//            System.out.println(e);
//        }


    }

    public static List<String> listToListWords(List<String> list) {
        if (list == null) return Collections.emptyList(); // вернется пустая коллекция, равносильно new ArrayList
        List<String> res = new ArrayList<>();
        for (String s : list) {
            res.addAll(List.of(s.split(" ")));
        }
        return res;
    }

    public static Map<String, Integer> listHandler(List<String> list) {
        Map<String, Integer> res = new HashMap<>();
        for (String s : list) {
            res.put(s, res.getOrDefault(s, 0) + 1);
        }
        return res;
    }

    public static void numberOfFrequentWords(Map<String, Integer> map, int quantity){
        List<Map.Entry<String, Integer>> listSort = new ArrayList(map.entrySet());
        Collections.sort(listSort, (Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) -> {
            return e2.getValue() - (e1.getValue());

        });
        System.out.println(listSort.subList(0, quantity));

    }

}
