import java.util.Scanner;
import people.Person;

public class ConsoleLoaderNextLine {
    public Person loadPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, first surname, second surname, and age (separated by commas):");

        // Read the entire line of input
        String line = scanner.nextLine();
        // Split the line by commas and trim whitespace around each value
        String[] data = line.split("\\s*,\\s*");

        // Ensure there are exactly 4 elements (name, surname1, surname2, and age)
        if (data.length != 4) {
            System.out.println("Invalid input. Please provide exactly name, first surname, second surname, and age separated by commas.");
            return null;
        }

        String name = data[0].trim();
        String surname1 = data[1].trim();
        String surname2 = data[2].trim();
        int age;

        try {
            age = Integer.parseInt(data[3].trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age. Please enter a valid integer.");
            return null;
        }

        return new Person(name, surname1, surname2, age);
    }

    public static void main(String[] args) {
        ConsoleLoaderNextLine consoleLoader = new ConsoleLoaderNextLine ();
        Person person = consoleLoader.loadPerson();
        if (person != null) {
            System.out.println("Person loaded from console:");
            System.out.println(person); // This calls the overridden toString method in the Person class
        }
    }
}
