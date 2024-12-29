package org.towfeeq.DesignPatterns.BehaviouralPatterns.CommandPattern.Solution;



/*
Client
Purpose: Configures the commands and associates them with the invoker.
         It also initializes the receivers.


The Client:
    - Instantiates the Receiver objects (TV and Fan).
    - Creates ConcreteCommand objects and associates them with the appropriate receivers.
    - Sets commands in the Invoker (RemoteControl) and triggers the execution.
*/
public class WithCommandPattern {
    public static void main(String[] args) {
        TV tv = new TV();
        Fan fan = new Fan();

        // Create commands
        Command turnOnTV = new TurnOnTVCommand(tv);
        Command turnOffTV = new TurnOffTVCommand(tv);
        Command startFan = new StartFanCommand(fan);
        Command stopFan = new StopFanCommand(fan);

        // Set and execute commands using the remote control
        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnTV);
        remote.pressButton();

        remote.setCommand(startFan);
        remote.pressButton();

        remote.setCommand(turnOffTV);
        remote.pressButton();

        remote.setCommand(stopFan);
        remote.pressButton();
    }
}

/*
Key Takeaways
    Decoupling: The client (remote) is decoupled from the devices (TV, Fan).
    Extensibility: Adding new commands (e.g., a new device) requires creating a new class
                   without modifying existing code.
    Undo Support: To support undo, each command can define an undo method.

*/