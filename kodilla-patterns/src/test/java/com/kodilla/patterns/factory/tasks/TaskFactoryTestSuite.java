package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertEquals("To buy", task.getTaskName());
    }

    @Test
    void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.PAINTING);
        //Then
        assertEquals("To paint", task.getTaskName());
    }

    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.DRIVING);
        //Then
        assertEquals("To drive", task.getTaskName());
    }

    @Test
    void testFactoryExecute() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        assertFalse(task.isTaskExecuted());
        //When
        task.executeTask();
        //Then
        assertTrue(task.isTaskExecuted());
    }
}
