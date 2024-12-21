package org.towfeeq.DesignPatterns.CreationalPatterns.AbstractFactoryPattern.Solution;

class LinuxButton implements Button {
    public void render() {
        System.out.println("Rendering Linux Button");
    }
}

class LinuxCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering Linux Checkbox");
    }
}

