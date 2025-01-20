package org.towfeeq.SOLIDPriciples.OCP.Solution;

public class DebitCard implements IPaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via DebitCard");
    }
}
