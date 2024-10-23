import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import people.Person;

public class ConsoleToCSVLoader {
    public Person loadPersonAndSaveToCSV(String filePath) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter first surname:");
        String surname1 = scanner.nextLine();
        System.out.println("Enter second surname:");
        String surname2 = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        Person person = new Person(name, surname1, surname2, age);

        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(name + "," + surname1 + "," + surname2 + "," + age + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        return person;
    }

    public static void main(String[] args) {
        ConsoleToCSVLoader consoleToCSVLoader = new ConsoleToCSVLoader();
        Person person = consoleToCSVLoader.loadPersonAndSaveToCSV("new.csv"); // Adjust file path as needed
        System.out.println("Person loaded from console and saved to CSV:");
        System.out.println(person); // Assuming `Person` class has a meaningful `toString` method
    }
}
