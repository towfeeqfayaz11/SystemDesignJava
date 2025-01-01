package org.towfeeq.DesignPatterns.BehaviouralPatterns.ChainOfResponsibilityPattern.Solution;

// Step 3: Assemble the Chain

public class WithCoRPattern {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler helpDesk = new HelpDesk();
        SupportHandler technicalTeam = new TechnicalTeam();
        SupportHandler manager = new Manager();

        // Set up the chain
        helpDesk.setNextHandler(technicalTeam);
        technicalTeam.setNextHandler(manager);

        // Process requests
        helpDesk.handleRequest("basic");
        helpDesk.handleRequest("technical");
        helpDesk.handleRequest("escalation");
        helpDesk.handleRequest("unknown");
    }
}
