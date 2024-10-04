public class IncrementDecrementOperators {

    public static void main(String[] args) {

        // 1. Introduction to Increment and Decrement Operators
        // The increment (++) and decrement (--) operators are used to increase or decrease
        // the value of a variable by 1.
        // - Increment: ++ increases the value by 1.
        // - Decrement: -- decreases the value by 1.
        // These operators can be applied in two ways:
        // a) Pre-Increment/Decrement: The operator is applied BEFORE the value is used.
        // b) Post-Increment/Decrement: The operator is applied AFTER the value is used.

        // 2. Post-Increment (variable++)
        // Explanation: In post-increment, the value is used FIRST, and then the variable is incremented.
        // The value that is used in an expression is the original value, and only after the expression is
        // evaluated, the variable is increased by 1.

        int x = 5;
        System.out.println("Post-Increment Example:");
        System.out.println("Initial value of x: " + x);   // Output: 5

        int postIncrement = x++;
        System.out.println("Value after post-increment (x++): " + postIncrement);  // Output: 5 (original value used)
        System.out.println("New value of x: " + x);  // Output: 6 (incremented after the value was used)

        // 3. Pre-Increment (++variable)
        // Explanation: In pre-increment, the value is incremented FIRST, and then the updated value
        // is used in the expression. The variable is increased before it is evaluated in any expression.

        x = 5;
        System.out.println("\nPre-Increment Example:");
        System.out.println("Initial value of x: " + x);   // Output: 5

        int preIncrement = ++x;
        System.out.println("Value after pre-increment (++x): " + preIncrement);  // Output: 6 (incremented first)
        System.out.println("New value of x: " + x);  // Output: 6 (value was incremented before use)

        // 4. Post-Decrement (variable--)
        // Explanation: In post-decrement, the value is used FIRST, and then the variable is decremented.
        // The value that is used in an expression is the original value, and only after the expression is
        // evaluated, the variable is decreased by 1.

        x = 5;
        System.out.println("\nPost-Decrement Example:");
        System.out.println("Initial value of x: " + x);   // Output: 5

        int postDecrement = x--;
        System.out.println("Value after post-decrement (x--): " + postDecrement);  // Output: 5 (original value used)
        System.out.println("New value of x: " + x);  // Output: 4 (decremented after the value was used)

        // 5. Pre-Decrement (--variable)
        // Explanation: In pre-decrement, the value is decremented FIRST, and then the updated value
        // is used in the expression. The variable is decreased before it is evaluated in any expression.

        x = 5;
        System.out.println("\nPre-Decrement Example:");
        System.out.println("Initial value of x: " + x);   // Output: 5

        int preDecrement = --x;
        System.out.println("Value after pre-decrement (--x): " + preDecrement);  // Output: 4 (decremented first)
        System.out.println("New value of x: " + x);  // Output: 4 (value was decremented before use)

        // 6. Combining Increment/Decrement in Expressions
        // Explanation: You can use pre- and post-increment/decrement operators inside larger expressions.
        // The difference between pre- and post- increment/decrement will affect the result of the expression.

        x = 5;
        int y = 10;
        System.out.println("\nCombining Increment/Decrement in Expressions:");

        // Post-increment in expression: value of x is used first, then x is incremented.
        int result1 = x++ + y;   // Equivalent to: result1 = 5 + 10, then x becomes 6
        System.out.println("Result with post-increment (x++ + y): " + result1);  // Output: 15
        System.out.println("New value of x: " + x);  // Output: 6

        // Pre-increment in expression: x is incremented first, then the new value is used.
        int result2 = ++x + y;   // Equivalent to: x becomes 7, then result2 = 7 + 10
        System.out.println("Result with pre-increment (++x + y): " + result2);  // Output: 17
        System.out.println("New value of x: " + x);  // Output: 7

        // 7. Summary
        // - Pre-increment (++variable) or pre-decrement (--variable) changes the value before the expression is evaluated.
        // - Post-increment (variable++) or post-decrement (variable--) changes the value after the expression is evaluated.
    }
}
