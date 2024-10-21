package census;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is responsible for managing the census of inhabitants.
 */
public class CensusManager {

    private ArrayList<Inhabitant> inhabitantsCensus;

    /**
     * Constructor to initialize the census list.
     */
    public CensusManager() {
        inhabitantsCensus = new ArrayList<>();
    }

    /**
     * Method to load inhabitants from a CSV file.
     * The file should be in the format: name,surname1,surname2.
     * If the file doesn't exist or is empty, it creates the file with default data.
     */
    public void loadInhabitants() {
        File file = new File("census.csv");

        try {
            // Create the file if it does not exist
            if (!file.exists() || file.length() == 0) {
                createDefaultCensusFile(file);
            }

            Scanner sc = new Scanner(file);
            sc.useDelimiter(",|\n"); // Delimiter for CSV

            // Read each line and create an Inhabitant object
            while (sc.hasNext()) {
                String name = sc.next();
                String surname1 = sc.next();
                String surname2 = sc.next();
                Inhabitant inhabitant = new Inhabitant(name, surname1, surname2);
                inhabitantsCensus.add(inhabitant);
            }

            sc.close();
        } catch (IOException ex) {
            System.out.println("Error reading the census file: " + ex.getMessage());
        }
    }

    /**
     * Helper method to create a default CSV file with sample inhabitants.
     * @param file The file to create and populate.
     */
    private void createDefaultCensusFile(File file) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("John,Doe,Smith\n");
            writer.write("Jane,Doe,Johnson\n");
            writer.write("Alice,Johnson,White\n");
            writer.write("Bob,Brown,Taylor\n");
            writer.close();
            System.out.println("Created default census.csv file with sample data.");
        } catch (IOException ex) {
            System.out.println("Error creating default census file: " + ex.getMessage());
        }
    }

    /**
     * Get the list of inhabitants.
     * @return ArrayList of inhabitants in the census.
     */
    public ArrayList<Inhabitant> getInhabitants() {
        return inhabitantsCensus;
    }

    /**
     * Main method to demonstrate loading inhabitants from a CSV file.
     */
    public static void main(String[] args) {
        CensusManager manager = new CensusManager();
        manager.loadInhabitants();

        // Display the inhabitants
        for (Inhabitant inhabitant : manager.getInhabitants()) {
            System.out.println(inhabitant);
        }
    }
}
