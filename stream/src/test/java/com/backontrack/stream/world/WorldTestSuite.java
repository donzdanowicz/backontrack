package com.backontrack.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent();
        Continent northAmerica = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();

        Country poland = new Country("Poland", new BigDecimal(38000000));
        Country germany = new Country("Germany", new BigDecimal(70000000));
        Country france = new Country("France", new BigDecimal(50000000));
        Country spain = new Country("Spain", new BigDecimal(60000000));
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(spain);

        Country usa = new Country("USA", new BigDecimal(300000000));
        Country canada = new Country("Canada", new BigDecimal(80000000));
        Country mexico = new Country("Mexico", new BigDecimal(100000000));
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        Country japan = new Country("Japan", new BigDecimal(100000000));
        Country china = new Country("China", new BigDecimal(1000000000));
        Country russia = new Country("Russia", new BigDecimal(300000000));
        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(russia);

        Country egypt = new Country("Egypt", new BigDecimal(80000000));
        Country rsa = new Country("RSA", new BigDecimal(60000000));
        Country niger = new Country("Niger", new BigDecimal(40000000));
        africa.addCountry(egypt);
        africa.addCountry(rsa);
        africa.addCountry(niger);

        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal receivedPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("2278000000");
        assertEquals(expectedPeopleQuantity, receivedPeopleQuantity);
    }
}
