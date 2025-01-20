package org.towfeeq.SOLIDPriciples.OCP.Solution;

public class PaymentProcessor {
    public void processPayment(IPaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}
