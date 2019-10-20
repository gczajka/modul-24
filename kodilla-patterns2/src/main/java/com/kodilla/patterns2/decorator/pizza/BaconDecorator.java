package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BaconDecorator extends AbstractPizzaDecorator {
    public BaconDecorator(PizzaBlueprint pizzaBlueprint) {
        super(pizzaBlueprint);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + bacon";
    }
}
