package org.towfeeq.DesignPatterns.CreationalPatterns.FactoryPattern.Solution;

// Step 4: Main Class (Client Code)

public class WithFactoryPattern {
    public static void main(String[] args) {
        // Client code does not know about concrete classes
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        /*
        This is not called tight coupling, as in this case this can be taken care
        dynamically at runtime as well using config based calling
        */
        // Adding a new shape requires only modifying the Factory
        // Shape triangle = ShapeFactory.getShape("TRIANGLE");
    }
}
