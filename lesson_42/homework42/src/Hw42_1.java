import java.util.*;

public class Hw42_1 {

    public static void main(String[] args) {
        String str = "HashMap<K,V> represents a mapping or dictionary where each element represents a key-value pair " +
                "All keys are unique within the Map object Such collections make it easy to look up an element if you " +
                "know the key which acts as a unique identifier for the object";

        System.out.println(textMap(str));


    }

    public static Map<Character, List<String>> textMap(String str){
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
}
