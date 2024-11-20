package principal;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Person> contacts;
    private final String filePath = "contacts.csv";

    public AddressBook() {
        contacts = new ArrayList<>();
        loadContacts();
    }

    private void loadContacts() {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                if (data.length == 3) {
                    contacts.add(new Person(data[0], data[1], data[2]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Starting with an empty address book.");
        }
    }

    private void saveContacts() {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Person person : contacts) {
                writer.write(person.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    public void addContact(Person person) {
        if (!contacts.contains(person)) {
            contacts.add(person);
            saveContacts();
        } else {
            System.out.println("Contact already exists: " + person.getName());
        }
    }

    public void removeContact(String name) {
        // Create a target person with just the name to remove
        ....
    }

public void modifyContact(String name, String newName, String newPhoneNumber, String newEmail) {
    Person target = new Person(name, "", ""); // Create a temporary Person object to search by name
    int index = contacts.indexOf(target);

    //Update attributes
    while(index != -1){
	    Person person = contacts.get(index);
	    if (newName != null && !newName.isEmpty()) person.setName(newName);
            if (newPhoneNumber != null && !newPhoneNumber.isEmpty()) person.setPhoneNumer(newPhoneNumber);
	    if(newEmail != null && !newEmail.isEmpty()) person.setEmail(newEmail);

	   saveContacts(); //save chnages to the file
	   System.out.println("Contac updated successfully");
    } else {
	   System.out.println("Contact not found");
    } 


}


public void displayContacts() {
    for (Person person : contacts) {
        System.out.println("Name: " + person.getName() + 
                           ", Phone: " + person.getPhoneNumber() + 
                           ", Email: " + person.getEmail());
    }
}
}
