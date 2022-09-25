package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.width, width) != 0) return false;
        return Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(width);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
