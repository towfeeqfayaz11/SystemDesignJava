package org.towfeeq.DesignPatterns.BehaviouralPatterns.ObserverPattern.Solution;

// Concrete Observer
class LaptopDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("LaptopDisplay: Temperature updated to " + temperature + "°C");
    }
}
