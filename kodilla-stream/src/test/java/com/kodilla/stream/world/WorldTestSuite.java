package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");
        Continent europa = new Continent("Europa");

        Country poland = new Country("Poland");
        Country hungary = new Country("Hungary");
        Country czechRepublic = new Country("Czech Republic");
        Country germany = new Country("Germany");
        Country canada = new Country("Canada");
        Country mexico = new Country("Mexico");
        Country mongolia = new Country("Mongolia");
        Country china = new Country("China");

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        europa.addCountry(poland);
        europa.addCountry(hungary);
        europa.addCountry(czechRepublic);
        europa.addCountry(germany);

        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        asia.addCountry(mongolia);
        asia.addCountry(china);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("7901234568");
        assertEquals(totalPeopleExpected, totalPeople);
    }
}
