package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;
import com.kodilla.patterns2.observer.forum.ForumUser;
import com.kodilla.patterns2.observer.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.observer.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskQueue queue1 = new TaskQueue("Piotr");
        TaskQueue queue2 = new TaskQueue("Pola");
        TaskQueue queue3 = new TaskQueue("Paweł");
        TaskQueue queue4 = new TaskQueue("Patrycja");
        TaskQueue queue5 = new TaskQueue("Przemek");
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");
        queue1.registerObserver(mentor1);
        queue1.registerObserver(mentor2);
        queue2.registerObserver(mentor1);
        queue3.registerObserver(mentor2);
        queue4.registerObserver(mentor2);
        queue5.registerObserver(mentor1);
        //When
        queue1.addTask("task1");
        queue1.addTask("task2");
        queue1.addTask("task3");
        queue2.addTask("task1");
        queue3.addTask("task1");
        queue3.addTask("task2");
        queue4.addTask("task1");
        queue4.addTask("task2");
        queue5.addTask("task1");
        //Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(7, mentor2.getUpdateCount());
    }
}
