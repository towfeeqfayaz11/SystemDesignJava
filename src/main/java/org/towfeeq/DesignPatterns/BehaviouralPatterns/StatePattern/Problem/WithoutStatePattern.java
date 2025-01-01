package org.towfeeq.DesignPatterns.BehaviouralPatterns.StatePattern.Problem;

/*
Problems in current implementation:
    Tight coupling and Complex Conditional logic:
        - The DirectionService likely uses conditional statements (if-else or switch-case)
          based on transportation mode enums to determine how to calculate ETA and
          provide directions.
        - As the number of transportation modes increases, the conditional logic becomes more
          complex and harder to maintain
    Violation of the open/closed principle:
        - adding new transportation modes (e.g; airplane, boat) requires modifying
          the existing DirectionService class, which gos against the open/closed principle
          (classes should be open for extension but closed for modification)
*/

// client code
public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportationMode.TRAIN);
        directionService.setMode(TransportationMode.CYCLING);
        directionService.getETA();
        System.out.println(directionService.getDirection());
    }
}
