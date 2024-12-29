package org.towfeeq.DesignPatterns.BehaviouralPatterns.CommandPattern.Solution;

/*
Receiver: TV class is the receiver here
Purpose: Knows how to perform the actual work when a command calls its methods.

TV: Provides methods like turnOn() and turnOff()

The Receiver performs the real business logic when invoked by the command.
*/
class TV {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}


/*
Concrete Command:

Purpose: Implements the Command interface and defines the binding between the Receiver(device)
         and the specific action.

In the Code:
Each concrete command encapsulates an action for a specific receiver:
    TurnOnTVCommand: Encapsulates the action to turn the TV on.
    TurnOffTVCommand: Encapsulates the action to turn the TV off.
*/

class TurnOnTVCommand implements Command {
    private TV tv;

    public TurnOnTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}


class TurnOffTVCommand implements Command {
    private TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}