package ait.employee.dao;

import ait.employee.model.Employee;
import ait.employee.model.SalesManager;

import java.util.Arrays;
import java.util.function.Predicate;

public class CompanyArraysImpl implements Company{
    private Employee[] employees;
    private int size; // длина массива, количество сотрудников

    public CompanyArraysImpl(int capacity) {
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || employees.length == size || findEmployee(employee.getId()) != null) { // нельзя добавить null || нельзя добавть, если мест уже нету || нельзя добавить существующего, если метод поиска вернул не null
            return false;
        }
        employees[size++] = employee;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];
                System.arraycopy(employees, i+1, employees, i, size - i - 1);
                employees[--size] = null;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].calcSalary();
        }
        return sum;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) { // instanceof проверяет, является ли employees[i] эекземпляром класса SalesManager
                SalesManager sm = (SalesManager) employees[i];
                sum += sm.getSalesValue();
            }
        }
        return sum;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        Predicate<Employee> predicate = e -> e.getHours() > hours; // принимает "e" - возвращает тру или фолс
        return findEmployeesByPredicate(predicate);
    }

    @Override
    public Employee[] findEmployeesSalaryRanger(int minSalary, int maxSalary) {
        Predicate<Employee> predicate = new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.calcSalary() >= minSalary && employee.calcSalary() < maxSalary;
            }
        };
        return findEmployeesByPredicate(predicate);
    }

    private Employee[] findEmployeesByPredicate(Predicate<Employee> predicate) { // возвращает employee, для которых predicate.test сказал тру
        int count = 0;
        Employee[] res = new Employee[size];
        for (int i = 0; i < res.length; i++) {
            if (predicate.test(employees[i])) {
                res[count] = employees[i];
                count++;
            }
        }
        return Arrays.copyOf(res, count);
    }
}
