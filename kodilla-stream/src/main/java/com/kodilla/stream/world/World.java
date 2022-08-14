package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent>listOfContinentsOfTheWorld = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return listOfContinentsOfTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantityOfTheWorld = listOfContinentsOfTheWorld.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,country) -> sum.add(country));

        return peopleQuantityOfTheWorld;
    }
}
