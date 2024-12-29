package org.towfeeq.DesignPatterns.BehaviouralPatterns.ObserverPattern.Problem;

/*
Problem: Without Observer Pattern
Let’s say you have a WeatherStation that tracks temperature and displays it on two devices,
a phone and a laptop. Without the observer pattern, you must manually update all devices every
time the temperature changes.

Here, the updates are manual, tightly coupling the WeatherStation with each display.
*/

class WeatherStation {
    private int temperature;

    public void setTemperature(int newTemperature) {
        temperature = newTemperature;
        System.out.println("WeatherStation: Temperature updated to " + temperature + "°C");
    }

    public int getTemperature() {
        return temperature;
    }
}

class PhoneDisplay {
    public void update(int temperature) {
        System.out.println("PhoneDisplay: Temperature updated to " + temperature + "°C");
    }
}

class LaptopDisplay {
    public void update(int temperature) {
        System.out.println("LaptopDisplay: Temperature updated to " + temperature + "°C");
    }
}

public class WithoutObserverPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay phone = new PhoneDisplay();
        LaptopDisplay laptop = new LaptopDisplay();

        // Manually update devices
        station.setTemperature(25);
        phone.update(station.getTemperature());
        laptop.update(station.getTemperature());

        // Another manual update
        station.setTemperature(30);
        phone.update(station.getTemperature());
        laptop.update(station.getTemperature());
    }
}
