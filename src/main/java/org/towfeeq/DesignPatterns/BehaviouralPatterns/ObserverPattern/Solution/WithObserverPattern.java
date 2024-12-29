package org.towfeeq.DesignPatterns.BehaviouralPatterns.ObserverPattern.Solution;


/*
Solution: Using Observer Pattern
The Observer Pattern automates the update process, decoupling the subject and observers.


Key Takeaways
- The Observer Pattern automates the process of notifying all dependent objects when a state change occurs.
- The Subject maintains a list of observers and notifies them of updates, while Observers define their
  reaction to updates.
- This pattern is widely used in event-driven programming, real-time updates, and distributed systems.
*/
public class WithObserverPattern {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phone = new PhoneDisplay();
        LaptopDisplay laptop = new LaptopDisplay();

        station.addObserver(phone);
        station.addObserver(laptop);

        // Update temperature
        station.setTemperature(25);

        // Another update
        station.setTemperature(30);

        // Remove an observer
        station.removeObserver(phone);

        // Final update
        station.setTemperature(35);
    }
}