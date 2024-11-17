package com.backontrack.testing.shape;

public class Triangle implements Shape {
    private final double height;
    private final double side;

    public Triangle(double height, double side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getField() {
        return 0.5 * this.side * this.height;
    }
}
