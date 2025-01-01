package org.towfeeq.DesignPatterns.BehaviouralPatterns.ChainOfResponsibilityPattern.Problem;

/*
Problems:
    - Hard to add new handlers.
    - Code is not reusable or flexible.
    - Every handler's logic resides in one place.
*/

public class WithoutCoRPattern {
    public static void main(String[] args) {
        CustomerSupport support = new CustomerSupport();
        support.handleRequest("basic");
        support.handleRequest("escalation");
    }
}
