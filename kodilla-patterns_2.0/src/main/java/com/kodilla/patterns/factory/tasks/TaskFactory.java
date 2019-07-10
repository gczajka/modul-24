package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOP = "SHOP";
    public static final String PAINT = "PAINT";
    public static final String DRIVE = "DRIVE";

    public final Task createTask(final String taskType) {
        switch (taskType) {
            case SHOP:
                return new ShoppingTask("shopForFood", "fruit", 2);
            case PAINT:
                return new PaintingTask("paintToRenovate", "green", "flat");
            case DRIVE:
                return new DrivingTask("driveToWork", "work", "car");
            default: return null;
        }
    }
}
