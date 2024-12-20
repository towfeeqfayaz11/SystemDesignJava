package org.towfeeq.DesignPatterns.CreationalPatterns.FactoryPattern.Problem;

// Client Code
// here the client code is tightly coupled with concrete classes
public class WithoutFactoryPattern {
    public static void main(String[] args) {
        Shape circle = new Circle();    // Direct instantiation
        circle.draw();

        Shape rectangle = new Rectangle();  // Direct instantiation
        rectangle.draw();

        /*
        this is called tight coupling with concrete classes, because this
        cannot be handled at runtime, rather would require code change on client
        side to instantiate new object on client side which needs redeployment of client
        side code
        */

        // Adding a new shape requires modifying the client code
        // Shape triangle = new Triangle(); // This would need changes here
    }
}
