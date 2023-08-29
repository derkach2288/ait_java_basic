package ait.cars.test;

import ait.cars.dao.Garage;
import ait.cars.dao.GarageImpl;
import ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {
    Garage garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("AX1920HK", "Qashqai", "Nissan", 2.0, "black" );
        cars[1] = new Car("AA2354HK", "Rogue", "Nissan", 2.6, "white" );
        cars[2] = new Car("CB3464HK", "Cayenne", "Porsche", 4.0, "black" );
        cars[3] = new Car("AX6368HK", "Q8", "Audi", 3.0, "blue" );
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }

    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(null));
        assertFalse(garage.addCar(cars[1]));
        Car car5 = new Car("AX2344HK", "Q7", "Audi", 3.0, "red");
        assertTrue(garage.addCar(car5));
        Car car6 = new Car("AX3333HK", "A4", "Audi", 2.4, "black");
        assertFalse(garage.addCar(car6));
    }

    @Test
    void removeCar() {
        assertEquals(cars[2], garage.removeCar("CB3464HK"));
        assertEquals(3, garage.quantity());
        assertNull(garage.removeCar("CB3464HK"));

    }

    @Test
    void findCarByRegNumber() {
        assertEquals(cars[1], garage.findCarByRegNumber("AA2354HK"));
        assertNull(garage.findCarByRegNumber("WW1111PL"));
    }

    @Test
    void findCarsByModel() {
        Car[] actual = garage.findCarsByModel("Cayenne");
        Car[] expected = {cars[2]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompany() {
        Car[] actual = garage.findCarsByCompany("Nissan");
        Car[] expected = {cars[0], cars[1]};
        assertArrayEquals(expected, actual);

    }

    @Test
    void findCarsByEngine() {
        Car[] actual = garage.findCarsByEngine(2.5, 3.5);
        Car[] expected = {cars[1], cars[3]};
        assertArrayEquals(expected, actual);

    }

    @Test
    void findCarsByColor() {
        Car[] actual = garage.findCarsByColor("black");
        Car[] expected = {cars[0], cars[2]};
        assertArrayEquals(expected, actual);

    }

    @Test
    void quantity() {

        assertEquals(4, garage.quantity());
    }


}