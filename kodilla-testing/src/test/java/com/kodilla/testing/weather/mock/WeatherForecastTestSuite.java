package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;


import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    public Temperatures temperaturesMock;
    @Mock
    public WeatherForecast calculateAverage;
    @Mock
    public WeatherForecast calculateMedian;
    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testTemperatureAverage() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
       when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
       WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
       //When
       double average = weatherForecast.calculateAverage();
       //Then
       Assertions.assertEquals(25.56 ,average);
    }

    @Test
    void testTemperaturesMedian() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        Collection<Double> values = temperaturesMap.values();
        List<Double> listOfValues = new ArrayList<>(values);
        Collections.sort(listOfValues);
        //When
        double median = weatherForecast.calculateMedian(listOfValues);
        //Then
        Assertions.assertEquals(25.5,median);
   }
}

