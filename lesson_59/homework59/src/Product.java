public class Product {
    private String name;
    private double rating;
    private double price;
    private String category;

    public Product(String name, double rating, double price, String category) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
