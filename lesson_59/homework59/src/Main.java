import java.util.ArrayList;
import java.util.List;

/*
Подготовка к заданию
Создайте класс товар Product с полями:

название
рейтинг
цена
категория
Создайте лист из 10 товаров с разными значениями

Задание 1
Получите лист товаров, которые стоят дороже 200 евро.

Задание 2
Получите лист товаров, отсортированных по рейтингу

Задание 3
Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"

Задание 4 map
Создайте новый лист товаров на основании старого, пусть в новом листе рейтинг будет увеличен на 1. Товары в исходном листе не должны измениться.

Задание 5 forEach
Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро. Товары в исходном листе должны измениться.

Задание 6 reduce
Посчитайте общую стоимость всех товаров в листе.
 */
public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("BMW", 4.5, 35_000, "sedan"),
                new Product("Audi", 4.6, 36_000, "hatchback"),
                new Product("VW", 3.6, 26_000, "coupe"),
                new Product("Porsche", 4.9, 120_000, "crossover"),
                new Product("Porsche", 4.6, 110_000, "hatchback"),
                new Product("Audi", 4.0, 80_000, "crossover"),
                new Product("BMW", 4.2, 85_000, "hatchback"),
                new Product("VW", 4.1, 60_000, "pickup"),
                new Product("Tesla", 4.9, 115_000, "hatchback"),
                new Product("Porsche", 4.8, 115_000, "coupe")
        ));

        System.out.println(products);

        //Задание 1
        //Получите лист товаров, которые стоят дороже 100_000 евро.
        List<Product> list1 = products
                .stream()
                .filter(product -> product.getPrice() > 100_000.0)
                .toList();
        System.out.println(list1);

        //Задание 2
        //Получите лист товаров, отсортированных по рейтингу
        List<Product> list2 = products
                .stream()
                .sorted((a, b) -> Double.compare(a.getRating(), b.getRating()))
                .toList();
        System.out.println(list2);

        //Задание 3
        //Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"
        boolean iphoneXr = products
                .stream()
                .anyMatch(product -> product.getName().equals("Iphone XR"));
        System.out.println(iphoneXr);
        boolean bmw = products
                .stream()
                .anyMatch(product -> product.getName().equals("BMW"));
        System.out.println(bmw);

        //Задание 4 map
        //Создайте новый лист товаров на основании старого, пусть в новом листе рейтинг будет увеличен на 1.
        // Товары в исходном листе не должны измениться.
        List<Product> list4 = products
                .stream()
                .map(product -> new Product(product.getName(), product.getRating() + 1, product.getPrice(), product.getCategory()))
                .toList();
        System.out.println(list4);

        //Задание 5 forEach
        //Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро.
        // Товары в исходном листе должны измениться.
        products.forEach(product -> product.setPrice(product.getPrice()+20));
        System.out.println(products);


        //Задание 6 reduce
        //Посчитайте общую стоимость всех товаров в листе.
        Double sumPrice = products.stream()
                .map(product -> product.getPrice())
                .reduce(0.0, (a, b) -> a + b);
        System.out.println(sumPrice);
    }
}
