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

public class HW47_2 {
    public static void main(String[] args) {

        try {
            Account account = creatAccount("DE171271782891");
            System.out.println(account);
        } catch (IllegalArgumentException e){
            e.getCause();
            System.err.println("Null");
        } catch (AccountFormatException e){
            System.err.println("The iban should be [14, 16] character len");
        } catch (WrongAccountCountryCodeException e){
            System.out.println("The country code should be 'DE");
        }

    }
    public static Account creatAccount(String iban)
            throws AccountFormatException, WrongAccountCountryCodeException{
        if (iban == null || !isNumber(iban.substring(2))) throw new IllegalArgumentException();
        if (iban.length()<14 || iban.length()>16) throw new AccountFormatException();
        if (!iban.startsWith("DE")) throw new WrongAccountCountryCodeException();

        return new Account(iban);
    }

    private static boolean isNumber(String str){
        for (char ch : str.toCharArray()){
            if (!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }
}
