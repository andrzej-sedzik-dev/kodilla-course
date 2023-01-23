package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("To buy", "Oranges", 2);
            case PAINTING -> new PaintingTask("To paint", "white", "walls");
            case DRIVING -> new DrivingTask("To drive", "Wrocław", "car");
            default -> null;
        };
    }
}
