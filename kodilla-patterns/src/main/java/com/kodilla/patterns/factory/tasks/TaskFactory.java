package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "ShoppingTask";
    public static final String PAINTING = "PaintingTask";
    public static final String DRIVING = "DrivingTask";


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "Equipment", 20, true);
            case PAINTING:
                return new PaintingTask("Painting", "Red", "Walls");
            case DRIVING:
                return new DrivingTask("Driving", "Shop", "Car");
            default:
                return null;
        }
    }
}
