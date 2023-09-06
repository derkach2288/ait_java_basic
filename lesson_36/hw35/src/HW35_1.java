import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HW35_1 {
    /*
Задача 1
Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes или No,
где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать
*/
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = List.of(5, 2, 3, 8);


    }

    public List<String> yesOrNo(List<Integer> list1, List<Integer> list2) {
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                res.add("Yes");
            } else res.add("No");
        }
        return res;
    }

    public List<Integer> filteredList(List<Integer> ints, int number) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) <= number) {
                res.add(ints.get(i));
            }
        }
        return res;
    }

    public List<Integer> filteredListIterator(List<Integer> ints, int number){
        Iterator<Integer> res = ints.iterator();
        while (res.hasNext()){
            if (res.next() > number){
                res.remove();
            }
        }
        return ints;
    }

}
