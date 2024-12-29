package org.towfeeq.DesignPatterns.BehaviouralPatterns.CommandPattern.Solution;

/*
Receiver: Fan class is the receiver here
Purpose: Knows how to perform the actual work when a command calls its methods.

Fan: Provides methods like start() and stop()

The Receiver performs the real business logic when invoked by the command.
*/
class Fan {
    public void start() {
        System.out.println("Fan is started");
    }

    public void stop() {
        System.out.println("Fan is stopped");
    }
}


/*
Concrete Command:

Purpose: Implements the Command interface and defines the binding between the
         Receiver (device) and the specific action.

In the Code:
Each concrete command encapsulates an action for a specific receiver:
    StartFanCommand: Encapsulates the action to start the fan.
    StopFanCommand: Encapsulates the action to stop the fan.
*/

class StartFanCommand implements Command {
    private Fan fan;

    public StartFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.start();
    }
}

class StopFanCommand implements Command {
    private Fan fan;

    public StopFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stop();
    }
}