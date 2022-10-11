package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;

    private String whatToBuy;

    private double quantity;

    private boolean executed;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean executed) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        executed = false;

    }

    @Override
    public void executeTask() {
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
