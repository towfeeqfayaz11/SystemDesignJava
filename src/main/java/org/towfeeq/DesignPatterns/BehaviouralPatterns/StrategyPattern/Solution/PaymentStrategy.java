package org.towfeeq.DesignPatterns.BehaviouralPatterns.StrategyPattern.Solution;

/*
Define the Strategy Interface
The PaymentStrategy interface declares the method that all payment strategies must implement.
*/
public interface PaymentStrategy {
    void pay(double amount);
}
