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

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Chair Aemes", 9, 200, "furniture"),
                new Product("Iphone XR", 7, 1000, "electronics"),
                new Product("Gibson Les Paul", 6, 2000, "music"),
                new Product("Iron", 9, 120, "electronics"),
                new Product("Washing machine", 2, 800, "electronics"),
                new Product("Vinyl Beatles", 5, 40, "music"),
                new Product("Jeans", 4, 70, "clothes")
        );

        //Задание 1
        //Получите лист товаров, которые стоят дороже 200 евро.

        List<Product> expensiveProducts = products
                .stream()
                .filter(product -> product.getPrice()>200)
                .toList();
        System.out.println(expensiveProducts);

        // сколько товаров, которые стоят дороже 200 евро
        long res = products
                .stream()
                .filter(product -> product.getPrice()>200)
                .count();
        System.out.println(res);

        //Задание 2
        //Получите лист товаров, отсортированных по рейтингу

        List<Product> sortedByRating = products
                .stream()
                .sorted((a,b) -> Double.compare(a.getRating(), b.getRating()))
                .toList();
        System.out.println(sortedByRating);

        //top 5
        List<Product> top5 = products
                .stream()
                .sorted((a,b) -> Double.compare(a.getRating(), b.getRating()))
                .limit(5)
                .toList();
        System.out.println(top5);


        //Задание 3
        //Проверьте есть ли в листе товаров, товар с названием: "Iphone XR"

        boolean iphoneXr = products
                .stream()
                .anyMatch(product -> product.getName().equals("Iphone XR"));
        System.out.println(iphoneXr);

        //Задание 4 map
        //Создайте новый лист товаров на основании старого, пусть в новом листе рейтинг будет увеличен на 1.
        //Товары в исходном листе не должны измениться.

        List<Product> newProducts = products
                .stream()
                .map(p -> {
                    p.setRating(p.getRating() + 1);
                    return p;
                }).toList();
        System.out.println(newProducts);

        List<Product> newProducts1 = products
                .stream()
                .peek(p -> p.setRating(p.getRating() + 1)) // как forEach, но не терминальный
                .toList();
        System.out.println(newProducts1);

        List<Product> brandNewProduct = products
                .stream()
                .map(p -> new Product(p.getName(), p.getRating()+1, p.getPrice(), p.getCategory()))
                .toList();
        System.out.println(brandNewProduct);

        //Задание 5 forEach
        //Измените цену товаров в исходном листе товаров: увеличьте ее на 20 евро. Товары в исходном листе должны измениться.

        products.forEach(s -> s.setPrice(s.getPrice()+20));
        System.out.println(products);

        // Задание 6 reduce
        //Посчитайте общую стоимость всех товаров в листе.

        Double totalPrice = products
                .stream()
                .map(Product::getPrice)
//                .reduce(0.0, (a, b) -> a + b);
                .reduce(0.0, Double::sum);
        System.out.println(totalPrice);


    }
}
