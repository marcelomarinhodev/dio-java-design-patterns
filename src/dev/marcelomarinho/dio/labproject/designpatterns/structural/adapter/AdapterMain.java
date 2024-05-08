package dev.marcelomarinho.dio.labproject.designpatterns.structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {

        WeatherDataCelsius dataCelsius = new WeatherDataCelsius();
        dataCelsius.setDegreesInCelsius(25);
        dataCelsius.setHumidity(50);

        // The Forecast Services expects the data to contain degrees info in Celsius
        ForecastWeatherService service = new ForecastWeatherService();
        service.printForecast(dataCelsius);

        WeatherDataFahrenheit dataFahrenheit = new WeatherDataFahrenheit();
        dataFahrenheit.setDegreesInFahrenheit(77);
        dataFahrenheit.setHumidity(50);

        // We can use an adapter to convert data from another source in Fahrenheit to Celsius
        // and use our Forecast Service methods
        WeatherDataCelsius dataFahrenheitAdapter = new WeatherDataFahrenheitAdapter(dataFahrenheit);
        service.printForecast(dataFahrenheitAdapter);

    }

}
