package org.towfeeq.DesignPatterns.StructuralPatterns.AdapterPattern.Solution;

// Step 1: Target Interface
interface PaymentProcessor {
    void processPayment(double amount);
}


// Existing Payment Gateway
class ExistingPaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using Existing Payment Gateway.");
    }
}
// Step 2: Existing Payment Gateway (Adaptee)
// Existing Payment Gateway Adapter
class ExistingPaymentGatewayAdapter implements PaymentProcessor {
    private ExistingPaymentGateway gateway;

    public ExistingPaymentGatewayAdapter(ExistingPaymentGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        gateway.makePayment(amount);
    }
}


// New Payment Provider
class NewPaymentProvider {
    public void sendPayment(double amount, String currency) {
        System.out.println("Payment of " + amount + " " + currency + " processed using New Payment Provider.");
    }
}
// Step 3: New Payment Provider (Adaptee)
// New Payment Provider Adapter
class NewPaymentProviderAdapter implements PaymentProcessor {
    private NewPaymentProvider provider;

    public NewPaymentProviderAdapter(NewPaymentProvider provider) {
        this.provider = provider;
    }

    @Override
    public void processPayment(double amount) {
        provider.sendPayment(amount, "USD");
    }
}

// Step 4: Client Code
// Now, The platform remains unchanged and interacts only with the PaymentProcessor interface.

public class WithAdapterPattern {
    public static void main(String[] args) {
        // Using Existing Payment Gateway through Adapter
        PaymentProcessor existingProcessor = new ExistingPaymentGatewayAdapter(new ExistingPaymentGateway());
        existingProcessor.processPayment(100.0);

        // Using New Payment Provider through Adapter
        PaymentProcessor newProcessor = new NewPaymentProviderAdapter(new NewPaymentProvider());
        newProcessor.processPayment(150.0);
    }
}
