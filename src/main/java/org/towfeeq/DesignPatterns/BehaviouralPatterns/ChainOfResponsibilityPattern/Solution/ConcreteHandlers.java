package org.towfeeq.DesignPatterns.BehaviouralPatterns.ChainOfResponsibilityPattern.Solution;

// Step 2: Implement Concrete Handlers

class HelpDesk extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if ("basic".equals(issue)) {
            System.out.println("Help Desk: Handling basic query.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

class TechnicalTeam extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if ("technical".equals(issue)) {
            System.out.println("Technical Team: Resolving technical issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

class Manager extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if ("escalation".equals(issue)) {
            System.out.println("Manager: Handling escalated issue.");
        } else {
            System.out.println("Unknown issue: Unable to process.");
        }
    }
}
