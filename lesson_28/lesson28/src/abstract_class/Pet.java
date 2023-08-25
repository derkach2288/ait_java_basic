package abstract_class;

import java.util.Objects;

public abstract class Pet {
    // поля класса
    private  String kind; //тип животного
    private int age; // возраст животного
    private double weight; // вес
    private boolean gender; // пол
    // конструктор

    public Pet(String kind, int age, double weight, boolean gender) {
        this.kind = kind;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "kind='" + kind + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (age != pet.age) return false;
        if (Double.compare(pet.weight, weight) != 0) return false;
        if (gender != pet.gender) return false;
        return Objects.equals(kind, pet.kind);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = kind != null ? kind.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (gender ? 1 : 0);
        return result;
    }

    // абстрактные методы класса Pet. Тело метода должно отсутствовать

    public abstract void eat();

    public abstract void go();
    public abstract void voice(); // голос

}
