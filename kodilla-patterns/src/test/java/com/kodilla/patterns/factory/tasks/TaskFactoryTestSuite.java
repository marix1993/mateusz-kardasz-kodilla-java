package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        boolean taskDone = shopping.isTaskExecuted();
        //Then
        assertEquals("Shopping" , shopping.getTaskName());
        assertEquals(taskDone, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        boolean taskDone = driving.isTaskExecuted();
        //Then
        assertEquals("Driving", driving.getTaskName());
        assertEquals(taskDone, driving.isTaskExecuted());

    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        boolean taskDone = painting.isTaskExecuted();
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertEquals(taskDone, painting.isTaskExecuted());

    }
}
