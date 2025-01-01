package org.towfeeq.DesignPatterns.BehaviouralPatterns.StatePattern.Solution;

public class Cycling implements TransportationMode{

    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Cycling)");
        return 7; // example ETA for cycling
    }

    @Override
    public String getDirection() {
        return "Directions for cycling";
    }
}