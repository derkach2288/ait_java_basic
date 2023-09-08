import java.util.List;

public class Homework36 {
        /*
    Написать метод, принимающий не пустой лист строк и возвращающий строку, которая встречается раньше в листе -
    самую короткую или самую длинную. Все строки в листе разной длины
     */

    public String findShortOrLongest(List<String>list){
        String minSize = list.get(0);
        int indexMinElement = 0;
        String maxSize = list.get(0);
        int indexMaxElement = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < maxSize.length()){
                minSize = list.get(i);
                indexMinElement = i;
            } else if (list.get(i).length() > maxSize.length()){
                maxSize = list.get(i);
                indexMaxElement = i;
            }
        }

        if (indexMinElement < indexMaxElement){
            return minSize;
        } else return maxSize;
    }
}
