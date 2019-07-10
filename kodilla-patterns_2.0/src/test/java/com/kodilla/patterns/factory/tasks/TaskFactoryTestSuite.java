package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShop() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task task = factory.createTask(TaskFactory.SHOP);
        boolean state0 = task.isTaskExecuted();

        //When
        task.executeTask();

        //Then
        Assert.assertEquals("shopForFood", task.getTaskName());
        Assert.assertEquals(false, state0);
        Assert.assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testFactoryDrive() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task task = factory.createTask(TaskFactory.DRIVE);
        boolean state0 = task.isTaskExecuted();

        //When
        task.executeTask();

        //Then
        Assert.assertEquals("driveToWork", task.getTaskName());
        Assert.assertEquals(false, state0);
        Assert.assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task task = factory.createTask(TaskFactory.PAINT);
        boolean state0 = task.isTaskExecuted();

        //When
        task.executeTask();

        //Then
        Assert.assertEquals("paintToRenovate", task.getTaskName());
        Assert.assertEquals(false, state0);
        Assert.assertEquals(true, task.isTaskExecuted());
    }
}
