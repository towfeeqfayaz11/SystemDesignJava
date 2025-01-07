package org.towfeeq.DesignPatterns.StructuralPatterns.FacadePattern.Problem;

/*
Example: Without the Facade Pattern
Scenario
    A home automation system consists of multiple subsystems: Lights, Security, Air Conditioning, and Entertainment.
    The client must interact with each subsystem individually to perform tasks like turning on/off lights,
    arming/disarming security, adjusting air conditioning, or playing music.

Problems Without Facade
    Complexity: The client needs to interact with multiple classes and call specific methods on each one.
    Coupling: The client is tightly coupled to the subsystem implementations.
    Redundant Code: If multiple clients need similar functionality, duplicate code is likely.

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


// Client code
public class WithoutFacadePattern {
    public static void main(String[] args) {
        Lights lights = new Lights();
        Security security = new Security();
        AirConditioning ac = new AirConditioning();
        Entertainment entertainment = new Entertainment();

        // Client interacts with all subsystems individually
        lights.turnOn();
        security.arm();
        ac.setTemperature(22);
        entertainment.playMusic("Classical Symphony");
    }
}
