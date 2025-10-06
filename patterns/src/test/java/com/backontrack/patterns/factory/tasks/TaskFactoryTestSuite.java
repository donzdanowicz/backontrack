package com.backontrack.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);

        //When
        String expected = "Buy 1 of Acer Travelmate.";
        String actual = shoppingTask.executeTask();
        System.out.println(actual);

        //Then
        assertEquals(expected, actual);
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);

        //When
        String expected = "Paint wall red.";
        String actual = paintingTask.executeTask();
        System.out.println(actual);

        //Then
        assertEquals(expected, actual);
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);

        //When
        String expected = "Drive to Marseille using car.";
        String actual = drivingTask.executeTask();
        System.out.println(actual);

        //Then
        assertEquals(expected, actual);
        assertTrue(drivingTask.isTaskExecuted());
    }
}
