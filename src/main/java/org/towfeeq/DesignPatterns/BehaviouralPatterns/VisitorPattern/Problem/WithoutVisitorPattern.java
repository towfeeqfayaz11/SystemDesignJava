package org.towfeeq.DesignPatterns.BehaviouralPatterns.VisitorPattern.Problem;

/*
Problem:
Consider a Shape hierarchy with classes like Circle and Rectangle.
You need to perform different operations, like calculating area or rendering them on screen.
- Without the Visitor Pattern, you’d add new methods to each class for every new operation,
  tightly coupling the classes to the operations.
- Adding new operations would require modifying all classes, violating the Open/Closed Principle.

Problems with This Approach:
    - Violation of Open/Closed Principle: Adding a new operation (e.g., exporting the shape
      to a file) requires modifying all shape classes.
    - Lack of Scalability: The class hierarchy becomes cluttered with unrelated methods.
    - Tight Coupling: Shapes are tightly coupled to operations.

*/

abstract class Shape {
    abstract void calculateArea();
    abstract void render();
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    @Override
    void render() {
        System.out.println("Rendering Circle");
    }
}

class Rectangle extends Shape {
    private double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void calculateArea() {
        System.out.println("Rectangle Area: " + (width * height));
    }

    @Override
    void render() {
        System.out.println("Rendering Rectangle");
    }
}

public class WithoutVisitorPattern {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.calculateArea();
        circle.render();

        rectangle.calculateArea();
        rectangle.render();
    }
}

