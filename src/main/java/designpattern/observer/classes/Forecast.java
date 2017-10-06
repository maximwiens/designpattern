package designpattern.observer.classes;

import designpattern.observer.interfaces.Observer;
import designpattern.observer.interfaces.ShowElement;

import java.util.logging.Logger;

public class Forecast implements Observer, ShowElement {

    private float presCurr = 29.9f;
    private float presLast;
    private WeatherData weatherData;
    private Logger logger = Logger.getLogger(Statistics.class.getName());

    public Forecast(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void refresh(float temp, float hum, float press) {
        this.presLast=this.presCurr;
        this.presCurr = press;
        show();
    }

    @Override
    public void show() {
    if(this.presCurr<presLast){
        logger.info("Vorhersage: Gehen Sie von kälterem, regnerischem Wetter aus.");

    }  else if (this.presLast==this.presCurr){
        logger.info("Vorhersage: Wetter geht weiter so.");
    }else{
        logger.info("Vorhersage: Wetterbesserung in Sicht.");
    }

    }
}
