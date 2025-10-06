package com.backontrack.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String whereTo;
    private final String usingWhat;
    private boolean isExecuted;

    public DrivingTask(String taskName, String whereTo, String usingWhat) {
        this.taskName = taskName;
        this.whereTo = whereTo;
        this.usingWhat = usingWhat;
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
        return String.format("Drive to %s using %s.", whereTo, usingWhat);
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }


}
