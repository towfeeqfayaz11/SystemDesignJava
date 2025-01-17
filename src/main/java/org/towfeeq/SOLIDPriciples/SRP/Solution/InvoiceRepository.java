package org.towfeeq.SOLIDPriciples.SRP.Solution;

// Single Responsibility

// purpose of this class is to do all database related operations
public class InvoiceRepository {
    public void saveToDatabase(){
        System.out.println(" Saving Invoice to database");
    }
}
