package org.towfeeq.SOLIDPriciples.OCP.Problem;


// next, if we need to add new payment method, we need to modify exiting code, which is bad practice
public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount){
        if(paymentMethod.equals("CreditCard")){
            // business logic
            System.out.println("Making payment via " + paymentMethod + ": " + amount);

        }else if(paymentMethod.equals("DebitCard")){
            // business logic
            System.out.println("Making payment via " + paymentMethod + ": " + amount);

        }else if(paymentMethod.equals("Paypal")){
            // business logic
            System.out.println("Making payment via " + paymentMethod + ": " + amount);

        }else {
            throw new IllegalArgumentException("Unsupported payment method " + paymentMethod);
        }
    }
}
