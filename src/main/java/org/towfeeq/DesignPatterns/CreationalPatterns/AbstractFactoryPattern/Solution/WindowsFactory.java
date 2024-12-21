package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Solution;

// Step 4: Concrete Factories
// Windows Factory
public class WindowsFactory implements GUIFactory{
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
