package ait.employee.model;

public abstract class Employee { // abstract это клас, объекты которого нельзя создавать. Нельзя
    protected final int id; // final инициализируется один раз при создании и больше не меняется.
    protected String firstName; // protected поля видят все насследники
    protected String lastName;
    protected double hours;

    public Employee(int id, String firstName, String lastName, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHours() {
        return hours;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

//    public double calcSalary(){ // обходной метод, чтоб иметь доступ к дочернему методу
//        return 0;
//    }

    public abstract double calcSalary(); // абстрактный метод, чтоб иметь доступ к методу дочернего класса



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }


}
