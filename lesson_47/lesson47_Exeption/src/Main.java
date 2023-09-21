import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        try {
//
//        } catch (){
//
//        } finally {
//
//        }
//
//        //throw
//        //throws


//        int value = readInt();
//        System.out.println(value);
//        //------------------------------------------
//
//        value = 0;
//        try {
//            value = readInt2();
//        } catch (InputMismatchException | NullPointerException e){
//            System.out.println("not correct");
//        } catch (Exception e){
//            System.out.println("EXCEPTION");
//        }
//
        //--------------------------------

        try {
            System.out.println("div= " + div(18, 0));

        } catch (MyCheckedException e){
            System.out.println("деление на ноль");
        }
        //---------------
//        System.out.println("UnChecked");
//        System.out.println("div= " + div2(18, 0));

    }

    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int: ");
//        int value;

        try { // нормальный код выполнения программы
            int value = scanner.nextInt();
            System.out.println("The inputed value: " + value);
            return value;
        } catch (Exception e){ // обработка исключительного случая
            throw new ReadIntException();
        } finally { // выполняется в оюбом случае
            System.out.println("____finally_______");
        }

    }


    public static int readInt2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input int: ");

        int value = scanner.nextInt();
        value = 10/value;
        System.out.println("The inputed value: " + value);
        return value;
    }

    public static int div(int a, int b) throws MyCheckedException { // обязан сделать обработчик
        if (b == 0) throw new MyCheckedException("Not correct value!!!");
        return a/b;
    }



    public static int div2(int a, int b) {
        if (b == 0) throw new MyUnCheckedException("Not correct value"); // обработчик можно не делать
        return a/b;
    }


}
