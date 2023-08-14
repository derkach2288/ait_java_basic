package practicum20.hw2;
/*
        Допустим, мы пишем on-line магазин. У нас есть класс Товар ( придумайте, какие поля должны быть).
        Реализуйте класс Корзинка, в которую можно добавить несколько товаров. Реализовать метод добавления
        и добавления товара в корзину. Реализовать метод, который распечатает весь заказ. Реализовать метод,
        который вернет сумму заказа.
 */

public class Main {
    public static void main(String[] args) {


        Product[] array = {
//                new Product(1, "BMW", 34.4),
//                new Product(2, "BMW", 34.4),
//                new Product(3, "BMW", 34.4),
//                new Product(4, "BMW", 34.4)
                new Product("BMW", 35),
                new Product("BMW", 36),
                new Product("BMW", 37),
                new Product("BMW", 38)
        };

        Cart cart = new Cart();
        cart.add(array[0]);
        cart.add(array[1]);
        cart.add(array[2]);

        System.out.println(cart);
        cart.removeById(2);
        System.out.println(cart);

        System.out.println("Quantity:"+cart.size());
        System.out.println("Amount:" + cart.sum());
        // из статического метода мы не можем обратится к нестатическим объектам.


    }
}