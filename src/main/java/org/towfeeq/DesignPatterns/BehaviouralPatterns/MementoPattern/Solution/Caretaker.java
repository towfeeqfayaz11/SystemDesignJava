package org.towfeeq.DesignPatterns.BehaviouralPatterns.MementoPattern.Solution;

import java.util.Stack;

// Caretaker class: manages mementos (snapshots of the TextEditor state)
public class Caretaker {
    private final Stack<TextEditorMemento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    public TextEditorMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
