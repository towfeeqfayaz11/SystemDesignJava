package org.towfeeq.DesignPatterns.BehaviouralPatterns.InterpreterPattern.Solution;

/*
How It Works

1.Expression Tree Construction:
    The client builds a tree structure representing (5 + 3) * (2 - 1):
           Multiply
          /        \
     Add (5 + 3)  Subtract (2 - 1)

2.Evaluation
Each node evaluates itself recursively:
    - Add evaluates 5 + 3 to 8.
    - Subtract evaluates 2 - 1 to 1.
    - Multiply evaluates 8 * 1 to 8.


Extensibility
    This design allows us to:
        - Add new operations like division (Divide) by creating another class implementing Expression.
        - Support variables by extending Number to fetch values from a context (e.g., a Map).
*/

// Step 4: Create a Client to Build and Evaluate Expressions
public class WithInterpreterPattern {
    public static void main(String[] args) {
        // Create terminal expressions
        Expression number1 = new Number(5);
        Expression number2 = new Number(3);
        Expression number3 = new Number(2);
        Expression number4 = new Number(1);

        // Create non-terminal expressions
        Expression addition = new Add(number1, number2);        // (5 + 3)
        Expression subtraction = new Subtract(number3, number4); // (2 - 1)
        Expression multiplication = new Multiply(addition, subtraction); // (5 + 3) * (2 - 1)

        // Evaluate the expression
        System.out.println("Result: " + multiplication.interpret()); // Output: 8
    }
}
