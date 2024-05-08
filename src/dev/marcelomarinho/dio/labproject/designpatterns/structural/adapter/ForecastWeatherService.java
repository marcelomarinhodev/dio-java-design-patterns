package dev.marcelomarinho.dio.labproject.designpatterns.structural.adapter;

public class ForecastWeatherService {

    public void printForecast(WeatherDataCelsius dataCelsius) {
        System.out.printf("The forecast for today is %dºC and %d%% humidity.%n",
                dataCelsius.getDegreesInCelsius(), dataCelsius.getHumidity());
    }

}
