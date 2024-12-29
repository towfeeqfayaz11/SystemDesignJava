package org.towfeeq.DesignPatterns.BehaviouralPatterns.CommandPattern.Solution;

/*
Purpose: Declares the interface for all commands. Every concrete command must implement this interface.

This defines a standard structure for all commands, ensuring they provide an execute method.
*/
public interface Command {
    void execute();
}
