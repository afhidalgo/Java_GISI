import domain.*;
import principal.*;
public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        // Adding contacts
        addressBook.addContact(new Person("John Doe", "123456789", "john@example.com"));
        addressBook.addContact(new Person("Jane Smith", "987654321", "jane.smith@example.com"));

        // Displaying contacts
        System.out.println("Contacts:");
        addressBook.displayContacts();

        // Modifying a contact (only email)
        System.out.println("\nModifying John Doe's email...");
        addressBook.modifyContact("John Doe", null, null, "john.doe@newdomain.com");

        // Modifying a contact (name and phone)
        System.out.println("\nModifying Jane Smith's name and phone...");
        addressBook.modifyContact("Jane Smith", "Janet Smith", "555555555", null);

        // Displaying contacts after modifications
        System.out.println("\nContacts after modifications:");
        addressBook.displayContacts();
    }
}
