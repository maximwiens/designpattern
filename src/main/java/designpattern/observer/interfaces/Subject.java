package designpattern.observer.interfaces;

public interface Subject {
    public void registerObserver(Observer observer);
    public void unRegisterObserver(Observer observer);
    public void informObserver();
}
