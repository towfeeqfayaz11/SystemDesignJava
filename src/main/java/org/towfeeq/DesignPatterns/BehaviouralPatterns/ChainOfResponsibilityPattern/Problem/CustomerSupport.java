package org.towfeeq.DesignPatterns.BehaviouralPatterns.ChainOfResponsibilityPattern.Problem;

public class CustomerSupport {
    public void handleRequest(String issue) {
        if (issue.equals("basic")) {
            System.out.println("Help Desk: Handling basic query.");
        } else if (issue.equals("technical")) {
            System.out.println("Technical Team: Resolving technical issue.");
        } else if (issue.equals("escalation")) {
            System.out.println("Manager: Handling escalated issue.");
        } else {
            System.out.println("Unknown issue: Unable to process.");
        }
    }
}
