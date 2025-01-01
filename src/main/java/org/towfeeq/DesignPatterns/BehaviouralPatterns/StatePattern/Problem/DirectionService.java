package org.towfeeq.DesignPatterns.BehaviouralPatterns.StatePattern.Problem;

enum TransportationMode {
    WALKING, CYCLING, CAR, TRAIN
}

public class DirectionService {
    private TransportationMode mode;

    public DirectionService (TransportationMode mode) {
        this.mode = mode;
    }

    public void setMode (TransportationMode mode) {
        this.mode = mode;
    }

    // methode to calculate ETA based on transportation mode
    public int getETA(){

        switch (mode){
            case WALKING:
                System.out.println("Cacl ETA for WALKING");
                return 10;
            case CYCLING:
                System.out.println("Cacl ETA for CYCLING");
                return 7;
            case CAR:
                System.out.println("Cacl ETA for CAR");
                return 4;
            case TRAIN:
                System.out.println("Cacl ETA for TRAIN");
                return 3;
            default:
                throw new IllegalArgumentException("Unknown mode");
        }

    }

    public String getDirection(){

        switch (mode){
            case WALKING:
                return "Directins for walking: head north for 500 meters";
            case CYCLING:
                return "Directins for cycling: take the bike lane on chruch street";
            case CAR:
                return "Directins for driving: use NH55 towards downtown";
            case TRAIN:
                return "Directins for train: Board the purple line at central station";
            default:
                return "No directions available for selected mode";
        }

    }
}
