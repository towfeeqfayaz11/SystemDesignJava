package org.towfeeq.DesignPatterns.StructuralPatterns.DecoratorPattern.Problem;

/*
Problem Code (Without Decorator Pattern)
Scenario: A coffee shop offers beverages (e.g., coffee), and customers can add various toppings
          (e.g., milk, sugar, caramel). Without the decorator pattern, adding every combination of
          toppings leads to many subclasses.
*/

// Base class
abstract class Beverage {
    public abstract String getDescription();
    public abstract double getCost();
}

// Concrete class
class Coffee extends Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}

// Adding Toppings Without Decorator Pattern:

// Subclass for Coffee with Milk
class CoffeeWithMilk extends Coffee {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}

// Subclass for Coffee with Milk and Sugar
class CoffeeWithMilkAndSugar extends CoffeeWithMilk {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}


public class WithoutDecoratorPattern {
    public static void main(String[] args) {
        Beverage coffee = new CoffeeWithMilkAndSugar();
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        /*
            Problems Without the Decorator Pattern:
            Class Explosion: Every combination of toppings requires a new subclass
                             (CoffeeWithMilkAndSugar, CoffeeWithCaramelAndSugar, etc.).
            Lack of Flexibility: Adding or changing toppings requires modifying the class hierarchy.
            Code Duplication: Common behavior across subclasses is duplicated.
        */
    }
}
