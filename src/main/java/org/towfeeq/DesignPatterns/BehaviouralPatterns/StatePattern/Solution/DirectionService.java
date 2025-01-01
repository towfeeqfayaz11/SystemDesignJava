package org.towfeeq.DesignPatterns.BehaviouralPatterns.StatePattern.Solution;

// context class
public class DirectionService {
    TransportationMode transportationMode;

    DirectionService (TransportationMode mode) {
        this.transportationMode = mode;
    }

    public void setTransportationMode (TransportationMode mode) {
        this.transportationMode = mode;
    }

    // delegate work to current state's concrete class
    public int getETA(){
        return transportationMode.calcETA();
    }

    public String getDirection(){
        return transportationMode.getDirection();
    }
}
