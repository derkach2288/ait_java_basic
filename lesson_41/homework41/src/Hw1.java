import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hw1 {
    public static void main(String[] args) {
        /*
        ** Задача 1 **

Дана Map<String, String>, если в ней есть ключ "a" и "b", то нужно создать новый ключ ‘ab’
 с суммой значений от ключей a и b.
 Примеры: mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
 mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}
         */

        Map<String, String> mapAB = new HashMap<>();

        mapAB.put("a", "Hi");
        mapAB.put("b", "There");
        System.out.println(mapAB);

        sumMap1(mapAB);
        sumMap2(mapAB);
        sumMap3(mapAB);


    }
    public static void sumMap1(Map<String, String> mapAB){
        String keyAB = "";
        String valueAB = "";
        for (String key : mapAB.keySet()) {
            keyAB = keyAB + key;
            valueAB = valueAB + mapAB.get(key);
        }
        mapAB.put(keyAB, valueAB);
        System.out.println(mapAB);
    }

    public static void sumMap2(Map<String, String> mapAB) {
        String keyAB = "";
        String valueAB = "";
        Set<String> setKeyAB = mapAB.keySet();
        for (String key : setKeyAB) {
            keyAB += key;
            valueAB += mapAB.get(key);
        }
        mapAB.put(keyAB, valueAB);
        System.out.println(mapAB);
    }

    public static void sumMap3(Map<String, String> mapAB) {
        String keyAB = "";
        String valueAB = "";
        Set<Map.Entry<String, String>> entriesMapAB = mapAB.entrySet();
        for (Map.Entry<String, String> entry : entriesMapAB) {
            keyAB += entry.getKey();
            valueAB += entry.getValue();
        }
        mapAB.put(keyAB, valueAB);
        System.out.println(mapAB);
    }


    public static void mapAB(Map<String, String> map, String key1, String key2) {

        if (map!=null && map.containsKey(key1) && map.containsKey(key2)) {
            map.put(key1+key2, map.get(key1) + map.get(key2));
        }

    }

    public static void mapAB2(Map<String, String> map, String key1, String key2) {
        if (map==null) return;
        String value1= map.get(key1);
        String value2= map.get(key2);
        if(value1!=null&&value2!=null){
            map.put(key1+key2, value1 + value2);
        }
    }


}
