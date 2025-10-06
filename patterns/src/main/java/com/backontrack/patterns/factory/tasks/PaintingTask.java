package com.backontrack.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String whatToPaint;
    private final String color;
    private boolean isExecuted;

    public PaintingTask(String taskName, String whatToPaint, String color) {
        this.taskName = taskName;
        this.whatToPaint = whatToPaint;
        this.color = color;
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
        return String.format("Paint %s %s.", whatToPaint, color);
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
