/*
Задача 2

Представте, вы пишете банковскую программу.
Создайте два checked exception: AccountFormatException и
WrongAccountCountryCodeException. Напишите метод, который
получает строеку с номером вида: DE171271782891.
Если строка короче 14 символов или длиннее 16 - > AccountFormatException.
Если строка не начинается с символов "DE" - WrongAccountCountryCodeException,
если что-то другое (например передан null) -> IllegalArgumentException.
При нормалтном потоке выполнения, метод создает новый объект Accaunt и возвращает его.
Напишите вызов вашего метода с обработкой возможных исключений.
 */

import exception.AccountFormatException;
import exception.MyCheckedException;
import exception.WrongAccountCountryCodeException;

public class HW47_2 {
    public static void main(String[] args) {

        String str = "DE171271782891";

        try {
            Account account = new Account(stringValidation(str));
            System.out.println(account);
        } catch (AccountFormatException e) {
            System.out.println("line length must be between 14 and 16 characters");
        } catch (WrongAccountCountryCodeException e) {
            System.out.println("the line must start with DE");
        } catch (Exception e) {
            throw new IllegalArgumentException("null transmitted");
        }

        //-----------------Variant2--------------------------
        String str2 = "DE171271782891";

        try {
            Account account = new Account(stringValidation(str2));
            System.out.println(account);

        } catch (MyCheckedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new IllegalArgumentException("null transmitted");
        }



    }
    public static String stringValidation(String str) throws MyCheckedException {

        if (str.length()<14 || str.length()>16){
            throw new AccountFormatException("line length must be between 14 and 16 characters");
        } else if (!str.substring(0, 2).equals("DE")){
            throw new WrongAccountCountryCodeException("the line must start with DE");
        }
        return str;
    }

}
