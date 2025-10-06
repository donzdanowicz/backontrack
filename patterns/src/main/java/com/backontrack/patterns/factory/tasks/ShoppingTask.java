package com.backontrack.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final int quantity;
    private boolean isExecuted;

    public ShoppingTask(String taskName, String whatToBuy, int quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isExecuted = false;
    }

    public void setExecuted(boolean executed) {
        this.isExecuted = executed;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        setExecuted(true);
        return String.format("Buy %d of %s.", quantity, whatToBuy);
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
