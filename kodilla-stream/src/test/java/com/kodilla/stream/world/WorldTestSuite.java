package com.kodilla.stream.world;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting test suite");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Finished test suite");
    }

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland", new BigDecimal("9000000000"));
        Country spain = new Country("Spain", new BigDecimal("8000000000"));
        Country italy = new Country("Italy", new BigDecimal("7000000000"));
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(spain);
        europe.addCountry(italy);

        Country egypt = new Country("Egypt", new BigDecimal("9000000000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("8000000000"));
        Country tunisia = new Country("Tunisia", new BigDecimal("7000000000"));
        Continent africa = new Continent("Africa");
        africa.addCountry(egypt);
        africa.addCountry(nigeria);
        africa.addCountry(tunisia);

        Country brazil = new Country("Brazil", new BigDecimal("9000000000"));
        Country argentina = new Country("Argentina", new BigDecimal("8000000000"));
        Country chile = new Country("Chile", new BigDecimal("7000000000"));
        Continent southAmerica = new Continent("SouthAmerica");
        southAmerica.addCountry(brazil);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(chile);

        World wrld = new World();
        wrld.addContinent(europe);
        wrld.addContinent(africa);
        wrld.addContinent(southAmerica);

        //When
        BigDecimal result = wrld.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("72000000000"), result);
        Assert.assertEquals(3, wrld.getContinentsList().size());
        Assert.assertTrue(wrld.getContinentsList().contains(europe));
        Assert.assertTrue(wrld.getContinentsList().contains(africa));
        Assert.assertTrue(wrld.getContinentsList().contains(southAmerica));
    }
}
