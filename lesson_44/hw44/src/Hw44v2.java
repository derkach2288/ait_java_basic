import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Hw44v2 {
    public static void main(String[] args) {
        /*
** Задача 1 **

Дан List<Integer>. Написать метод, который определит, есть лм в этом списке такая пара чисел,
* которые в сумме дабт заданное число N.
 */

        List<Integer> list = new ArrayList<>(List.of(-1, 6, -5, 7, 4, 2, -1, 0));
        System.out.println(isPairEqualsNumber(list, 7));
        System.out.println(isPairEqualsNumber2(list, 4));
        System.out.println(isPairEqualsNumber3(list, -6));
        System.out.println(isPairEqualsNumber4(list, -6));

    }

    public static boolean isPairEqualsNumber(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == num) {
                    return true;
                }
            }
        }


        return false;
    }


    // не рабочий метод, использует одно и то же число 2 раза
    public static boolean isPairEqualsNumber2(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;

        for (int i = 0; i < list.size() - 1; i++) {
            Integer pair = num - list.get(i);
            if (list.contains(pair)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPairEqualsNumber3(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;

        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list) {
            if (set.contains(i)) {
                return true;
            } else {
                set.add(num - i);
            }
        }
        return false;
    }

    public static boolean isPairEqualsNumber4(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;

        list.sort((a, b) -> a - b);
//        Collections.sort(list);
        int lIndex = 0;
        int rIndex = list.size() - 1;

        while (lIndex < rIndex) {
            int sum = list.get(lIndex) + list.get(rIndex);
            if (sum == num) {
                return true;
            }
            if (sum<num){
                lIndex++;
            } else {
                rIndex--;
            }

        }

        return false;
    }


}
