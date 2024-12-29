package org.towfeeq.DesignPatterns.BehaviouralPatterns.StrategyPattern.Solution;

/*
Create the Context Class

The PaymentProcessor class uses a PaymentStrategy to process payments.
This allows for dynamic selection of payment methods.
*/
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    // Allows dynamic strategy selection
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set!");
        }
        paymentStrategy.pay(amount);
    }
}
