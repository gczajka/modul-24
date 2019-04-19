package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentsList = new ArrayList<>();

    public List<Continent> getContinentsList() {
        return continentsList;
    }

    public void addContinent(Continent cnt){
        continentsList.add(cnt);
    }

    public void removeContinent(Continent cnt){
        continentsList.remove(cnt);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = this.getContinentsList().stream()
                .flatMap(cont -> cont.getCountriesList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return peopleQuantity;

    }
}
