package homework19.hw2;

/*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров. Реализовать метод добавления
        и добавления товара в корзину. Реализовать метод, который распечатает весь заказ. Реализовать метод,
        который вернет сумму заказа.
 */
public class HW2 {
    public static void main(String[] args) {

        Product product1 = new Product("Auto", "BMW", 70000);
        Product product2 = new Product("Auto", "AUDI", 80000);
        Product product3 = new Product("Auto", "VW", 50000);


        product2.setNumber(2);
        product1.setNumber(1);


        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println("------------------");

        Cart cart1 = new Cart();
        cart1.add(product1);
        cart1.add(product2);
        System.out.println(cart1);

    }
}