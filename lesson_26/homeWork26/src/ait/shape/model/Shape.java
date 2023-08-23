package ait.shape.model;

public abstract class Shape {
    protected double size;

    public Shape(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public abstract double calcArea();

    public abstract double calcPerimeter();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
