public class Person {
    private String name;      // Private attribute
    private Address address;  // Private attribute

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for address
    public Address getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(Address address) {
        this.address = address;
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person();
        
        // Create an Address object and set it to the person
        Address addr = new Address();
        addr.setCity("Madrid");
        person.setAddress(addr);

        // Set the name of the person
        person.setName("Carlos");

        // Print the values using getters
        System.out.println("Nombre: " + person.getName());
        System.out.println("Ciudad: " + person.getAddress().getCity());
    }
}

