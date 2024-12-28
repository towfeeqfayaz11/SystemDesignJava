package org.towfeeq.DesignPatterns.BehaviouralPatterns.MementoPattern.Solution;

public class WithMementoPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Initial text
        editor.setText("Hello World!");
        caretaker.saveState(editor);
        System.out.println("Current Text: " + editor.getText());

        // Modify text
        editor.setText("Hello Design Patterns!");
        caretaker.saveState(editor);
        System.out.println("Updated Text: " + editor.getText());

        // Undo
        editor.restore(caretaker.undo());
        System.out.println("After Undo: " + editor.getText());

        // Undo again
        editor.restore(caretaker.undo());
        System.out.println("After Undo: " + editor.getText());
    }
}

/*
Problem: How to provide undo/redo functionality or state restoration without
         exposing the object's internal state and breaking encapsulation

Solution: The Memento pattern captures the internal state of an object in memento, allowing
          the object to restore its state later on without revealing internal details
*/