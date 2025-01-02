package org.towfeeq.DesignPatterns.BehaviouralPatterns.VisitorPattern.Solution;

// 1. Define the Visitor Interface
interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}

// 2. Implement Concrete Visitors
class AreaCalculator implements Visitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Circle Area: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle Area: " + area);
    }
}
class Renderer implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Rendering Circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Rendering Rectangle");
    }
}


// 3. Define the Element Interface
interface Shape {
    void accept(Visitor visitor);
}


// 4. Implement Concrete Elements
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class Rectangle implements Shape {
    private double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}


// 5. Use the Visitor Pattern

public class WithVisitorPattern {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        Visitor areaCalculator = new AreaCalculator();
        Visitor renderer = new Renderer();

        circle.accept(areaCalculator);
        circle.accept(renderer);

        rectangle.accept(areaCalculator);
        rectangle.accept(renderer);
    }
}
