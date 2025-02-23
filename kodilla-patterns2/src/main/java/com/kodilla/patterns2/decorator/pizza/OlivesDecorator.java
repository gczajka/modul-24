package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OlivesDecorator extends AbstractPizzaDecorator {
    public OlivesDecorator(PizzaBlueprint pizzaBlueprint) {
        super(pizzaBlueprint);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + olives";
    }
}
