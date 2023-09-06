import java.util.Arrays;
import java.util.List;

public class Hw36 {
    /*
    Написать метод, принимающий не пустой лист строк и возвращающий строку, которая встречается раньше в листе -
    самую короткую или самую длинную. Все строки в листе разной длины
     */

    public static void main(String[] args) {
        List<String> str = Arrays.asList("qw", "qwe", "q","qwer", "qwert");

//        System.out.println(strMinOrMax(str));


    }

    public  String strMinOrMax(List<String> strings){
        String min = strings.get(0);
        String max = strings.get(0);
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > max.length() ){
                max = strings.get(i);
            }
            if (strings.get(i).length() < min.length() ){
                min = strings.get(i);
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals(min)){
                return min;
            } else if (strings.get(i).equals(max)){
                return max;
            }
        }
        return null;
    }
}
