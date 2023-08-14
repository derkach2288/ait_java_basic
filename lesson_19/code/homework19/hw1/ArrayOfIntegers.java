package homework19.hw1;

import java.util.Scanner;

public class ArrayOfIntegers {
    private SmartArray array;

    public ArrayOfIntegers(){
        array = new SmartArray();
    }

    public String toString() {return "You have input the following numbers: " + array;}

    public void addNumber(Scanner scanner){
        System.out.println("Введите число или 0 для выхода");
        for (int i = scanner.nextInt(); i !=0 ; i = scanner.nextInt()) {
            array.add(i);
        }

    }

}
