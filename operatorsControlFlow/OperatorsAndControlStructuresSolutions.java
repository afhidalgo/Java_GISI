import java.util.Scanner;  // To accept user input for some exercises

public class OperatorsAndControlStructuresSolutions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner object to take user input

        // 1. Arithmetic Operators
        // Theory: Arithmetic operators in Java are used to perform basic mathematical operations. These include:
        // + (addition), - (subtraction), * (multiplication), / (division), and % (modulus, which returns the remainder).
        // These operators work with primitive data types such as int, double, and float.
        System.out.println("---- Arithmetic Operators ----");
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        // EXERCISE 1: Simple - Ask the user for two numbers and perform all arithmetic operations on them.
        System.out.println("\nExercise 1: Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));

        // EXERCISE 2: Challenging - Create a calculator where the user inputs an operation (+, -, *, /, %) and two numbers. 
        System.out.println("\nExercise 2: Calculator");
        System.out.println("Enter an operation (+, -, *, /, %): ");
        char operation = scanner.next().charAt(0);
        System.out.println("Enter two numbers:");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        switch (operation) {
            case '+':
                System.out.println("Result: " + (number1 + number2));
                break;
            case '-':
                System.out.println("Result: " + (number1 - number2));
                break;
            case '*':
                System.out.println("Result: " + (number1 * number2));
                break;
            case '/':
                System.out.println("Result: " + (number1 / number2));
                break;
            case '%':
                System.out.println("Result: " + (number1 % number2));
                break;
            default:
                System.out.println("Invalid operation!");
        }

        // 2. Relational Operators
        // Theory: Relational operators are used to compare two values. They return a boolean (true/false).
        // Common relational operators include:
        // > (greater than), < (less than), == (equal to), != (not equal to), >= (greater than or equal to), <= (less than or equal to).
        System.out.println("\n---- Relational Operators ----");
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to

        // EXERCISE 3: Simple - Ask the user for two numbers and compare them using relational operators (>, <, ==, !=).
        System.out.println("\nExercise 3: Enter two numbers to compare:");
        int compare1 = scanner.nextInt();
        int compare2 = scanner.nextInt();
        System.out.println(compare1 + " > " + compare2 + ": " + (compare1 > compare2));
        System.out.println(compare1 + " < " + compare2 + ": " + (compare1 < compare2));
        System.out.println(compare1 + " == " + compare2 + ": " + (compare1 == compare2));
        System.out.println(compare1 + " != " + compare2 + ": " + (compare1 != compare2));

        // EXERCISE 4: Challenging - Given a person's age, check if they are eligible to vote (age >= 18) and compare it with the legal drinking age (age >= 21).
        System.out.println("\nExercise 4: Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Eligible to vote (>=18): " + (age >= 18));
        System.out.println("Eligible to drink (>=21): " + (age >= 21));

        // 3. Logical Operators
        // Theory: Logical operators are used to perform "logical" operations on boolean values. The common logical operators are:
        // && (AND), || (OR), and ! (NOT).
        // - AND (`&&`) returns true if both conditions are true.
        // - OR (`||`) returns true if at least one condition is true.
        // - NOT (`!`) reverses the boolean value.
        System.out.println("\n---- Logical Operators ----");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        // EXERCISE 5: Simple - Ask the user for two boolean values and apply logical AND, OR, and NOT.
        System.out.println("\nExercise 5: Enter two boolean values (true/false):");
        boolean bool1 = scanner.nextBoolean();
        boolean bool2 = scanner.nextBoolean();
        System.out.println("bool1 && bool2: " + (bool1 && bool2));
        System.out.println("bool1 || bool2: " + (bool1 || bool2));
        System.out.println("!bool1: " + (!bool1));

        // EXERCISE 6: Challenging - Write a program to check if a number is between 1 and 100 using logical operators.
        System.out.println("\nExercise 6: Enter a number to check if it is between 1 and 100:");
        int checkNumber = scanner.nextInt();
        System.out.println("Is the number between 1 and 100? " + (checkNumber > 1 && checkNumber < 100));

        // 4. Conditional Control: if-else
        // Theory: `if-else` statements are used to execute certain code only if a condition is true. If the condition is false, the code in the `else` block (if present) will run.
        // - Syntax: `if (condition) { /* code if true */ } else { /* code if false */ }`
        // - You can also chain conditions using `else if`.
        System.out.println("\n---- Conditional Control: if-else ----");
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // EXERCISE 7: Simple - Ask the user for their age and print whether they are a minor or an adult.
        System.out.println("\nExercise 7: Enter your age:");
        int userAge = scanner.nextInt();
        if (userAge >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // EXERCISE 8: Challenging - Given the user's age, print a different message if they are a teenager (age 13-19), adult (20-64), or senior (65+).
        System.out.println("\nExercise 8: Enter your age:");
        int newAge = scanner.nextInt();
        if (newAge >= 13 && newAge <= 19) {
            System.out.println("You are a teenager.");
        } else if (newAge >= 20 && newAge <= 64) {
            System.out.println("You are an adult.");
        } else if (newAge >= 65) {
            System.out.println("You are a senior.");
        } else {
            System.out.println("You are a child.");
        }

        // 5. Loops: for
        // Theory: `for` loops are used to repeatedly execute a block of code for a known number of iterations.
        // Syntax: `for (initialization; condition; update) { /* code to run */ }`
        // The loop continues to run as long as the condition is true.
        System.out.println("\n---- Loops: for ----");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // EXERCISE 9: Simple - Write a for loop that prints numbers from 1 to 10.
        System.out.println("\nExercise 9: Numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // EXERCISE 10: Challenging - Write a for loop that prints all even numbers from 1 to 100.
        System.out.println("\nExercise 10: Even numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 6. Loops: while
        // Theory: `while` loops execute a block of code as long as the specified condition is true.
        // - Syntax: `while (condition) { /* code to run */ }`
        // The loop will continue until the condition becomes false.
        System.out.println("\n---- Loops: while ----");
        int counter = 5;
        while (counter > 0) {
            System.out.println("Counter = " + counter);
            counter--;
        }

        // EXERCISE 11: Simple - Use a while loop to print numbers from 10 to 1.
        System.out.println("\nExercise 11: Numbers from 10 to 1:");
        int countDown = 10;
        while (countDown > 0) {
            System.out.println(countDown);
            countDown--;
        }

        // EXERCISE 12: Challenging - Use a while loop to ask the user for a number and stop if the number is negative.
        System.out.println("\nExercise 12: Enter positive numbers (stop with a negative number):");
        int userInput = scanner.nextInt();
        while (userInput >= 0) {
            System.out.println("You entered: " + userInput);
            userInput = scanner.nextInt();
        }
        System.out.println("You entered a negative number. Program stopped.");

        scanner.close();
    }
}
