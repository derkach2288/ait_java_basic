package computer.dao;

import computer.dao.model.Computer;

public interface Warehouse {
    boolean addComputer(Computer computer);
    Computer removeComputer(int id);
    Computer findComputerById(int id);
    Computer[] findComputerByBrand(String brand);
    Computer[] findComputerByType(String type);
    int size();

}
