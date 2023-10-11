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


import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Alcohol> alcohols = List.of(
                new Alcohol("Radler", 2.5, 3.5),
                new Alcohol("Cognac", 40, 40),
                new Alcohol("Black label", 40, 15),
                new Alcohol("Red wine", 12.5, 10),
                new Alcohol("Martini bianco", 12, 12),
                new Alcohol("Vodka", 40, 30),
                new Alcohol("Vodka", 40, 30)
        );

        // Задание 1 ⭐⭐
        //Получите LinkedList из топ 3 самых дорогих товаров.

        LinkedList<Alcohol> topThree = alcohols.stream()
                .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice()))
//                .sorted() // с естественным порядком сортировки, Comparable<Alcohol>
                .distinct()
                .limit(3)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(topThree);

        // Задание 2 ⭐⭐
        //Получите самый дешевый товар


        // ver 2
        Alcohol cheapest = alcohols.stream()
                .sorted()
                .findFirst()
//                .orElseThrow(NoSuchElementException::new);
//                .orElseGet(()-> new Alcohol("Radler", 2.5, 3.5));
//                .orElse(new Alcohol("Radler", 2.5, 3.5));
//                .get()
                .orElseGet(()-> null);

        System.out.println(cheapest);
//        if (cheapest!=null){
//            cheapest.getTitle();
//        }

        // ver2

        Alcohol cheapest2 = alcohols.stream()
                .min((a, b ) -> Double.compare(a.getPrice(), b.getPrice()))
                .orElseGet(()-> null);
        System.out.println(cheapest2);


        // Задание 3 ⭐⭐
        //Создайте Set из исходного листа.

        alcohols.stream()
                .collect(Collectors.toSet());

        //Задание 4 ⭐⭐⭐
        //Создайте Map из исходного листа, в котором ключами будут -
        //названия товаров, а значениями будут цены.

        Map<String, Double> pricesByName = alcohols.stream()
                .distinct()
                .collect(Collectors.toMap(Alcohol::getTitle, Alcohol::getPrice));
        System.out.println(pricesByName);


        // Задание 5 ⭐⭐⭐
        //Создайте Map из исходного листа, в котором ключами будут -
        //названия товаров, а значениям будет крепость.

        Map<String, Double> strengthByName = alcohols.stream()
                .collect(Collectors.toMap(Alcohol::getTitle, Alcohol::getStrength, (a,b)-> a));
        System.out.println(strengthByName);

    }
}
