import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of(
                "orange", "apple", "banana", "mango", "kiwi"
                , "fig"
        );

        // как получить первый элемент, удовлетворяющий описанию
        // findFirst

        Optional<String> kiwiOptional = fruits.stream().filter(s -> s.length() < 5).findFirst();
        String fruit = kiwiOptional.get();
        System.out.println(fruit);

        Optional<String> shortesOptional = fruits.stream().filter(s -> s.length() < 4).findFirst();
//        shortesOptional.get(); // вызовет ошибку
        System.out.println(shortesOptional.isPresent()); // есть ли в наличии?

//        if (shortesOptional.isPresent()){
//            System.out.println(shortesOptional.get());
//        }
//        shortesOptional.ifPresent(s -> System.out.println(s));
        shortesOptional.ifPresent(System.out::println); // если есть - заходим

        // добавить значение по умолчанию, в случае если в Optional лежит null
        String result = shortesOptional.orElseGet(()->"passion fruit");
        System.out.println(result);


        // если есть значение - получим. Если нет - бросим ошибку
        String res2 = shortesOptional.orElseThrow(IllegalAccessError::new);
        System.out.println(res2);



    }
}
