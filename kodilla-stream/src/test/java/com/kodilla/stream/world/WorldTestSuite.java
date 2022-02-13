package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPopulation() {

        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("83000000"));
        Country france = new Country("France", new BigDecimal("67000000"));
        Country unitedKingdom = new Country("United Kingdom", new BigDecimal("67000000"));

        Country japan = new Country("Japan", new BigDecimal("126000000"));
        Country southKorea = new Country("South Korea", new BigDecimal("52000000"));
        Country china = new Country("China", new BigDecimal("1412000000"));
        Country india = new Country("India", new BigDecimal("1390000000"));

        Country southAfrica = new Country("South Africa", new BigDecimal("59000000"));
        Country egypt = new Country("Egypt", new BigDecimal("102000000"));
        Country madagascar = new Country("Madagascar", new BigDecimal("27000000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("206000000"));

        //When
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(unitedKingdom);

        Continent asia = new Continent("Asia");
        asia.addCountry(japan);
        asia.addCountry(southKorea);
        asia.addCountry(china);
        asia.addCountry(india);

        Continent africa = new Continent("Africa");
        africa.addCountry(southAfrica);
        africa.addCountry(egypt);
        africa.addCountry(madagascar);
        africa.addCountry(nigeria);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //Then
        assertEquals(new BigDecimal("3629000000"), world.getPopulation());
    }
}