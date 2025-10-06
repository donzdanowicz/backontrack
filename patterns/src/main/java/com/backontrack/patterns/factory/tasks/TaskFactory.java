package com.backontrack.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("MediaExpert", "Acer Travelmate", 1);
            case PAINTING:
                return new PaintingTask("Wall in living room", "wall", "red");
            case DRIVING:
                return new DrivingTask("Euro Trip", "Marseille", "car");
            default:
                return null;
        }
    }

}
