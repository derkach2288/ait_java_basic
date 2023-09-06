import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {
    // forEach method
    // void forEach

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");

        for (String number : numbers) {
            System.out.println(number);
        }

        System.out.println();
        numbers.forEach(number -> System.out.println(number));

    }
}
