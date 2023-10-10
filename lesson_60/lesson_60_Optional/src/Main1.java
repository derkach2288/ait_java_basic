import java.util.*;

//  Создайте лист из продуктов - 3-5 продуктов.
//    Пусть пусть в продукте будут поля название и цена
//  Создайте метод getProductByTitle -
//    пусть метод принимает название продукта и список продуктов
//    и возвращает продукт с указанным названием (первый попавшийся)
//    а если этого продукта нет
//    - продукт с названием "doll" и ценой 15
public class Main1 {
    public static void main(String[] args) {

        List<Product> products = List.of(
               new Product("orange", 3.0),
               new Product("apple", 3.40),
               new Product("banana", 4.40)
        );

        System.out.println(getProductByTitle("orange", products));
        System.out.println(getProductByTitle("ora", products));
    }
    public static Product getProductByTitle(String productStr, List<Product> listProduct){

        Optional<Product> res = listProduct
                .stream()
                .filter(a -> a.getName().equals(productStr))
                .findFirst();


        return res.orElseGet(()-> new Product("doll", 15.0));

    }

    public static Product getProductByTitle1(String title, List<Product> products){
        Optional<Product> res1 = products
                .stream()
                .filter(product -> product.getName().equals(title))
                .findFirst();


        return res1.orElseGet(()-> new Product("doll", 15.0));

    }
}
