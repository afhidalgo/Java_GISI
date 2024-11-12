public class Main {
    public static void main(String[] args) {
        // Create an instance of PersonManager
        PersonManager manager = new PersonManager();

        // Create some Person objects
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 40);

        Person person = new Person("Alice2", 25);
        System.out.println("Printing getClass output:" + person.getClass().getName()); // Output: Person


        // Add persons to the manager
        manager.addPerson(person1);
        manager.addPerson(person2);
        manager.addPerson(person3);

        // Display all persons
        manager.displayPeople();

        // Remove a person by object
        manager.removePerson(person2); // Remove Bob

        // Display all persons after removal
        manager.displayPeople();
    }
}
