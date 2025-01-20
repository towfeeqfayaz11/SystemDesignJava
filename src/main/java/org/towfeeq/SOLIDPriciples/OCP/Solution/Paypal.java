package org.towfeeq.SOLIDPriciples.OCP.Solution;

public class Paypal implements IPaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via Paypal");
    }
}
