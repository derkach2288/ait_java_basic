package homeWork;

public class HomeWork12_3 {
    public static void main(String[] args) {
        /*
        Задача 3
        Написать метод, принимающий массив целых чисел и число и находящий индекс
        этого числа(элемента) в массиве. Если такой элемент есть, возвращается его
        индекс, если нет, метод возвращает -1.
        В методе main() вывести получившийся результат на экран
         */

        int[] array = {34, 23, 100, 54, 6, 9};
        System.out.println(checkIndexAndNumber(array, 100, 2));

    }
    static int checkIndexAndNumber(int[] ints, int x, int i){
        if (ints[i] == x){
            return i;
        } else return -1;
    }

}
