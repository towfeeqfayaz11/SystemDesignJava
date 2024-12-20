package org.towfeeq.DesignPatterns.CreationalPatterns.SingletonPattern.Problem;

import org.towfeeq.DesignPatterns.CreationalPatterns.SingletonPattern.Problem.DatabaseConnectionManager;

public class WithoutSingletonPattern {
    public static void main(String[] args) {
        DatabaseConnectionManager dbManager1 = new DatabaseConnectionManager();

        DatabaseConnectionManager dbManager2 = new DatabaseConnectionManager();

        if(dbManager1 == dbManager2) {
            System.out.println("Both instances are same");
        }else{
            System.out.println("Both instances are different");
        }
    }
}
