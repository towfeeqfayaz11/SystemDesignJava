package org.towfeeq.DesignPatterns.StructuralPatterns.DecoratorPattern.Solution;

// Base Class (Component):
abstract class Beverage {
    public abstract String getDescription();
    public abstract double getCost();
}

// Concrete Class (Concrete component):
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

// Decorator Base Class:
abstract class BeverageDecorator extends Beverage {
    protected Beverage beverage; // Reference to the base component

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}

// Concrete Decorators:

// Milk Decorator
class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 1.5;
    }
}

// Sugar Decorator
class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}

// Caramel Decorator
class CaramelDecorator extends BeverageDecorator {
    public CaramelDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 2.0;
    }
}


public class WIthDecoratorPattern {
    public static void main(String[] args) {
        // Base beverage
        Beverage coffee = new Coffee();

        // Adding Milk
        coffee = new MilkDecorator(coffee);

        // Adding Sugar
        coffee = new SugarDecorator(coffee);

        // Adding Caramel
        coffee = new CaramelDecorator(coffee);

        // Final Order
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());
    }
}
