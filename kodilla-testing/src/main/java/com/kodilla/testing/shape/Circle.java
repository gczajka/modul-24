package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    String shape = "Circle";
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public double getField() {
        return 3.14 * r * r ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getR(), getR()) == 0 &&
                Objects.equals(getShape(), circle.getShape());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShape(), getR());
    }
}
