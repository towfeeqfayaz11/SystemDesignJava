package org.towfeeq.DesignPatterns.BehaviouralPatterns.InterpreterPattern.Solution;

// Step 2: Implement Terminal Expressions
class Number implements Expression {
    private int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}

