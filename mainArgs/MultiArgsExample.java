public class MultiArgsExample {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide at least two arguments: a name and two numbers.");
            return;
        }

        // First argument: user's name
        String name = args[0];
        greet(name);

        // Second and third arguments: two numbers
        try {
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);
            int sum = addNumbers(num1, num2);
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            // Optional: if a third number is provided, print it
            if (args.length > 3) {
                System.out.println("Additional argument provided: " + args[3]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid numbers for the second and third arguments.");
        }
    }

    // Method to greet the user
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
}
