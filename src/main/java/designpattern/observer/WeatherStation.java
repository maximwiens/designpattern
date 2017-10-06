package designpattern.observer;

import designpattern.observer.classes.Forecast;
import designpattern.observer.classes.Statistics;
import designpattern.observer.classes.Subscriber;
import designpattern.observer.classes.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Subscriber subscriber = new Subscriber(weatherData);
        Statistics statistics = new Statistics(weatherData);
        Forecast forecast = new Forecast(weatherData);
        weatherData.setMesswerte(30, 65,30.4f);
        weatherData.setMesswerte(32, 70,29.2f);
        weatherData.setMesswerte(28, 90, 30.4f);
        weatherData.setMesswerte(28, 90, 30.4f);
    }
}