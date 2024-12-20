package org.towfeeq.DesignPatterns.CreationalPatterns.SingletonPattern.Solution;

class DatabaseConnectionManager {

    // step2: private static instance
    private static DatabaseConnectionManager instance;

    // step1: private constructor to prevent instantiation
    private DatabaseConnectionManager() {
        System.out.println("Database connection manager initialized");
    }

    // step3: public static method to provide access to the instance
    public static DatabaseConnectionManager getInstance() {
        // lock for multiple threads (class level synchronization)
        synchronized (DatabaseConnectionManager.class) {
            if( instance == null) {
                instance = new DatabaseConnectionManager();
            }
        }
        return instance;
    }

    // example method to demonstrate connect to db functionality
    public void connect() {
        System.out.println("Connected to database...");
    }

    // example method to demonstrate close connection to db functionality
    public void disconnect() {
        System.out.println("Disconnected from database...");
    }
}