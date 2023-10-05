import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        calc(10, 10, new DoubleOperation() {
            @Override
            public double apply(double num1, double num2) {
                return num1+num2;
            }
        });

        double sum = calc(10, 10, (num1 , num2) -> {return num1+num2;}   );

        double pow = calc(2, 3, new DoubleOperation() {
            @Override
            public double apply(double num1, double num2) {
                return Math.pow(num1,num2);
            }
        });

        pow = calc(2, 3, (n1, n2) -> Math.pow(n1, n2));

        double min = calc(2, 3, (n1, n2) -> Math.min(n1, n2));
        double res = calc(2, 3, (n1, n2) ->n1*n2/2+n1);

        //-----------------------------------
        List<String> strings = List.of("jack", "JoHn", "ann", "Nick");

        System.out.println(strListHandler(strings, (s) -> {
            return s.toUpperCase();
        }));

        System.out.println(strListHandler(strings, (s) -> {
            return s.toLowerCase();
        }));

        System.out.println(strListHandler(strings, (s) -> {
            return "user " + s.toUpperCase();
        }));

        System.out.println(strListHandler(List.of(1,2,3,4), (i) -> {
            return i*2;
        }));

        System.out.println(strListHandler(List.of(1,2,3,4), (i) -> Integer.bitCount(i)  ));










    }

    public static double calc(double num1, double num2, DoubleOperation operation){

//        return num1+num2;
//        return num1-num2;
//        return num1/num2;

        return operation.apply(num1,num2);
    }

    public static <T> List<T> strListHandler(List<T> list, StringTransformer<T> transformer){
        List<T> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
//            list.set(i, transformer.transform(list.get(i))); // берет строку, что-то делает с помощью интерфейса трансформ и кладет обратно
            res.add(transformer.transform(list.get(i)));

        }
        return res;
    }
    //---------------------



}
