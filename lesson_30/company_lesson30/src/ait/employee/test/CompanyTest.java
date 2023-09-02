package ait.employee.test;

import ait.employee.dao.Company;
import ait.employee.dao.CompanyImpl;
import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SalesManager;
import ait.employee.model.WageEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    Company company;
    Employee[] employees;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        employees = new Employee[4];
        employees[0] = new Manager(1000, "John", "Smith", 160, 3000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jackson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindranate", "Anand", 80, 30000, 0.1);
        for (int i = 0; i < employees.length; i++) {
            company.addEmployee(employees[i]);
        }

    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(employees[1])); // проверка, чтоб не добавляьб такого, который уже есть
        Employee employee = new SalesManager(5000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.quantity());
        employee = new SalesManager(6000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertFalse(company.addEmployee(employee)); // ожидаем фолс, если добавляем новый 6й элемент в массив, длиной 5

    }

    @Test
    void removeEmployee() {
        assertEquals(employees[2], company.removeEmployee(3000));
        assertEquals(3, company.quantity());
//        assertEquals(null, company.removeEmployee(3000));
        assertNull(company.removeEmployee(3000));
    }

    @Test
    void findEmployee() {
        assertEquals(employees[1], company.findEmployee(2000));
        assertNull(company.findEmployee(8000));
    }

    @Test
    void quantity() {
        assertEquals(4, company.quantity());
    }

    @Test
    void totalSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].calcSalary();
        }
        assertEquals(sum, company.totalSalary(), 0.01); // 0.01 - точность, сравнивать до сотых
//        assertEquals(11200.0, company.totalSalary(), 0.01);
    }

    @Test
    void avgSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].calcSalary();
        }
        double avg = sum / employees.length;
        assertEquals(avg, company.avgSalary(), 0.01);

    }

    @Test
    void totalSales() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof SalesManager) { // instanceof проверяет, является ли employees[i] эекземпляром класса SalesManager
                SalesManager sm = (SalesManager) employees[i];
                sum += sm.getSalesValue();
            }
        }
        assertEquals(sum, company.totalSales(), 0.01);
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }

    @Test
    void findEmployeesHoursGreaterThan() {
        Employee[] actual = company.findEmployeesHoursGreaterThan(100);
        Employee[] expected = {employees[0], employees[1], employees[2]};
        assertArrayEquals(expected, actual);

        }

    @Test
    void findEmployeesSalaryRanger() {
        Employee[] actual = company.findEmployeesSalaryRanger(2000, 2500);
        Employee[] expected = {employees[1], employees[2]};
        assertArrayEquals(expected, actual);
    }



}

