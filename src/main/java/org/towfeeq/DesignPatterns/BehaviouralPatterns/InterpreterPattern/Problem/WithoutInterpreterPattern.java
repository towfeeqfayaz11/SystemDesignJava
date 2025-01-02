package org.towfeeq.DesignPatterns.BehaviouralPatterns.InterpreterPattern.Problem;

/*
Problem Without Interpreter
Problems:
    - Not extensible for new operators like * or /.
    - Hard to maintain or expand the grammar.

    Let's say we need to evaluate simple arithmetic expressions like 5 + 3 - 2. Without the
    Interpreter pattern, we'd have procedural logic like:
*/

class SimpleEvaluator {
    public int evaluate(String expression) {
        String[] tokens = expression.split(" ");
        int result = Integer.parseInt(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);

            if ("+".equals(operator)) {
                result += operand;
            } else if ("-".equals(operator)) {
                result -= operand;
            }
        }

        return result;
    }
}

public class WithoutInterpreterPattern {
    public static void main(String[] args) {
        SimpleEvaluator evaluator = new SimpleEvaluator();
        System.out.println(evaluator.evaluate("5 + 3 - 2")); // Output: 6
    }
}