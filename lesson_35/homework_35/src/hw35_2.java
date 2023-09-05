import java.util.ArrayList;
import java.util.Iterator;

public class hw35_2 {
    /*
    Написать метод, принимающий лист целых чисел и целое число и возвращающий
    лист без элементов больших этого числа.
Протестировать.
     */
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        System.out.println(filteredList(num1, 2));
        System.out.println(filteredListIterator(num1, 3));

    }

    public static ArrayList<Integer> filteredList(ArrayList<Integer> ints, int number) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) <= number) {
                res.add(i, ints.get(i));
            }
        }
        return res;
    }

    public static ArrayList<Integer> filteredListIterator(ArrayList<Integer> ints, int number){
        Iterator<Integer> res = ints.iterator();
        while (res.hasNext()){
            if (res.next() > number){
                res.remove();
            }
        }
        return ints;
    }
}
