package computer.dao;

import computer.dao.model.Computer;

import java.util.function.Predicate;

public class WarehouseImpl implements Warehouse{
    private Computer[] computers;
    private int size;

    public WarehouseImpl(int capacity){
        computers = new Computer[capacity];
    }

    @Override
    public boolean addComputer(Computer computer) {
        if (computer == null || size == computers.length || findComputerById(computer.getId()) != null){
            return false;
        }
        computers[size++] = computer;
        return true;
    }

    @Override
    public Computer removeComputer(int id) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id){
                Computer computerForRemove = computers[i];
                computers[i] = computers[size-1];
                computers[size-1] = null;
                size--;
                return computerForRemove;
            }
        }
        return null;
    }

    @Override
    public Computer findComputerById(int id) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getId() == id){
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public Computer[] findComputerByBrand(String brand) {
        Predicate<Computer> predicate = computer -> computer.getBrand().equals(brand);
        return findComputerByPredicate(predicate);
    }


    @Override
    public Computer[] findComputerByType(String type) {
        Predicate<Computer> predicate = computer -> computer.getType().equals(type);
        return findComputerByPredicate(predicate);
    }

    @Override
    public int size() {
        return size;
    }

    private Computer[] findComputerByPredicate(Predicate<Computer> predicate) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(computers[i])){
                counter++;
            }
        }
        Computer[] res = new Computer[counter];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(computers[i])){
                res[j] = computers[i];
                j++;
            }
        }
        return res;
    }

}
