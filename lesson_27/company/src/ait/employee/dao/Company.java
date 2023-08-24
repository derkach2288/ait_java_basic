package ait.employee.dao;

import ait.employee.model.Employee;

public interface Company {
    boolean addEmployee(Employee employee); // public abstract можно не писать, в интерфейса это по умолчанию
    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    int quantity(); // количество сотрудников

    double totalSalary();

    double avgSalary(); //средняя зарплата

    double totalSales(); // объем продаж

    void printEmployees();

}
