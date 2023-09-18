import java.util.*;

/*
Дано список строк. Получить список 4 самых часто встречаемых слов
1. получить лист из слов
2. получить Map<String, Integer> - ключ - слово, значение - кол-во повторений

Map<String, Integer> -> Map<Integer, String>
 */
public class HW43_1 {
    public static void main(String[] args) {
        List<String> list= List.of(
                "11 22 33 11 22 33 22 22 22",
                "11 333 222",
                "44 22 11 44"
        );

        System.out.println(textToWords(list));

        List<String> words = textToWords(list);
        Map<String, Integer> wordCountMap = wordCount(words);
        System.out.println(wordCountMap);

        System.out.println(getFreqWords(wordCountMap, 4));

        System.out.println("----------");
        System.out.println(toMapCountListWords(wordCountMap));


    }

    public static List<String> textToWords(Collection<String> collection){
        List<String> result = new ArrayList<>();
        if (collection == null) return result;
        for (String str : collection){
            result.addAll(stringToWordList(str));
        }
        return result;
    }

    private static List<String> stringToWordList(String str) {
        return Arrays.asList(str.split(" "));
    }

    public static Map<String, Integer> wordCount(Collection<String> words){
        Map<String, Integer> result = new HashMap<>();
        if (words == null) return result;

        for (String word : words){
            Integer count = result.getOrDefault(word, 0);
            result.put(word, ++count);
        }

        return result;
    }

    public static List<String> getFreqWords(Map<String, Integer> map, int n){
        List<String> result = new ArrayList<>();
        if(map == null) return result;

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        Comparator<Map.Entry<String, Integer>> compareByValueAndKey = (e1, e2) ->{
            int compareValue = Integer.compare(e2.getValue(), e1.getValue());
            if (compareValue!=0){
                return compareValue;
            } else {
                return e1.getKey().compareTo(e2.getKey());
            }
        };

        TreeSet<Map.Entry<String, Integer>> treeSet = new TreeSet<>(compareByValueAndKey);
        treeSet.addAll(entries);

        for (Map.Entry<String, Integer> entry : treeSet){
            if (result.size()>=n) return result;
            result.add(entry.getKey());
        }



        return result;
    }

    public static Map<Integer, List<String>> toMapCountListWords(Map<String, Integer> map){
        TreeMap<Integer, List<String>> result = new TreeMap<>();
        if (map == null) return result;

        for (Map.Entry<String, Integer> e : map.entrySet()){
            Integer key = e.getValue();
            List<String> list = result.getOrDefault(key, new ArrayList<>());
            list.add(e.getKey());
            result.put(key, list);
        }

        return result;
    }

//    public static void getFreqWords2(TreeMap<Integer, List<String>> map, int n){
//        int count = 0;
//        for (Integer key : map.descendingKeySet()){
//            List<String>
//        }
//    }

}
