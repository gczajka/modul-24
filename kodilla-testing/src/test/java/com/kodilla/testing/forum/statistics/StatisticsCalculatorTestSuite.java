package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    public static int testCounter = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Starting test suite for StatisticsCalculator");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Finished test suite for StatisticsCalculator");
    }

    @Before
    public void before(){
        testCounter++;
        System.out.println("Starting test case number: " + testCounter);
    }

    @Test
    public void testForZeroPosts(){
        //Given
        StatisticsCalculator calc = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            list.add("something");
        }
        int post = 0;
        int comments = 25;
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        calc.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0 , calc.getNumberOfPosts());
        Assert.assertEquals(0.0 , calc.getAverageNumberOfPostsPerUser(), 0.01);
    }

    @Test
    public void testForZeroComments(){
        //Given
        StatisticsCalculator calc = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            list.add("something");
        }
        int post = 10;
        int comments = 0;
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        calc.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10 , calc.getNumberOfPosts());
        Assert.assertEquals(0.1 , calc.getAverageNumberOfPostsPerUser(), 0.01);
        Assert.assertEquals(0.0 , calc.getAverageNumberOfCommentsPerUser(), 0.01);
    }

    @Test
    public void testForZeroUsers(){
        //Given
        StatisticsCalculator calc = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        int post = 10;
        int comments = 25;
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        calc.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0 , calc.getNumberOfUsers());
    }

    @Test
    public void testForMorePostsThanComments(){
        //Given
        StatisticsCalculator calc = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            list.add("something");
        }
        int post = 1000;
        int comments = 600;
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        calc.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.6 , calc.getAverageNumberOfCommentsPerPost(), 0.01);
        Assert.assertEquals(6.0 , calc.getAverageNumberOfCommentsPerUser(), 0.01);
        Assert.assertEquals(100.0 , calc.getNumberOfUsers(), 0.01);
        Assert.assertEquals(600.0 , calc.getNumberOfComments(), 0.01);
    }

    @Test
    public void testForLessPostsThanComments(){
        //Given
        StatisticsCalculator calc = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            list.add("something");
        }
        int post = 600;
        int comments = 900;
        when(statisticsMock.usersNames()).thenReturn(list);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When
        calc.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1.5 , calc.getAverageNumberOfCommentsPerPost(), 0.01);
        Assert.assertEquals(9.0 , calc.getAverageNumberOfCommentsPerUser(), 0.01);
        Assert.assertEquals(100.0 , calc.getNumberOfUsers(), 0.01);
        Assert.assertEquals(900.0 , calc.getNumberOfComments(), 0.01);
    }
}
