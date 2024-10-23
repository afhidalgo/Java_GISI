import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import people.Person;

public class CSVLoader {
    public ArrayList<Person> loadPersonsFromCSV(String filePath) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(new File(filePath))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 4) {
                    String name = data[0];
                    String surname1 = data[1];
                    String surname2 = data[2];
                    int age = Integer.parseInt(data[3]);

                    Person person = new Person(name, surname1, surname2, age);
                    persons.add(person);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return persons;
    }

    public static void main(String[] args) {
        CSVLoader csvLoader = new CSVLoader();
        ArrayList<Person> persons = csvLoader.loadPersonsFromCSV("old.csv"); // Adjust file path as needed
        System.out.println("Persons loaded from CSV:");
        for (Person person : persons) {
            System.out.println(person); // Assuming `Person` class has a meaningful `toString` method
        }
    }
}
