package dev.marcelomarinho.dio.labproject.designpatterns.structural.adapter;

public class WeatherDataFahrenheit {

    private Integer degreesInFahrenheit;
    private Integer humidity;

    public Integer getDegreesInFahrenheit() {
        return degreesInFahrenheit;
    }

    public void setDegreesInFahrenheit(Integer degreesInFahrenheit) {
        this.degreesInFahrenheit = degreesInFahrenheit;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
}
