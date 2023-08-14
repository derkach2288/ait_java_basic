package homework19.hw2;

public class Product {
    private String name;
    private String description;
    private double price;
    private int number;

    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.number = 0;
    }

    public String toString(){
        return name + " " + description + " " + price + " " + number;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }
}
