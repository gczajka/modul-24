package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    String shape = "Triangle";
    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getH() {
        return h;
    }

    @Override
    public String getShape() {
        return shape;
    }

    @Override
    public double getField() {
        return 0.5 * a * h ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getA(), getA()) == 0 &&
                Double.compare(triangle.getH(), getH()) == 0 &&
                Objects.equals(getShape(), triangle.getShape());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShape(), getA(), getH());
    }
}
