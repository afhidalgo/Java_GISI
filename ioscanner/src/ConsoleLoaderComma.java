import java.util.Scanner;
import people.Person;

public class ConsoleLoaderComma {
    public Person loadPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, first surname, second surname, and age (separated by spaces):");
        scanner.useDelimiter("\\s*,\\s* |\n");
        try {
            // Read the values using scanner.next()
            String name = scanner.next();
            String surname1 = scanner.next();
            String surname2 = scanner.next();
            String ageStr = scanner.next();

            // Close the scanner immediately after reading the necessary parameters
            scanner.close();

            // Parse the age value
            int age;
            try {
                age = Integer.parseInt(ageStr.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Please enter a valid integer.");
                return null;
            }

            // Return the created Person object
            return new Person(name.trim(), surname1.trim(), surname2.trim(), age);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter name, first surname, second surname, and age separated by spaces.");
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
