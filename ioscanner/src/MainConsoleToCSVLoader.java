import java.io.FileWriter;
import java.io.IOException;
import people.Person;

public class MainConsoleToCSVLoader {
    public Person loadPersonAndSaveToCSV(String name, String surname1, String surname2, int age, String filePath) {
        Person person = new Person(name, surname1, surname2, age);

        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(name + "," + surname1 + "," + surname2 + "," + age + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        return person;
    }

    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Usage: java MainConsoleToCSVLoader <name> <surname1> <surname2> <age> <filePath>");
            return;
        }

        String name = args[0];
        String surname1 = args[1];
        String surname2 = args[2];
        int age = Integer.parseInt(args[3]);
        String filePath = args[4];

        MainConsoleToCSVLoader loader = new MainConsoleToCSVLoader();
        Person person = loader.loadPersonAndSaveToCSV(name, surname1, surname2, age, filePath);
        System.out.println("Person loaded from args and saved to CSV:");
        System.out.println(person); // Assuming `Person` class has a meaningful `toString` method
    }
}
