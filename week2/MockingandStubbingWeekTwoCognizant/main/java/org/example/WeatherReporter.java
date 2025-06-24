package org.example;

public class WeatherReporter {
    private final WeatherService service;

    public WeatherReporter(WeatherService service) {
        this.service = service;
    }

    public String generateReport(String city) {
        int temp = service.getTemperature(city);
        return "The temperature in " + city + " is " + temp + "°C";
    }
}
