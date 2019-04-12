package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    public static int testCounterBefore = 0;
    public static int testCounterAfter = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Starting Collection Test Suite");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Finished Collection Test Suite");
    }

    @Before
    public void before(){
        testCounterBefore++;
        System.out.println("Starting Collection Test Case: " + testCounterBefore );
    }

    @After
    public void after(){
        testCounterAfter++;
        System.out.println("Finished Collection Test Case: " + testCounterAfter );
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();

        //When
        ArrayList<Integer> evenList = ext.exterminate(list);

        //Then
        Assert.assertEquals(0, evenList.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        OddNumbersExterminator ext = new OddNumbersExterminator();

        //When
        ArrayList<Integer> evenList = ext.exterminate(list);

        //Then
        Assert.assertEquals(2, evenList.size());
        Assert.assertEquals((Integer)2, evenList.get(0));
        Assert.assertEquals((Integer)4, evenList.get(1));

    }
}
