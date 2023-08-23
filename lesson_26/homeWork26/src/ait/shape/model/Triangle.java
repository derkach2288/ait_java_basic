package ait.shape.model;

public class Triangle extends Shape{

    public Triangle(double size) {
        super(size);
    }

    @Override
    public double calcArea() {
        return (size * size * Math.sqrt(3))/4;
    }

    @Override
    public double calcPerimeter() {
        return size*3;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Triangle { ");
        sb.append(" side=").append(size);
        sb.append(", Area=").append(calcArea());
        sb.append(", Perimeter=").append(calcPerimeter());
        sb.append(" }");
        return sb.toString();
    }


}
