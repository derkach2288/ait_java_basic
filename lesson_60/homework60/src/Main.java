/*
Подготовка к заданию
Создайте класс товар Alcohol с полями:

title - название
strength - крепость алкоголя
price
Создайте лист из 6-7 товаров с разными значениями,
пусть какое-нибудь одно значение дублируется/повторяетсся.

Задание 1 ⭐⭐
Получите LinkedList из топ 3 самых дорогих товаров.

Задание 2 ⭐⭐
Получите самый дешевый товар

Задание 3 ⭐⭐
Создайте Set из исходного листа.

Задание 4 ⭐⭐⭐
Создайте Map из исходного листа, в котором ключами будут -
названия товаров, а значениями будут цены.

Задание 5 ⭐⭐⭐
Создайте Map из исходного листа, в котором ключами будут -
названия товаров, а значениям будет крепость.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Alcohol> alcohols = List.of(
                new Alcohol("whiskey", 45.0, 200.0),
                new Alcohol("beer", 4.5, 15.0),
                new Alcohol("vodka", 40.0, 100.0),
                new Alcohol("wine", 16.0, 150.0),
                new Alcohol("champagne", 20.0, 80.0),
                new Alcohol("beer", 4.5, 15.0)
        );

        // Задание 1 ⭐⭐
        //Получите LinkedList из топ 3 самых дорогих товаров.

        LinkedList<Alcohol> top3Expensive = alcohols.stream()
                .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice()))
                .limit(3)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(top3Expensive);
        
        //Задание 2 ⭐⭐
        //Получите самый дешевый товар

        Optional<Alcohol> theCheapestProduct = alcohols.stream()
                .sorted((a, b) -> Double.compare(a.getPrice(), b.getPrice()))
                .findFirst();
        theCheapestProduct.ifPresent(System.out::println);
// вариант 2:
        List<Alcohol> theCheapestProduct2 = alcohols.stream()
                .sorted((a, b) -> Double.compare(a.getPrice(), b.getPrice()))
                .limit(1).toList();
        System.out.println(theCheapestProduct2);

        // Задание 3 ⭐⭐
        //Создайте Set из исходного листа.

//        Set<Alcohol> setAlcohols = new HashSet<>(alcohols);
        Set<Alcohol> setAlcohols = alcohols.stream()
                .collect(Collectors.toSet());
        System.out.println(setAlcohols);

        // Задание 4 ⭐⭐⭐
        //Создайте Map из исходного листа, в котором ключами будут -
        //названия товаров, а значениями будут цены.

        Map<String, Double> mapAlcoholsPrice = alcohols.stream()
                .distinct()
                .collect(Collectors.toMap(key -> key.getTitle(), value -> value.getPrice()));
        System.out.println(mapAlcoholsPrice);

        // Задание 5 ⭐⭐⭐
        //Создайте Map из исходного листа, в котором ключами будут -
        //названия товаров, а значениям будет крепость.

        Map<String, Double> mapAlcoholsStrength = alcohols.stream()
                .distinct()
                .collect(Collectors.toMap(key -> key.getTitle(), value -> value.getStrength()));
        System.out.println(mapAlcoholsStrength);



    }
}
