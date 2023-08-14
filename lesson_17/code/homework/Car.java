package homework;

public class Car {
    String brand;
    String color;
    String licensePlate;
    MyDate registrationDate;
    Engine engine;

    public Car(String brand, String color, String licensePlate, MyDate registrationDate, Engine engine){
        this.brand = brand;
        this.color = color;
        this.licensePlate = licensePlate;
        this.registrationDate = registrationDate;
        this.engine = engine;
    }

    public String toString(){
        return "Brand: " + brand + " color: " + color + " license plate: " + licensePlate + " Date of registration: " +
                registrationDate + engine;
    }

    public String drive(){
        return "the car went";
    }

    public String stop(){
        return "car stopped";
    }

}
