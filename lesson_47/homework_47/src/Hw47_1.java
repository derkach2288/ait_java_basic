/*
Задача 1

Написать метод, который получает в качестве парраметра строку длтнной 16 символов и,
если строка не соответствует этому требованию выбрасывает IllegalArgumentException
 */
public class Hw47_1 {
    public static void main(String[] args) {
        checkingStringLength("qwertyuiopasdfgh");
        checkingStringLength("qwertyuiopa");

    }
    public static void checkingStringLength(String str){
        if (str.length()!=16){
            throw new IllegalArgumentException("line length must be 16 characters");
        }
    }
}
