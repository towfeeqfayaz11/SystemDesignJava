package org.towfeeq.DesignPatterns.BehaviouralPatterns.StatePattern.Solution;

public class Car implements TransportationMode{

    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Driving)");
        return 5; // example ETA for driving
    }

    @Override
    public String getDirection() {
        return "Directions for driving";
    }
}
