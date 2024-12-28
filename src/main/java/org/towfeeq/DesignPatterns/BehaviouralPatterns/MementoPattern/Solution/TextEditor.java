package org.towfeeq.DesignPatterns.BehaviouralPatterns.MementoPattern.Solution;

// Originator class
public class TextEditor {
    private String text;

    public void setText(String newText) {
        text = newText;
    }

    public String getText() {
        return text;
    }

    // Save current state to Memento
    public TextEditorMemento save() {
        return new TextEditorMemento(text);
    }

    // Restore state from Memento
    public void restore(TextEditorMemento memento) {
        text = memento.getState();
    }
}
