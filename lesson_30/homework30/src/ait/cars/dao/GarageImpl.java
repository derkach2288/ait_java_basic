package ait.cars.dao;

import ait.cars.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage {
    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || cars.length == size || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size] = car;
        size++;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)){
                Car temporary = cars[i];
                cars[i] = cars[size-1];
                cars[size-1] = null;
                size--;
                return temporary;
            }
        }
//        for (int i = 0; i < size; i++) {
//            if (cars[i].getRegNumber().equals(regNumber)) {
//                Car temporary = cars[i];
//                Car[] temp = new Car[size - 1];
//                for (int j = 0; j < temp.length; j++) {
//                    if (j < i) {
//                        temp[j] = cars[j];
//                    } else {
//                        temp[j] = cars[j + 1];
//                    }
//                }
//                cars = temp;
//                size--;
//                return temporary;
//            }
//        }

        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        Predicate<Car> predicate = car -> car.getModel().equals(model);
        return findCarsPredicate(predicate);
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        Predicate<Car> predicate = car -> car.getCompany().equals(company);
        return findCarsPredicate(predicate);
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        Predicate<Car> predicate = car -> car.getEngine() >= min && car.getEngine() < max;
        return findCarsPredicate(predicate);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        Predicate<Car> predicate = car -> car.getColor().equals(color);
        return findCarsPredicate(predicate);
    }

    @Override
    public int quantity() {
        return size;
    }

    public Car[] findCarsPredicate(Predicate<Car> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])) {
                count++;
            }
        }

        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(cars[i])) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }


}
