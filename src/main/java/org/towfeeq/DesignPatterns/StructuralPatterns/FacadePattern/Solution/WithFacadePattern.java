package org.towfeeq.DesignPatterns.StructuralPatterns.FacadePattern.Solution;

/*
Solution Using the Facade Pattern
Facade Design
    We create a HomeAutomationFacade class that encapsulates the subsystem classes and provides a simplified
    interface for the client.

How the Facade Solves the Problem
    Simplification: The client interacts with a single HomeAutomationFacade class instead of multiple subsystem classes.
    Decoupling: The client is no longer tightly coupled to the subsystem implementations.
    Reuse: Common operations (like morning and night routines) are encapsulated in the facade, reducing redundancy.
*/

// Subsystem classes
class Lights {
    public void turnOn() {
        System.out.println("Lights are ON");
    }

    public void turnOff() {
        System.out.println("Lights are OFF");
    }
}

class Security {
    public void arm() {
        System.out.println("Security system ARMED");
    }

    public void disarm() {
        System.out.println("Security system DISARMED");
    }
}

class AirConditioning {
    public void setTemperature(int temp) {
        System.out.println("Air conditioning set to " + temp + " degrees");
    }
}

class Entertainment {
    public void playMusic(String song) {
        System.out.println("Playing: " + song);
    }
}


// Facade class
class HomeAutomationFacade {
    private Lights lights;
    private Security security;
    private AirConditioning ac;
    private Entertainment entertainment;

    public HomeAutomationFacade() {
        this.lights = new Lights();
        this.security = new Security();
        this.ac = new AirConditioning();
        this.entertainment = new Entertainment();
    }

    public void activateMorningRoutine() {
        lights.turnOn();
        security.disarm();
        ac.setTemperature(22);
        entertainment.playMusic("Morning Playlist");
        System.out.println("Morning routine activated.");
    }

    public void activateNightRoutine() {
        lights.turnOff();
        security.arm();
        ac.setTemperature(18);
        System.out.println("Night routine activated.");
    }
}


// Client Code
public class WithFacadePattern {
    public static void main(String[] args) {
        HomeAutomationFacade facade = new HomeAutomationFacade();

        // Client uses the simplified interface
        facade.activateMorningRoutine();
        facade.activateNightRoutine();
    }
}
