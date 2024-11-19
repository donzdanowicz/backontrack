package com.backontrack.testing.weather.stub;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 Celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0.0;
        int quantity = temperatures.getTemperatures().size();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }

        return sum / quantity;
    }

    public double calculateMedianTemperature() {
        int quantity = temperatures.getTemperatures().size();
        int middleIndex = (int) Math.floor(((double) quantity / 2));
        double median;
        List<Double> temperatureList = new ArrayList<>(temperatures.getTemperatures().values());
        temperatureList.sort(Comparator.naturalOrder());

        if (quantity % 2 != 0) {
            median = temperatureList.get(middleIndex);
        } else {
            median = (temperatureList.get(middleIndex) + temperatureList.get(middleIndex + 1)) / 2;
        }

        return median;
    }
}
