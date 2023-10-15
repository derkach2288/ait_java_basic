import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        prnt("apple");
        prnt("apple", "orange");
        prnt("apple", "orange", "pear");

        System.out.println(sumArguments(1, 2, 3));

        List<String> list = listStr("apple", "orange", "pear");
        System.out.println(list);

        System.out.println(findStr(4, "apple", "orange", "pear"));
    }

    private static void prnt(String ...args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    private static int sumArguments(int ...args){
        int sum =0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
    private static List<String> listStr(String ...args){
//        List<String> listStr = new ArrayList<>();
//        for (int i = 0; i < args.length; i++) {
//            listStr.add(args[i]);
//        }
//        return listStr;
        return  new ArrayList<>( Arrays.asList(args));

    }

    public static String findStr(int len, String...arg){
        for (int i = 0; i < arg.length; i++) {
            if (arg[i].length() == len){
                return arg[i];
            }
        }
        return null;
    }

    public static Optional<String> findStr2(int len, String...arg){
        for (int i = 0; i < arg.length; i++) {
            if (arg[i].length() == len){
                return Optional.of(arg[i]);
            }
        }
//        return Optional.ofNullable(null);
        return Optional.empty();
    }





}
