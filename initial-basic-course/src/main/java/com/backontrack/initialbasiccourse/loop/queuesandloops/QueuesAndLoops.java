package com.backontrack.initialbasiccourse.loop.queuesandloops;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueuesAndLoops {
    public static void main(String[] args) {
        Deque<String> taskQueue1 = new ArrayDeque<>();
        for (int n = 0; n < 5; n++) {
            taskQueue1.offer("The first task number " + (n+1));
        }

        Deque<String> taskQueue2 = new ArrayDeque<>();
        for (int n = 0; n < 5; n++) {
            taskQueue1.offer("The second task number " + (n+1));
        }

        TaskManager taskExecutor = new TaskManager();
        taskExecutor.executeTasks(taskQueue1);
        taskExecutor.executeTasks(taskQueue2);
    }
}
