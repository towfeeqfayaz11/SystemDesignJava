package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Problem;

// Mac Button
class MacButton implements Button {
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}

// Mac Checkbox
class MacCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }
}