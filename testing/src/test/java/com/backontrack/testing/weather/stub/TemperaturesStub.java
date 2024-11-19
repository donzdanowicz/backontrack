package com.backontrack.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        //dummy data
        stubResult.put("Berlin", 8.5);
        stubResult.put("London", 6.2);
        stubResult.put("Warsaw", 5.5);
        stubResult.put("Paris", 11.9);
        stubResult.put("Rome", 19.0);

        return stubResult;
    }
}
