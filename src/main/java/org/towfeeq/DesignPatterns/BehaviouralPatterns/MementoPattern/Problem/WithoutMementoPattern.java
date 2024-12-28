package org.towfeeq.DesignPatterns.BehaviouralPatterns.MementoPattern.Problem;

public class WithoutMementoPattern {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Initial text
        editor.setText("Hello World!");
        System.out.println("Current Text: " + editor.getText());

        // Modify text
        editor.setText("Hello Design Patterns!");
        System.out.println("Updated Text: " + editor.getText());

        // Oops! No way to undo the previous change
    }
}

/*
you have a TextEditor class where the user can update text, but there is no way to undo the changes.
*/