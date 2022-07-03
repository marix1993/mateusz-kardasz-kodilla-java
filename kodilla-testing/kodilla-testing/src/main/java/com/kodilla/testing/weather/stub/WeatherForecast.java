package com.kodilla.testing.weather.stub;

import java.util.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    //Looking for Average
    public double calculateAverage() {
        List<Double> averageMap = new ArrayList<>();
        for (Map.Entry<String, Double> values :
                temperatures.getTemperatures().entrySet()) {
            averageMap.add(values.getValue());
        }
        double sum = 0.0;
        for (int i = 0; i < averageMap.size(); i++) {
            sum = sum + averageMap.get(i);
        }
        double average = sum / averageMap.size();
        return average;
    }
    public double calculateMedian(List<Double>averageMap){
            Collections.sort(averageMap);
            double middle;
            if ((averageMap).size()%2 == 0) {
                middle = (averageMap.get(averageMap.size()/2) + averageMap.get(averageMap.size()/2 - 1))/2;
            } else {
                middle = averageMap.get(averageMap.size() / 2);
            }
            return middle;
    }
}






