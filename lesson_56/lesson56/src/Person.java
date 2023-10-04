import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID = 1L; // версия для загрузки - выгрузки, если добавляются поля
    private String name;
    private int age;
    private int temp;
    private int temp1;

//    private Car car;
    private transient Car car; // поле не выгружать

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
