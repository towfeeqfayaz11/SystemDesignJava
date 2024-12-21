package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Solution;

// Step 4: Concrete Factories
// Mac Factory
public class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
