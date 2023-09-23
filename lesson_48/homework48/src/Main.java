/*
Дан список строк вида:

DE1613321892788;Jack Johnson
DE1613324427567;Ivan Ivanov
DE1612324427565;Ann Smith
т.е. список банковских счетов с именем владельца. К сожалению, список пришел некорректный:
у некоторых счетов отсутствуют имена владельцев, некоторые счета не начинаются на DE или короче 15 символов.
Ваш метод должен сформировать список объектов типа Account (String iban, Person owner),
ЕСЛИ ВСЕ ЗАПИСИ корректны, либо выкинуть exception. Причем в последнем случае, должна быть сохранена информация о том,
какие строки и какие проблемы содержали.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> incomingData = new ArrayList<>(List.of("DE1613321892788;Jack Johnson", "DE1613324427567;Ivan Ivanov", "DE1612324427565;Ann Smith"));
        List<String> incomingData1 = new ArrayList<>(List.of("D89278r8;Jack Johnson", "DE1613324427567; Ivanov", "DE1612324427565;Ann Smith"));
        List<Account> accounts = new ArrayList<>();


        for (String str : incomingData1){
            try {
                accounts.add(creatAccount(str));
            } catch (AccountCreateException e){
                System.out.print("----" + str + "---");
                System.out.println(e.getErrorList());
            }

        }


        System.out.println(accounts);


//        for (String str : incomingData){
//            String[] owner = str.split(";");
//            String[] person = owner[1].split(" ");
//            accounts.add(new Account(owner[0], new Person(person[0], person[1])));
//        }


    }

    public static Account creatAccount(String str) throws AccountCreateException{

        List<String> errors = new ArrayList<>();
        AccountCreateException exception = new AccountCreateException(errors);

        if (str == null || str.isEmpty() || !str.contains(";") || str.indexOf(" ") != str.lastIndexOf(" ") || str.indexOf(";") != str.lastIndexOf(";")) {
//            errors.add("NULL or incorrect data");
            throw new RuntimeException("NULL or incorrect data");
        }
        if (str.indexOf(";")>= str.length()-1) {
//            errors.add("missing name");
            throw new RuntimeException("missing name");
        }

        String[] owner = str.split(";");
        String iban = owner[0];

        if (iban.length()<14 || iban.length()>16) errors.add("The iban should be [14, 16] character len");
        if (!iban.startsWith("DE")) errors.add("The country code should be 'DE'");
        if (iban.length()>=2){
            if (!isNumber(iban.substring(2))) errors.add("iban should only contain numbers after DE");
        }
        if (!owner[1].contains(" ")) {
//            errors.add("missing firstname or lastname");
            throw new RuntimeException("missing firstname or lastname");
        }

        if (owner[1].indexOf(" ")>=owner[1].length()-1) throw new RuntimeException("missing lastname");

        String[] person = owner[1].split(" ");
        String firstName = person[0];
        String lastName = person[1];

        if (firstName.isEmpty()) errors.add("missing firstname");

        if (!errors.isEmpty()) throw exception;




        Account account = new Account(iban, new Person(firstName, lastName));
        return account;
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
