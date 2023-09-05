package computer.dao.model;

public class Computer implements Comparable<Computer>{
    private int id;
    private int year;
    private String brand;
    private String type;

    public Computer(int id, int year, String brand, String type) {
        this.id = id;
        this.year = year;
        this.brand = brand;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", year=" + year +
                ", brand='" + brand +
                ", type='" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        return id == computer.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Computer o) {
        int res = this.brand.compareTo(o.brand);
        return res != 0 ? res : this.id - o.id;
    }
}
