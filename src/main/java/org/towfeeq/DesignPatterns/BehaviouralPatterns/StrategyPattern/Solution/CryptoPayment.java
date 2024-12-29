package org.towfeeq.DesignPatterns.BehaviouralPatterns.StrategyPattern.Solution;

// Implement Concrete Strategies
public class CryptoPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
