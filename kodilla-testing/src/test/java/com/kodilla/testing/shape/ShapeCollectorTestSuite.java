package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    public static int testCounter = 0;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Starting Test Suite");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Finished Test Suite");
    }

    @Before
    public void before(){
        testCounter++;
        System.out.println("Starting Test Case number: " + testCounter);
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector clct = new ShapeCollector();
        Shape square = new Square(3.0);

        //When
        clct.addFigure(square);

        //Then
        Assert.assertEquals(square, clct.getTheList().get(0));
        Assert.assertEquals(1, clct.getTheList().size());

    }

    @Test
    public void testRemoveFigureNotExisting(){
        //Given
        ShapeCollector clct = new ShapeCollector();
        Shape square = new Square(3.0);

        //When
        boolean result = clct.removeFigure(square);

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector clct = new ShapeCollector();
        Shape square = new Square(3.0);
        clct.getTheList().add(square);

        //When
        boolean result = clct.removeFigure(square);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,clct.getTheList().size());


    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector clct = new ShapeCollector();
        Shape square = new Square(3.0);
        clct.addFigure(square);

        //When
        Shape figure = clct.getFigure(0);

        //Then
        Assert.assertEquals(square, figure);

    }

}
