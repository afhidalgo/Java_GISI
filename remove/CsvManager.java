import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvManager {

    // Method to create an initial CSV file with some data
    public static void createInitialFile(String csvFile) throws IOException {
        FileWriter writer = new FileWriter(csvFile);
        writer.write("Juan,30\n");
        writer.write("Ana,25\n");
        writer.write("Luis,40\n");
        writer.close();
        System.out.println("Initial file created with data.");
    }

    // Method to remove a person by name and ID from the CSV file
    public static void removePerson(String name, int id, String csvFile) throws IOException {
        File inputFile = new File(csvFile);
        File tempFile = new File("temp.csv");

        // Use Scanner to read the input file line by line
        Scanner scanner = new Scanner(inputFile);
        FileWriter writer = new FileWriter(tempFile);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(",");
            String currentName = data[0];
            int currentId = Integer.parseInt(data[1]);

            // If the line does not match the person to remove, write it to the temp file
            if (!currentName.equals(name) || currentId != id) {
                writer.write(line + "\n");
            }
        }

        // Close the scanner and writer
        scanner.close();
        writer.close();

        // Replace the original file with the temp file
        if (inputFile.delete()) {
            tempFile.renameTo(inputFile);
            System.out.println("Person removed successfully.");
        } else {
            System.out.println("Could not delete the original file.");
        }
    }

    public static void main(String[] args) {
        String csvFile = "persons.csv";

        try {
            // Create the initial file with data
            createInitialFile(csvFile);

            // Remove "Juan" with ID 30 from the file
            removePerson("Juan", 30, csvFile);

            System.out.println("Operation completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
