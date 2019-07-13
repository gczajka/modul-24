package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac() {
        //Given
        Bigmac bg = new Bigmac.BigmacBuilder()
                            .bun("with sesame")
                            .sauce("barbecue")
                            .burgers(2)
                            .ingredient("bacon")
                            .ingredient("salad")
                            .ingredient("cheese")
                            .build();

        System.out.println(bg);

        //When
        int numberOfIngredients = bg.getIngredients().size();

        //Then
        Assert.assertEquals(3, numberOfIngredients);
        Assert.assertEquals("with sesame", bg.getBun());
        Assert.assertEquals("barbecue", bg.getSauce());
    }
}
