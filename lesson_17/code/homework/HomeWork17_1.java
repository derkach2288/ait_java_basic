package homework;
/*
        #1 Создать класс Car со следующими полями (String brand, String color, String licensePlate, MyDate
        registrationDate, Engine engine}
        Оьратите внимание, поля registrationDate и engine - это тоже объект. Engine - содержмт информация о мощности
        двигателя и о типе (бензин, дизель, электро).

        Реализуйте метод toString в каждом классе.
        Реализуйте метод конструктор в каждом классе.
        Создайте два объекта автомобтля.

        #2
        В классе Engine добавте методы start и stop. Кадлый из них пусть выводит строку "Engine is started"
        "Engine is stoped".В классе Car добавте методы drive и stop. Первый должке заводить двигатель и писать,
        что такая то машина поехала. Второй, соответственно глушить двигатель и останавливать машину.
 */
public class HomeWork17_1 {
    public static void main(String[] args) {
        Engine engine1 = new Engine(1.6, "petrol");
        MyDate registrationDate1 = new MyDate(12, 8, 2008);
        Car car1 = new Car("BMW", "white", "de1234cl", registrationDate1, engine1);
        System.out.println(car1);
        System.out.println(engine1.start());
        System.out.println(car1.drive());


        Engine engine2 = new Engine(2.4, "diesel");
        Car car2 = new Car("Audi", "black", "PL 3243 cl",
                new MyDate(6, 12, 2020), engine2);
        System.out.println(car2.toString());
        System.out.println(engine2.start());
        System.out.println(car2.drive());

    }
}
