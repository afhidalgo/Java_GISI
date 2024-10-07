import java.util.ArrayList;
import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Number");
            System.out.println("2. Calculate Sum");
            System.out.println("3. Calculate Average");
            System.out.println("4. Find Maximum");
            System.out.println("5. Find Minimum");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    numbers.add(number);
                    System.out.println(number + " added to the list.");
                    break;
                case 2:
                    System.out.println("Sum: " + calculateSum(numbers));
                    break;
                case 3:
                    System.out.println("Average: " + calculateAverage(numbers));
                    break;
                case 4:
                    System.out.println("Maximum: " + findMax(numbers));
                    break;
                case 5:
                    System.out.println("Minimum: " + findMin(numbers));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double calculateAverage(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        return (double) calculateSum(numbers) / numbers.size();
    }

    public static int findMax(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Integer.MIN_VALUE;  // Return the smallest possible value for empty lists
        }
        int max = numbers.get(0);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int findMin(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Integer.MAX_VALUE;  // Return the largest possible value for empty lists
        }
        int min = numbers.get(0);
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
