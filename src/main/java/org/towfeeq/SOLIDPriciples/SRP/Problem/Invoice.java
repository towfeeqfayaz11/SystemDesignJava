package org.towfeeq.SOLIDPriciples.SRP.Problem;

public class Invoice {
    final private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    // Multiple Responsibilities

    public void generateInvoice(){
        System.out.println("Invoice generated and printed for amount " + amount);
    }

    public void saveToDatabase(){
        System.out.println(" Saving Invoice to database");
    }

    public void sendEmailNotification(){
        System.out.println("Sending email notification for Invoice");
    }
}
