package org.towfeeq.DesignPatterns.BehaviouralPatterns.StrategyPattern.Solution;

/*
Here’s how to use the strategy pattern to process payments dynamically.

Key Takeaways
- The Strategy Pattern eliminates conditional logic by encapsulating each algorithm into its own class.
- The Context Class interacts with the strategies through a common interface, enabling dynamic selection.
- This pattern is particularly useful in scenarios where algorithms may change or new ones need to be added frequently.
*/
public class WithStrategyPattern {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Use Credit Card payment
        processor.setPaymentStrategy(new CreditCardPayment());
        processor.processPayment(100.0);

        // Switch to PayPal payment
        processor.setPaymentStrategy(new PayPalPayment());
        processor.processPayment(200.0);

        // Switch to Cryptocurrency payment
        processor.setPaymentStrategy(new CryptoPayment());
        processor.processPayment(300.0);
    }
}
