package designpattern.observer.classes;

import designpattern.observer.interfaces.Observer;
import designpattern.observer.interfaces.ShowElement;

public class Subscriber implements Observer, ShowElement {

    private float temp;
    private float hum;
    private WeatherData weatherData;

    public Subscriber(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void refresh(float temp, float hum, float press) {
        this.hum = hum;
        this.temp = temp;
        show();
    }

    @Override
    public void show() {
        System.out.println("Aktuelle Wetterbedingungen: " + temp + " Grad C und " + hum + "% Feuchtigkeit");
    }
}
