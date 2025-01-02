package org.towfeeq.DesignPatterns.BehaviouralPatterns.NullObjectPattern.Problem;

/*
This approach leads to:
    - Null checks everywhere, cluttering the code.
    - Potential null pointer exceptions if a null reference is accessed accidentally.
*/

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class WithoutNullObjectPattern {
    public static void main(String[] args) {
        Customer customer = null; // Customer is not available
        if (customer != null) {
            System.out.println(customer.getName());
        } else {
            System.out.println("No customer available.");
        }
    }
}
