import java.util.*;

public class Hw42_1 {
    /*
    ** Задача 1 **

Дана String с произвольным текстом (без знаков препинания слова разделены пробелом). Необходимо получить map,
* где ключем будет выступать первая буква слова, а значением, список слов начинающихся на эту букву
     */

    public static void main(String[] args) {
        String str = "HashMap<K,V> represents a mapping or dictionary where each element represents a key-value pair " +
                "All keys are unique within the Map object Such collections make it easy to look up an element if you " +
                "know the key which acts as a unique identifier for the object";

        System.out.println(textMap(str));

        List<String> words = stringToListWords(str);
        System.out.println(collectionHandler(words));

        System.out.println(collectionHandler(removeDuplicate(words)));

        List<String> words1 = stringToListWords(textPreHandler(str));
        System.out.println(collectionHandler(removeDuplicate(words1)));








    }

    public static Map<Character, List<String>> textMap(String str) {
        Map<Character, List<String>> res = new HashMap();
        String[] arrStr = str.split(" ");


        for (String word : arrStr) {
            char key = word.charAt(0);
            List<String> list = res.getOrDefault(key, new ArrayList<>());
            list.add(word);
            res.put(key, list);
        }

        return res;
    }
    //-------------------------------------------------------

    public static Set<String> removeDuplicate(Collection<String> collection){
        return new HashSet<>(collection);
    }

    public static List<String> stringToListWords(String text) {
        if (text == null) return Collections.emptyList(); // вернется пустая коллекция, равносильно new ArrayList
        return Arrays.asList(text.split(" "));
    }

    public static String textPreHandler(String text){
        return text.toLowerCase();
    }

    public static Map<Character, List<String>> collectionHandler(Collection<String> collection) {
        Map<Character, List<String>> result = new HashMap<>();
        if (collection == null) return result;

        for (String str : collection) {
            Character key = str.charAt(0);
            result.putIfAbsent(key, new ArrayList<>()); // если ключа нету - создает ключ и ложит значение. Если ключ есть - не заходит в этот метод
//            List<String> list = result.get(key);
//            list.add(str);
            result.get(key).add(str);
        }

        return result;
    }

//SOLID

}
