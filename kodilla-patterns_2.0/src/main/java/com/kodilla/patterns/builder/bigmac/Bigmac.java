package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;

public class Bigmac {
    private final String bun;
    private final int hotdogs;
    private final String sauce;
    private final ArrayList<String> ingredients;

    private Bigmac(final String bun, final int hotdogs, final String sauce, ArrayList<String> ingredients) {
        this.bun = bun;
        this.hotdogs = hotdogs;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getHotdogs() {
        return hotdogs;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {
        String bun;
        int burgers;
        String sauce;
        ArrayList<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", hotdogs=" + hotdogs +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
