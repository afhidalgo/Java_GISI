import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import people.Person;

public class ConsoleToCSVLoaderNextLine {
    public Person loadPersonAndSaveToCSV(String filePath) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, first surname, second surname, and age (separated by commas):");

        // Read the entire line
        String line = scanner.nextLine();
        // Split the line by commas
        String[] data = line.split("\\s*,\\s*");

        // Ensure there are exactly 4 elements
        if (data.length != 4) {
            System.out.println("Invalid input. Please enter the details in the format: name, surname1, surname2, age");
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

        Person person = new Person(name, surname1, surname2, age);

        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(name + "," + surname1 + "," + surname2 + "," + age + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        return person;
    }

    public static void main(String[] args) {
        ConsoleToCSVLoaderNextLine consoleToCSVLoader = new ConsoleToCSVLoaderNextLine();
        Person person = consoleToCSVLoader.loadPersonAndSaveToCSV("new.csv"); // Adjust file path as needed
        if (person != null) {
            System.out.println("Person loaded from console and saved to CSV:");
            System.out.println(person); // Assuming `Person` class has a meaningful `toString` method
        }
    }
}
