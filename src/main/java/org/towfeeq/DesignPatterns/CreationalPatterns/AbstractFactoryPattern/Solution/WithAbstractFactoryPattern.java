package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Solution;


// Step 5: Client Code
// client code
public class WithAbstractFactoryPattern {
    private static void renderUI(GUIFactory factory) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        // Windows UI
        GUIFactory windowsFactory = new WindowsFactory();
        renderUI(windowsFactory);

        // Mac UI
        GUIFactory macFactory = new MacFactory();
        renderUI(macFactory);

        // Linux UI
        GUIFactory linuxFactory = new LinuxFactory();
        renderUI(linuxFactory);
    }
}

/*
How It Works:
The Abstract Factory Interface (GUIFactory) defines methods to create related objects (Button and Checkbox).
Concrete Factories (WindowsFactory, MacFactory) implement the interface to produce platform-specific objects.
The Client Code (WithAbstractFactoryPattern) uses the Factory to create objects without depending on their concrete implementations.


Benefits of Abstract Factory Pattern
Loose Coupling: The client code is decoupled from concrete classes.
Extensibility: Adding a new family (e.g., Linux) requires only adding a new Factory and corresponding products.
Consistency: Ensures that related objects are compatible with each other.
Centralized Control: Encapsulates object creation logic in one place.

*/