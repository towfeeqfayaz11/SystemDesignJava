package org.towfeeq.DesignPatterns.BehaviouralPatterns.ChainOfResponsibilityPattern.Solution;

// Step 1: Define the Handler Interface
public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issue);
}
