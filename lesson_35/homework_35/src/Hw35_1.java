import java.util.ArrayList;

public class Hw35_1 {
    /*
    Задача 1
Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes или No,
где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать
     */
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num2.add(5);
        num2.add(2);
        num2.add(3);
        num2.add(8);
        System.out.println(matchCheck(num1, num2));


    }
    public static ArrayList<String> matchCheck(ArrayList<Integer> ints1, ArrayList<Integer> ints2){
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < ints1.size(); i++) {
            if (ints1.get(i) == ints2.get(i)){
                res.add(i, "Yes");
            } else res.add(i, "No");
        }
        return res;
    }
}
