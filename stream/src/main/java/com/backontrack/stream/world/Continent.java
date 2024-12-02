package com.backontrack.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final List<Country> countries = new ArrayList<>();

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void removeCountry(Country country) {
        countries.remove(country);
    }

    public List<Country> getCountries() {
        return countries;
    }
}
