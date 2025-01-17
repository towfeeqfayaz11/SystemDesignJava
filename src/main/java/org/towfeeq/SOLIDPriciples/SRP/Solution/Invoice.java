package org.towfeeq.SOLIDPriciples.SRP.Solution;

// Single Responsibility

public class Invoice {
    final private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    // Single Responsibility

    public void generateInvoice(){
        System.out.println("Invoice generated and printed for amount " + amount);
    }
}
