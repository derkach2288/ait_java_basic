package computer.dao.test;

import computer.dao.Warehouse;
import computer.dao.WarehouseImpl;
import computer.dao.model.Computer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseImplTest {
    Warehouse warehouse;
    Computer[] computers;

    private void printComputers(Computer[] computers){
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }

    @BeforeEach
    void setUp() {
        warehouse = new WarehouseImpl(5);
        computers = new Computer[4];
        computers[0] = new Computer(1, 2022, "mac", "laptop");
        computers[1] = new Computer(2, 2023, "acer", "desktop");
        computers[2] = new Computer(3, 2021, "asus", "laptop");
        computers[3] = new Computer(4, 2023, "mac", "laptop");
        for (int i = 0; i < computers.length; i++) {
            warehouse.addComputer(computers[i]);
        }
    }

    @Test
    void addComputer() {
        assertFalse(warehouse.addComputer(null));
        assertFalse(warehouse.addComputer(computers[1]));
        Computer computer5 = new Computer(5, 2023, "mac", "laptop");
        assertTrue(warehouse.addComputer(computer5));
        Computer computer6 = new Computer(6, 2023, "mac", "laptop");
        assertFalse(warehouse.addComputer(computer6));

    }

    @Test
    void removeComputer() {
        assertEquals(computers[1], warehouse.removeComputer(computers[1].getId()));
        assertEquals(3, warehouse.size());
        assertNull(warehouse.removeComputer(2));
    }

    @Test
    void findComputerById() {
        assertEquals(computers[2], warehouse.findComputerById(computers[2].getId()));
        assertNull(warehouse.findComputerById(9));
    }

    @Test
    void findComputerByBrand() {
        Computer[] expected = {computers[0], computers[3]};
        assertArrayEquals(expected, warehouse.findComputerByBrand("mac"));
    }

    @Test
    void findComputerByType() {
        Computer[] expected = {computers[0], computers[2], computers[3]};
        assertArrayEquals(expected, warehouse.findComputerByType("laptop"));

    }

    @Test
    void size() {
        assertEquals(4, warehouse.size());
    }

    @Test
    void testComparableComputer(){
        printComputers(computers);
        System.out.println("==========");
        Arrays.sort(computers);
        printComputers(computers);
    }

    @Test void testSortComputersByYear(){
        System.out.println("==========testSortComputersByYear=======");
        printComputers(computers);
        System.out.println("==========");
        Arrays.sort(computers, (c1, c2) -> c1.getYear()-c2.getYear());
        printComputers(computers);

    }


    @Test void testSortComputersByType(){
        System.out.println("==========testSortComputersByType=======");
        printComputers(computers);
        System.out.println("==========");
        Arrays.sort(computers, (c1, c2) -> c1.getType().compareTo(c2.getType()));
        printComputers(computers);

    }


}