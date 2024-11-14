package com.backontrack.initialbasiccourse.loop.queuesandloops;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskManager {
    private final List<String> executedTasks;

    public TaskManager() {
        executedTasks = new ArrayList<>();
    }

    public void executeTasks(Deque<String> theQueue) {
        while(theQueue.size() > 0) {
            String theTask = theQueue.poll();
            System.out.println("Processing the task: " + theTask);
            executedTasks.add(theTask);
        }
        System.out.println("\nExecuted total " + executedTasks.size() + " tasks.");
    }
}
