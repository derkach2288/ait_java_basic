package practicum20.hw2;

public class Product {
    private static int counter = 0;
    private int id;
    private String title;
    private double price;

//    public Product(int id, String title, double price){
    public Product(String title, double price){
        counter++;
//        this.id = id;
        this.id = counter;
        this.title = title;
        this.price = price;
    }

    public String toString(){
        return id + ". " + title + " " + price;
    }

    public double getPrice(){
        return price;
    }

    public int getId(){
        return id;
    }

}
