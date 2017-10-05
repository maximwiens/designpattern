package designpattern.observer.classes;

import designpattern.observer.interfaces.Observer;
import designpattern.observer.interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> subscriber;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        subscriber= new ArrayList();
    }

    public void registerObserver(Observer observer) {
        subscriber.add(observer);
    }

    public void unRegisterObserver(Observer observer) {
        subscriber.remove(observer);
    }

    public void informObserver() {
        for (Observer s: subscriber) {
            s.refresh(temperature,humidity,pressure);
        }
    }

    public void refreshValues(){
        this.informObserver();
    }

    public void setMesswerte(float temp,float hum,float press){
        this.humidity = hum;
        this.temperature=temp;
        this.pressure=press;
        this.refreshValues();
    }
}
