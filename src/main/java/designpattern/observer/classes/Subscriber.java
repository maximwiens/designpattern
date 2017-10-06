package designpattern.observer.classes;

import designpattern.observer.interfaces.Observer;
import designpattern.observer.interfaces.ShowElement;

import java.util.logging.Logger;

public class Subscriber implements Observer, ShowElement {

    private float temp;
    private float hum;
    private WeatherData weatherData;
    private Logger logger = Logger.getLogger(Subscriber.class.getName());

    public Subscriber(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void refresh(float temp, float hum, float press) {
        this.hum = hum;
        this.temp = temp;
        show();
    }

    @Override
    public void show() {
        logger.info(()->"Aktuelle Wetterbedingungen: " + temp + " Grad C und " + hum + "% Feuchtigkeit");
    }
}
