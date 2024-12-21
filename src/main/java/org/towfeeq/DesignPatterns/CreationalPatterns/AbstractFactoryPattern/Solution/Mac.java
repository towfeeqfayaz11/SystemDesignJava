package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Solution;

//Step 2: Concrete Products

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