public class SupportEngineer extends Employee{
    public SupportEngineer(String name, int salary) {
        super(name, salary);// super обращение к родительскому классу
    }


    @Override
    public String toString() {
        return "Programmer " + super.getName() + " " + super.getSalary();
    }

    public void work() {
        System.out.println("I'm " + super.getName() + " I'm developer ");
    }
}
