package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;
    private final List<Country> countriesList = new ArrayList<>();

    public Continent(final String name) {
        this.name = name;
    }

    public void addCountry(Country cntr){
        countriesList.add(cntr);
    }

    public void removeCountry(Country cntr){
        countriesList.remove(cntr);
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountriesList() {
        return countriesList;
    }
}
