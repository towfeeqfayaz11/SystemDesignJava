package org.towfeeq.DesignPatterns.BehaviouralPatterns.NullObjectPattern.Solution;


/*
Key Takeaways
    - The Null Object Pattern replaces null references with an object that performs no operation
      but adheres to the same interface or base class.
    - Eliminates the need for explicit null checks, reducing the risk of NullPointerExceptions.
    - Particularly useful in scenarios where null references are common, and their handling logic
      is predictable and repetitive.
*/
// Step 1: Define an Abstract Class or Interface
abstract class Customer {
    abstract String getName();
    abstract boolean isNull();
}

// Step 2: Implement the Real Object
class RealCustomer extends Customer {
    private String name;

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    boolean isNull() {
        return false;
    }
}

// Step 3: Implement the Null Object
class NullCustomer extends Customer {
    @Override
    String getName() {
        return "No customer available.";
    }

    @Override
    boolean isNull() {
        return true;
    }
}

// Step 4: Factory to Return Real or Null Object
class CustomerFactory {
    public static Customer getCustomer(String name) {
        if (name != null && !name.isEmpty()) {
            return new RealCustomer(name);
        } else {
            return new NullCustomer();
        }
    }
}

// Step 5: Client Code
public class WithNullObjectPattern {
    public static void main(String[] args) {
        Customer customer1 = CustomerFactory.getCustomer("Alice");
        Customer customer2 = CustomerFactory.getCustomer(null);

        System.out.println("Customer 1: " + customer1.getName());
        System.out.println("Customer 2: " + customer2.getName());
    }
}
