package dev.marcelomarinho.dio.labproject.designpatterns.structural.adapter;

public class WeatherDataFahrenheitAdapter extends WeatherDataCelsius {

    private final WeatherDataFahrenheit fahrenheitData;

    public WeatherDataFahrenheitAdapter(WeatherDataFahrenheit fahrenheitData) {
        this.fahrenheitData = fahrenheitData;
    }

    @Override
    public Integer getDegreesInCelsius() {
        return (this.fahrenheitData.getDegreesInFahrenheit() - 32) * 5/9;
    }

    @Override
    public Integer getHumidity() {
        return this.fahrenheitData.getHumidity();
    }
}
