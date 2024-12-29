package org.towfeeq.DesignPatterns.BehaviouralPatterns.ObserverPattern.Solution;

// Concrete Observer
class PhoneDisplay implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("PhoneDisplay: Temperature updated to " + temperature + "°C");
    }
}
