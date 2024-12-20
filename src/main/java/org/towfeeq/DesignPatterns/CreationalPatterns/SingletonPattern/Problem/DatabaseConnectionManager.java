package org.towfeeq.DesignPatterns.CreationalPatterns.SingletonPattern.Problem;

public class DatabaseConnectionManager {

    // Public constructor to allow instantiation
    public DatabaseConnectionManager() {
        System.out.println("Database connection manager initialized");
    }

    // Example method to demonstrate connecting to the database
    public void connect() {
        System.out.println("Connected to database...");
    }

    // Example method to demonstrate disconnecting from the database
    public void disconnect() {
        System.out.println("Disconnected from database...");
    }
}
