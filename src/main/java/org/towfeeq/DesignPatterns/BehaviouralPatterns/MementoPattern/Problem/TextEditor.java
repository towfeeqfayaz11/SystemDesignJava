package org.towfeeq.DesignPatterns.BehaviouralPatterns.MementoPattern.Problem;

/*
A text editor where the user can undo changes such as text addition, deletion, formatting.
The editor stores snapshots of its state (text content) after each change, enabling the
user to revert to previous states.
*/
public class TextEditor {
    private String text;

    public void setText(String newText) {
        text = newText;
    }

    public String getText() {
        return text;
    }
}
