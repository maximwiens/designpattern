package designpattern.observer.classes;

import designpattern.observer.interfaces.Observer;
import designpattern.observer.interfaces.ShowElement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Statistics implements Observer, ShowElement {
    private WeatherData weatherData;
    private ArrayList<Float> tempList;

    public Statistics(WeatherData weatherData) {
        this.tempList = new ArrayList<>();
        weatherData.registerObserver(this);
        this.weatherData = weatherData;

    }

    @Override
    public void refresh(float temp, float hum, float press) {
        this.tempList.add(temp);
        show();
    }

    @Override
    public void show() {
        System.out.println("Mit/Max/Min Temparatur = " + this.tempList.stream().mapToDouble(a -> a).average().getAsDouble() + "/" + this.tempList.stream().max(Comparator.naturalOrder()).get() + "/" + this.tempList.stream().min(Comparator.naturalOrder()).get());
    }
}
