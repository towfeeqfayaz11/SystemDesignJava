package org.towfeeq.DesignPatterns.BehaviouralPatterns.CommandPattern.Solution;

/*
Invoker: The Invoker (RemoteControl) interacts with the command interface to execute operations,
         decoupling the client from the receiver.

Purpose: Stores and invokes commands. It does not directly perform any action but
         triggers the execute method of the command.

*/
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set!");
        }
    }
}

