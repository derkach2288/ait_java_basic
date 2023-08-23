package ait.shape;

import ait.shape.model.Circle;
import ait.shape.model.Shape;
import ait.shape.model.Square;
import ait.shape.model.Triangle;

import java.util.Arrays;

public class FigureAppl {
    public static void main(String[] args) {

//        Circle circle1 = new Circle(3);
//        System.out.println(circle1);
//
//        Square square1 = new Square(3);
//        System.out.println(square1);


        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(2);
        shapes[1] = new Circle( 5);
        shapes[2] = new Triangle(3);
        shapes[3] = new Square(7);

        printArray(shapes);
        System.out.println("------------");

        double totalArea = totalArea(shapes);
        System.out.println("Total Area = " + totalArea);

        double totalPerimeter = totaPerimeter(shapes);
        System.out.println("Total Perimeter = " + totalPerimeter);

        double totalAreaCircle = totalAreaCircles(shapes);
        System.out.println("Total Area Circles = " + totalAreaCircle);



    }

    private static double totalAreaCircles(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle){
                Circle circle = (Circle) shapes[i];
                sum += circle.calcArea();
            }
        }
        return sum;
    }

    private static double totaPerimeter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sum += shapes[i].calcPerimeter();
            }
        }
        return sum;
    }

    private static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sum += shapes[i].calcArea();
            }
        }
        return sum;
    }

    private static void printArray(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }

}
