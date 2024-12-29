package org.towfeeq.DesignPatterns.BehaviouralPatterns.ObserverPattern.Solution;

import java.util.ArrayList;
import java.util.List;


interface Subject { // can also be an abstract class
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
// Define the Subject Class
class WeatherStation implements Subject{
    private int temperature;
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(int newTemperature) {
        temperature = newTemperature;
        System.out.println("WeatherStation: Temperature updated to " + temperature + "°C");
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}