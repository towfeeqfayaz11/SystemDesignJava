package org.towfeeq.DesignPatterns.BehaviouralPatterns.StrategyPattern.Solution;

// Implement Concrete Strategies
public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
