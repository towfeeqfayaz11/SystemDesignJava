package org.towfeeq.DesignPatterns.StructuralPatterns.AdapterPattern.Problem;

/*
Problem: Payment Integration Without Adapter Pattern
Here's the scenario:
    The e-commerce platform already integrates with ExistingPaymentGateway. Now you want to add the NewPaymentProvider,
    but their interfaces are incompatible.

Issues Without Adapter Pattern
    Interface Incompatibility:
        - The client code cannot use the NewPaymentProvider in the same way as the ExistingPaymentGateway.
    Code Duplication:
        - Every time you want to add a new provider, you would need to write specific logic for each
          provider in the client code.
    Tight Coupling:
        - The client code becomes tightly coupled to specific implementations, making future integrations harder.
*/

// Existing Payment Gateway
// This works fine with the platform.
class ExistingPaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using Existing Payment Gateway.");
    }
}

// New Payment Provider
// This has a different interface, making it incompatible with the platform.
class NewPaymentProvider {
    public void sendPayment(double amount, String currency) {
        System.out.println("Payment of " + amount + " " + currency + " processed using New Payment Provider.");
    }
}


// Client Code (E-commerce Platform)
// The platform expects all payment processors to use a uniform method,
// processPayment(double amount), but that is not the case currently as
// each payment gateway has its own payment method, thus no uniformity on client side to handle this
public class WithoutAdapterPattern {
    public static void main(String[] args) {
        // Using Existing Payment Gateway
        ExistingPaymentGateway gateway = new ExistingPaymentGateway();
        gateway.makePayment(100.0);

        // Using New Payment Provider directly (this required chanages on client side)
        NewPaymentProvider newProvider = new NewPaymentProvider();
        newProvider.sendPayment(150.0, "USD"); // This requires a different method call
    }
}
