package org.towfeeq.DesignPatterns.BehaviouralPatterns.StatePattern.Solution;

public class Train implements TransportationMode{

    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Train)");
        return 2; // example ETA for train
    }

    @Override
    public String getDirection() {
        return "Directions for train";
    }
}
