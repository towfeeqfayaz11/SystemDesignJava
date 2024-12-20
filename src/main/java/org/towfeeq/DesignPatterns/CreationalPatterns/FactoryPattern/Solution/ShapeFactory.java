package org.towfeeq.DesignPatterns.CreationalPatterns.FactoryPattern.Solution;

// Step 3: ShapeFactory Class
public class ShapeFactory {
    // Factory Method to return Shape objects
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;  // Default case
    }
}
