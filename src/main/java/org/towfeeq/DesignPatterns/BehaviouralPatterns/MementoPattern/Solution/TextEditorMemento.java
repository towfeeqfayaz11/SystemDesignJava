package org.towfeeq.DesignPatterns.BehaviouralPatterns.MementoPattern.Solution;


// memento class: store the internal state of the text editor
public class TextEditorMemento {
    // state for a specific memento instance is not going to change of a given snapshot
    private final String state;

    public TextEditorMemento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
