package com.kodilla.stream.array;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Starting test suite");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Finished test suite");
    }

    @Test
    public void testGetAverage(){
        //Given
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        //When
        double result = ArrayOperations.getAverage(array);

        //Then
        Assert.assertEquals(5.5, result,0.01);
    }
}
