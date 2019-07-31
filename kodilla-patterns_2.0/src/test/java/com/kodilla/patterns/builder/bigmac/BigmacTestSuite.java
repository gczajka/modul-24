package com.kodilla.patterns.builder.bigmac;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac() {
        //Given
        Bigmac.BigmacBuilder builder = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .sauce("barbecue")
                .burgers(2)
                .ingredient("bacon")
                .ingredient("salad")
                .ingredient("cheese");
        //When
        Bigmac bg = builder.build();

        //Then
        System.out.println(bg);
        assertEquals(3, bg.getIngredients().size());
        assertEquals("with sesame", bg.getBun());
        assertEquals("barbecue", bg.getSauce());

    }
}
