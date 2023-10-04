import java.io.Serializable;

public class Product implements Serializable {
    public static final long serialVersionUID = 1L;
    private String name;
    private int price;
    private int quantity;
    private transient double discount;

    public Product(String name, int price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                '}';
    }
}
