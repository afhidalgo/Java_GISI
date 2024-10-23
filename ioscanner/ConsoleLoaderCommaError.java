import java.util.Scanner;
import people.Person;

public class ConsoleLoaderComma {
    public Person loadPerson() {
        Scanner scanner = new Scanner(System.in);
        // Set the delimiter to a comma and optional whitespace around it
        scanner.useDelimiter(", | \n");
        System.out.println("Enter name, first surname, second surname, and age (separated by commas):");

        try {
            // Read each value using the scanner's delimiter
            String name = scanner.next();
            String surname1 = scanner.next();
            String surname2 = scanner.next();
            int age = scanner.nextInt();//Integer.parseInt(scanner.next());

            // Close the scanner after use
            scanner.close();

            return new Person(name, surname1, surname2, age);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter name, first surname, second surname, and age separated by commas.");
            return null;
        }
    }

    public static void main(String[] args) {
        ConsoleLoaderComma consoleLoader = new ConsoleLoaderComma();
        Person person = consoleLoader.loadPerson();
        if (person != null) {
            System.out.println("Person loaded from console:");
            System.out.println(person); // Assuming `Person` class has a meaningful `toString` method
        }
    }
}
