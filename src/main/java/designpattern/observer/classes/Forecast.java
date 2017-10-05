package designpattern.observer.classes;

import designpattern.observer.interfaces.Observer;
import designpattern.observer.interfaces.ShowElement;

public class Forecast implements Observer, ShowElement {

    @Override
    public void refresh(float temp, float hum, float press) {

    }

    @Override
    public void show() {

    }
}
