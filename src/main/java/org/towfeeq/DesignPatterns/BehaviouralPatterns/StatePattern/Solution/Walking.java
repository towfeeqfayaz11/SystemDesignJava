package org.towfeeq.DesignPatterns.BehaviouralPatterns.StatePattern.Solution;

public class Walking implements TransportationMode{

    @Override
    public int calcETA() {
        System.out.println("Calculating ETA (Walking)");
        return 10; // example ETA for walking
    }

    @Override
    public String getDirection() {
        return "Directions for walking";
    }
}
