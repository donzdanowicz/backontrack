package com.backontrack.testing.shape;

public class Square implements Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

    public double getField() {
        return this.side * this.side;
    }
}
