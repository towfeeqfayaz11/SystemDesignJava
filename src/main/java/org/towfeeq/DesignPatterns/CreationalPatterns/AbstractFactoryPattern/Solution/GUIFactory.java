package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Solution;

//Step 3: Abstract Factory Interface
// Abstract Factory Interface
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
