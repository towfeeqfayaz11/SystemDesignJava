package org.towfeeq.DesignPatterns.CreationalPatterns.SingletonPattern.Solution;

public class WithSingletonPattern {
    public static void main(String[] args) {
        DatabaseConnectionManager dbManager1 = DatabaseConnectionManager.getInstance();

        DatabaseConnectionManager dbManager2 = DatabaseConnectionManager.getInstance();

        if(dbManager1 == dbManager2) {
            System.out.println("Both instances are same");
        }else{
            System.out.println("Both instances are different");
        }
    }
}
