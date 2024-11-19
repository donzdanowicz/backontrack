package com.backontrack.testing.weather.mock;

import com.backontrack.testing.weather.stub.Temperatures;
import com.backontrack.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    Temperatures temperaturesMock;

    Map<String, Double> temperaturesMap = new HashMap<>();


    @BeforeEach
    void beforeEveryTest () {
        temperaturesMap.put("Berlin", 8.5);
        temperaturesMap.put("London", 6.2);
        temperaturesMap.put("Warsaw", 5.5);
        temperaturesMap.put("Paris", 11.9);
        temperaturesMap.put("Rome", 19.0);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateAverageTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        double calculatedAverage = weatherForecast.calculateAverageTemperature();

        //Then
        assertEquals(10.22, calculatedAverage, 0.1);
    }

    @Test
    void testCalculateMedianTemperature() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        double calculatedMedian = weatherForecast.calculateMedianTemperature();

        //Then
        assertEquals(8.5, calculatedMedian, 0.1);
    }
}
