package com.github.mritunjayr.behavioral.observer.youtubeChannel;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
