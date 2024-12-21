package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Solution;

public class LinuxFactory implements GUIFactory {
    public Button createButton() {
        return new LinuxButton();
    }

    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}

