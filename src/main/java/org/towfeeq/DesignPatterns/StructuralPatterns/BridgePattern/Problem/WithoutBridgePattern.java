package org.towfeeq.DesignPatterns.StructuralPatterns.BridgePattern.Problem;

/*
Scenario Without the Bridge Pattern
    Problem Statement:
    Suppose we are building a system to control multiple devices like TVs and Radios. Each device has two types of remotes:
        - Basic Remote: Can only turn the device ON/OFF.
        - Advanced Remote: Can turn the device ON/OFF and adjust the volume.
    Without the Bridge Pattern, you'd create separate classes for every combination of device and remote type,
    resulting in a class explosion. Here's the complete example:


Problems in This Design:
    Class Explosion:
        - For every new combination of device and remote type, a new class is required.
        - Example: Adding a new SmartSpeaker device would require SmartSpeakerWithBasicRemote and SmartSpeakerWithAdvancedRemote.
    Tightly Coupled Design:
        - The remote functionality is tightly coupled with the device type. You cannot easily add new remote
          features or device types without modifying existing classes.
    Low Flexibility:
        - It's difficult to mix and match remote features and devices without creating new classes.
*/

// Basic Remote for TV
class TVWithBasicRemote {
    public void turnOn() {
        System.out.println("TV is turned ON with Basic Remote");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF with Basic Remote");
    }
}

// Advanced Remote for TV
class TVWithAdvancedRemote {
    public void turnOn() {
        System.out.println("TV is turned ON with Advanced Remote");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF with Advanced Remote");
    }

    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume + " with Advanced Remote");
    }
}

// Basic Remote for Radio
class RadioWithBasicRemote {
    public void turnOn() {
        System.out.println("Radio is turned ON with Basic Remote");
    }

    public void turnOff() {
        System.out.println("Radio is turned OFF with Basic Remote");
    }
}

// Advanced Remote for Radio
class RadioWithAdvancedRemote {
    public void turnOn() {
        System.out.println("Radio is turned ON with Advanced Remote");
    }

    public void turnOff() {
        System.out.println("Radio is turned OFF with Advanced Remote");
    }

    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume + " with Advanced Remote");
    }
}

// Client
public class WithoutBridgePattern {
    public static void main(String[] args) {
        // Using Basic Remote for TV
        TVWithBasicRemote tvBasicRemote = new TVWithBasicRemote();
        tvBasicRemote.turnOn();
        tvBasicRemote.turnOff();

        // Using Advanced Remote for Radio
        RadioWithAdvancedRemote radioAdvancedRemote = new RadioWithAdvancedRemote();
        radioAdvancedRemote.turnOn();
        radioAdvancedRemote.setVolume(20);
        radioAdvancedRemote.turnOff();
    }
}
