package org.towfeeq.DesignPatterns.StructuralPatterns.BridgePattern.Solution;


// Implementor Interface
// Implementor: this is the interface or abstract class that defines the abstract methods or operations
//              that the concrete implementors must implement
interface Device {
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}

// Define concrete implementors
// These are concrete classes that implement the Implementor interface and provide actual implementations
// of the methods defined in the Implementor.

// Concrete Implementor for TV
class TV implements Device {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}

// Concrete Implementor for Radio
class Radio implements Device {
    @Override
    public void turnOn() {
        System.out.println("Radio is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is turned OFF");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }
}

// Define the Abstraction
// This is the high-level interface that defines the abstract methods or operations that the clients will use.

// Abstraction
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn();

    public abstract void turnOff();
}

// Create concrete abstractions
// These are concrete classes that extend the Abstraction and use an Implementor to perform specific operations.

// Refined Abstraction for Basic Remote
class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }
}

// Refined Abstraction for Advanced Remote
class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
        System.out.println("Advanced remote features activated");
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    public void setVolume(int volume) {
        device.setVolume(volume);
    }
}


// client code
public class WithBridgePattern {
    public static void main(String[] args) {
        // Using Basic Remote for TV
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemoteControl(tv);
        basicRemote.turnOn();
        basicRemote.turnOff();

        // Using Advanced Remote for Radio
        Device radio = new Radio();
        AdvancedRemoteControl advancedRemote = new AdvancedRemoteControl(radio);
        advancedRemote.turnOn();
        advancedRemote.setVolume(30);
        advancedRemote.turnOff();
    }
}
