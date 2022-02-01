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

            //adding 1 celsius degree to current value
            //as a temporary weather forecast

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {

        double sumOfTemperatures = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            sumOfTemperatures += temperature.getValue();
        }
        double averageTemperature = sumOfTemperatures / calculateForecast().size();

        return averageTemperature;
    }

    public double medianTemperature() {

        List<Double> temperaturesList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            temperaturesList.add(temperature.getValue());
        }
        Collections.sort(temperaturesList);

        int middleValue = temperaturesList.size() / 2;

        if(temperaturesList.size() % 2 == 0) {
            return 0.5 * temperaturesList.get(middleValue).doubleValue() +
                    temperaturesList.get(middleValue - 1).doubleValue();
        } else {
            return temperaturesList.get(middleValue).doubleValue();
        }
    }
}