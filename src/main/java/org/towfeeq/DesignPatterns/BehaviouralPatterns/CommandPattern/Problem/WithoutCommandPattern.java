package org.towfeeq.DesignPatterns.BehaviouralPatterns.CommandPattern.Problem;

/*
Imagine a remote control system where buttons directly call methods on specific devices
like a TV or a Fan. This tightly couples the remote to the devices.

Problems:
    - Tight Coupling: The client (main) directly interacts with the TV and Fan classes.
    - Hard to Extend: Adding new devices or actions would require changes in the client.
    - No Flexibility: It’s not easy to queue, log, or undo operations.

*/

class TV {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

class Fan {
    public void start() {
        System.out.println("Fan is started");
    }

    public void stop() {
        System.out.println("Fan is stopped");
    }
}

public class WithoutCommandPattern {
    public static void main(String[] args) {
        TV tv = new TV();
        Fan fan = new Fan();

        // Direct method calls (tight coupling)
        tv.turnOn();
        fan.start();
        tv.turnOff();
        fan.stop();
    }
}
