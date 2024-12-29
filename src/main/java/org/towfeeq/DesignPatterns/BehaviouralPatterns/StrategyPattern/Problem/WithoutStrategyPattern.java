package org.towfeeq.DesignPatterns.BehaviouralPatterns.StrategyPattern.Problem;


/*
Problem: Without Strategy Pattern
Imagine a program where a PaymentProcessor handles different payment methods.
Without the Strategy Pattern, you would use conditional logic to handle each payment method.


Problems:
- Adding a new payment method requires modifying PaymentProcessor (violates the Open-Closed Principle).
- Conditional logic grows as more payment methods are added.
- Testing individual payment methods is harder due to tightly coupled logic.
*/

class PaymentProcessor {
    public void processPayment(String paymentType, double amount) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment of $" + amount);
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (paymentType.equals("Crypto")) {
            System.out.println("Processing cryptocurrency payment of $" + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + paymentType);
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment("CreditCard", 100.0);
        processor.processPayment("PayPal", 200.0);
        processor.processPayment("Crypto", 300.0);
    }
}
