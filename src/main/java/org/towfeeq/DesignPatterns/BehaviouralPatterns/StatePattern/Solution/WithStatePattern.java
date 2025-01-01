package org.towfeeq.DesignPatterns.BehaviouralPatterns.StatePattern.Solution;

public class WithStatePattern {
    public static void main(String[] args) {
        DirectionService ds = new DirectionService(new Car());

        ds.setTransportationMode(new Cycling());

        System.out.println("ETA: " + ds.getETA());
        System.out.println("Direction: " + ds.getDirection());
    }
}
