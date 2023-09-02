package ait.wardrobe.model;

import java.util.Arrays;

public class Wardrobe implements Comparable<Wardrobe>{
    double height;
    double width;
    double depth;

    public Wardrobe(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public double area(){
        return width*depth;
    }
    public double volume(){
        return area()*height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wardrobe wardrobe = (Wardrobe) o;

        if (Double.compare(wardrobe.height, height) != 0) return false;
        if (Double.compare(wardrobe.width, width) != 0) return false;
        return Double.compare(wardrobe.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(width);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(depth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "height=" + height +
                ", width=" + width +
                ", area" + area() +
                ", volume" + volume() +
                '}';
    }

    @Override
    public int compareTo(Wardrobe o) {
        return Double.compare(height, o.height); // принимает дабл, сравнивает и возвращает инт
    }
}
