package ait.shape.model;

public class Circle extends Shape{


    public Circle(double size) {
        super(size);
    }


    @Override
    public double calcArea() {
        return Math.PI * Math.pow(size, 2);
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle { ");
        sb.append(" radius=").append(size);
        sb.append(", Area=").append(calcArea());
        sb.append(", Perimeter=").append(calcPerimeter());
        sb.append(" }");
        return sb.toString();
    }
}
