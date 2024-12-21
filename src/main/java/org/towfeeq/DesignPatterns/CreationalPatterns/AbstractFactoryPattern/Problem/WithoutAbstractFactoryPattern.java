package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Problem;


// client code directly dependent on concrete classes (WindowsButton, WindowsCheckbox) and (MacButton, MacCheckbox)
// client code
public class WithoutAbstractFactoryPattern {
    public static void main(String[] args) {
        // Client code directly depends on concrete classes
        Button windowsButton = new WindowsButton();
        Checkbox windowsCheckbox = new WindowsCheckbox();
        windowsButton.render();
        windowsCheckbox.render();

        Button macButton = new MacButton();
        Checkbox macCheckbox = new MacCheckbox();
        macButton.render();
        macCheckbox.render();
    }
}
/*
Problems:
Tight Coupling: The client code is tightly coupled to specific classes (WindowsButton, MacButton, etc.).
Limited Extensibility: Adding a new platform requires changes in multiple parts of the client code.
Violation of OCP: Extending functionality requires modifying existing code.
*/