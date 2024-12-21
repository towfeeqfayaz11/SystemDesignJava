package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Solution;

//Step 2: Concrete Products
// Windows Button
class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}
// Windows Checkbox
class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}