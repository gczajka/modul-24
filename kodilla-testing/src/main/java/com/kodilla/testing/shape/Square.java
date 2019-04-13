package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    String shape = "Square";
    double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public double getField() {
        return a * a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.getA(), getA()) == 0 &&
                Objects.equals(getShape(), square.getShape());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShape(), getA());
    }
}
