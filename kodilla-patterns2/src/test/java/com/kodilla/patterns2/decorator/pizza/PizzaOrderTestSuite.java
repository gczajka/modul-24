package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaBlueprint pizza = new BasicPizza();
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(15.00), calculatedCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaBlueprint pizza = new BasicPizza();
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Margherita", description);
    }

    @Test
    public void testBasicPizzaWithExtraCheeseGetCost() {
        //Given
        PizzaBlueprint pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(18.00), calculatedCost);
    }

    @Test
    public void testBasicPizzaWithExtraCheeseGetDescription() {
        //Given
        PizzaBlueprint pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Margherita + extra cheese", description);
    }

    @Test
    public void testBasicPizzaWithEverythingGetCost() {
        //Given
        PizzaBlueprint pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new BaconDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new OlivesDecorator(pizza);
        //When
        BigDecimal calculatedCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(26.00), calculatedCost);
    }

    @Test
    public void testBasicPizzaWithEverythingGetDescription() {
        //Given
        PizzaBlueprint pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new BaconDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new OlivesDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Margherita + extra cheese + bacon + mushrooms + olives", description);
    }
}
