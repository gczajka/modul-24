package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board)context.getBean("board");

        //When
        board.getToDoList().getTasks().add("one");
        board.getInProgressList().getTasks().add("two");
        board.getDoneList().getTasks().add("three");

        String one = board.getToDoList().getTasks().get(0);
        String two = board.getInProgressList().getTasks().get(0);
        String three = board.getDoneList().getTasks().get(0);

        //Then
        Assert.assertEquals("one", one);
        Assert.assertEquals("two", two);
        Assert.assertEquals("three", three);
    }
}
