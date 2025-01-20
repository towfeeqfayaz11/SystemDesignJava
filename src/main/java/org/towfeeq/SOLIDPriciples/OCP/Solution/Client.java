package org.towfeeq.SOLIDPriciples.OCP.Solution;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        IPaymentMethod creditCard = new CreditCard();
        // without modifying the PaymentProcessor, we can add new payment methods with this approach
        // thus following open closed principle

        processor.processPayment(creditCard, 100);
    }
}
