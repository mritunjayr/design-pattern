package com.github.mritunjayr.behavioral.observer.weatherApp;

public interface Subject {
    public  void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public  void notifyObservers();
}
