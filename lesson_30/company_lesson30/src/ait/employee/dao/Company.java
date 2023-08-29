package ait.employee.dao;

import ait.employee.model.Employee;

public interface Company {
    String TITLE = "Apple"; // в интерфейсе не может быть полей, кроме константы (public static final)
    boolean addEmployee(Employee employee); // public abstract можно не писать, в интерфейса это по умолчанию
    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    int quantity(); // количество сотрудников

    double totalSalary();

//    double avgSalary(); //средняя зарплата
    default double avgSalary(){ // дефолтный метод, его можно не переопределять в импл, после 8й джавы
        return totalSalary() / quantity();
    }


    double totalSales(); // объем продаж

    void printEmployees();

    Employee[] findEmployeesHoursGreaterThan(int hours); // возвращет всех сотрудников, которы отработали больше заданного времени

    Employee[] findEmployeesSalaryRanger(int minSalary, int maxSalary);

}
