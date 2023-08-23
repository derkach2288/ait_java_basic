package ait.shape.model;

public class Square extends Shape {

    public Square(double size) {
        super(size);
    }

    @Override
    public double calcArea() {
        return size * size;
    }

    @Override
    public double calcPerimeter() {
        return size * 4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square { ");
        sb.append(" side=").append(size);
        sb.append(", Area=").append(calcArea());
        sb.append(", Perimeter=").append(calcPerimeter());
        sb.append(" }");
        return sb.toString();
    }


}
