package com.backontrack.testing.weather.stub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherForecastTestSuite {
    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        weatherForecast.calculateForecast().entrySet().forEach(System.out::println);

        //Then
        assertEquals(5, quantityOfSensors);
    }
}
