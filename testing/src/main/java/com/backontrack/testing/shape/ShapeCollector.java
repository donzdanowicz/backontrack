package com.backontrack.testing.shape;

import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new LinkedList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
        System.out.println(shape.getShapeName() + " added to the collection.");
    }

    public boolean removeShape(Shape shape) {
        boolean result = false;
        if(shapes.contains(shape)) {
            System.out.println(shape.getShapeName() + " removed from the collection.");
            result = true;
        }
        return result;
    }

    public Shape getShape(int shapeNumber) {
        if(shapeNumber >= 0 && shapeNumber < shapes.size()) {
            return shapes.get(shapeNumber);
        }
        return null;
    }

    public String showShapes() {
        StringBuilder shapesBuilder = new StringBuilder();
        for (int i = 0; i < shapes.size() - 1; i ++) {
            shapesBuilder.append(shapes.get(i).getShapeName()).append(", ");
        }
        shapesBuilder.append(shapes.get(shapes.size() - 1).getShapeName());
        return shapesBuilder.toString();
    }

    public int getShapesQuantity() {
        return shapes.size();
    }
}
