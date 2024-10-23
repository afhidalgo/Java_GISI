import java.util.Scanner;
import people.Person;

public class ConsoleLoaderComma {
    public Person loadPerson() {
        Scanner scanner = new Scanner(System.in);
        // Set the delimiter to a comma and optional whitespace around it
        //scanner.useDelimiter("-");
        System.out.println("Enter name, first surname, second surname, and age (separated by spaces):");

        try {
            // Read and store each value using the scanner's comma delimiter
            if (scanner.hasNext()) {
                String name = scanner.next();
                String surname1 = scanner.next();
                String surname2 = scanner.next();
                String ageStr = scanner.next();
                //int age = scanner.nextInt();

                // Check if we have exactly four values, and no more
                if (scanner.hasNext()) {
                    System.out.println("Too many parameters. Please provide exactly name, first surname, second surname, and age.");
                    return null;
                }

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
            } else {
                System.out.println("No input detected.");
                return null;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter name, first surname, second surname, and age separated by commas.");
            return null;
        } finally {
            scanner.close(); // Make sure to close the scanner
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
