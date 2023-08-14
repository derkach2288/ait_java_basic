package homeWork;

public class HomeWork12_1 {
    public static void main(String[] args) {
        /*
        Задача 1
        Написать метод, принимающий строку и возвращающий второй и третий символы строки заглавными буквами.
        Пример : Hello-> EL
        В методе main() вывести получившийся результат на экран
         */

        String str = "Hello";
        System.out.print(str + "-> ");
        System.out.println(stringCharAt(str));

    }
    static String stringCharAt(String st){
        return st.substring(1, 3).toUpperCase();
    }
}
