import java.util.ArrayList;
import java.util.List;

public class HW47_2v2 {
    public static void main(String[] args) {

        List<String> list = List.of("DE1234567890123","DE1234567890124","DR1234567890123","DD123j4567", "dww");
        List<Account> accounts = new ArrayList<>();

        for (String str : list){
            try {
                accounts.add(creatAccount(str));
            } catch (AccountCreateException e){
                System.out.print("----" + str + "----");
                System.out.println(e.getErrorList());
            }
        }
        System.out.println(accounts);



    }
    public static Account creatAccount(String iban)
            throws AccountCreateException{

        List<String> errors = new ArrayList<>();
        AccountCreateException exception = new AccountCreateException(errors);

        if (iban == null || !isNumber(iban.substring(2))) errors.add("Error1");
        if (iban.length()<14 || iban.length()>16) errors.add("Error2");
        if (!iban.startsWith("DE")) errors.add("Error3");

        if (!errors.isEmpty()) throw exception;

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
