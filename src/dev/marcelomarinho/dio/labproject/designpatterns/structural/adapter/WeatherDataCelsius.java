package dev.marcelomarinho.dio.labproject.designpatterns.structural.adapter;

public class WeatherDataCelsius {

    private Integer degreesInCelsius;
    private Integer humidity;

    public Integer getDegreesInCelsius() {
        return degreesInCelsius;
    }

    public void setDegreesInCelsius(Integer degreesInCelsius) {
        this.degreesInCelsius = degreesInCelsius;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
}
