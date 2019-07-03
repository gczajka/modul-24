package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calc = context.getBean(Calculator.class);

        //When
        double add = calc.add(1, 1);
        double sub = calc.sub(7, 4);
        double mul = calc.mul(2, 3);
        double div = calc.div(9, 3);

        //Then
        Assert.assertEquals(2, add, 0.01);
        Assert.assertEquals(3, sub, 0.01);
        Assert.assertEquals(6, mul, 0.01);
        Assert.assertEquals(3, div, 0.01);
    }
}
