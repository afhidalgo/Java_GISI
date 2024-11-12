import java.util.ArrayList;

public class PersonManager {
    private ArrayList<Person> people;

    // Constructor to initialize the ArrayList
    public PersonManager() {
        people = new ArrayList<>();
    }

    // Method to add a Person to the ArrayList
    public void addPerson(Person person) {
        people.add(person);
    }

    // Method to remove a Person by object (requires equals method in Person class)
    public void removePerson(Person person) {
        if (people.remove(person)) {
            System.out.println(person + " was removed from the list.");
        } else {
            System.out.println(person + " was not found in the list.");
        }
    }

    // Method to display all Persons in the ArrayList
    public void displayPeople() {
        System.out.println("People in the list:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
