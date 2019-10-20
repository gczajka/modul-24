package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaDecorator implements PizzaBlueprint {
    private final PizzaBlueprint pizzaBlueprint;

    public AbstractPizzaDecorator(PizzaBlueprint pizzaBlueprint) {
        this.pizzaBlueprint = pizzaBlueprint;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaBlueprint.getCost();
    }

    @Override
    public String getDescription() {
        return pizzaBlueprint.getDescription();
    }
}
